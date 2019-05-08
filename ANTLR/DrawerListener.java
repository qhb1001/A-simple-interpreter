import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

@SuppressWarnings({"deprecation"})
class DrawerListener extends DrawGraphBaseListener {

    BaseUI    theUI       =null;
    
    public DrawerListener()
    {
    }
    
    public void setUI(BaseUI ui)
    {
        theUI = ui;        
    }

    ParseTreeProperty<Double> values = new ParseTreeProperty<Double>();
    Map<String, Double> memory = new HashMap<String, Double>();

    void setValue(ParseTree node, double value) {
        values.put(node, value);
    }
    double getValue(ParseTree node) {
        return values.get(node);
    }
    private double valueOfT =0; // 循环变量 T 的值
    private double originX =0; // 坐标平移参数
    private double originY =0; 
    private double scaleX  =1;  // 横向缩放因子
    private double scaleY  =1;  // 纵向缩放因子
    private double rotate  =0;  // 旋转角度
    private UiPixelAttrib  pixelAttrib = new UiPixelAttrib();
    @Override
    public void exitOriginStatement(DrawGraphParser.OriginStatementContext ctx) {
        originX = getValue(ctx.expr(0));
        originY = getValue(ctx.expr(1));
    }

    @Override
    public void exitScaleStatement(DrawGraphParser.ScaleStatementContext ctx) {
        scaleX = getValue(ctx.expr(0));
        scaleY = getValue(ctx.expr(1));
    }

    @Override 
    public void exitRotStatement(DrawGraphParser.RotStatementContext ctx) {
        rotate = getValue(ctx.expr());
    }

    @Override public void exitForStatement(DrawGraphParser.ForStatementContext ctx) {
        if(pixelAttrib == null) pixelAttrib = new UiPixelAttrib();
	    double Tbegin = getValue( ctx.expr(0));
	    double Tend   = getValue( ctx.expr(1));
	    double Tstep  = getValue( ctx.expr(2));

        ParseTreeWalker walker = new ParseTreeWalker(); //用于多次遍历子树
	    for(valueOfT = Tbegin; valueOfT <Tend; valueOfT += Tstep)
	    {	        
            walker.walk(this , ctx.expr(3));      // 遍历子树，获得当前的逻辑坐标
			double x = getValue( ctx.expr(3) );
            walker.walk(this , ctx.expr(4));
			double y = getValue( ctx.expr(4) );

			x *= scaleX; y *= scaleY;           // 先比例变换
			double tmp;
			tmp = x*Math.cos(rotate) + y*Math.sin(rotate); // 再旋转变换
			y = y*Math.cos(rotate)-x*Math.sin(rotate);
			x = tmp;
			x+=originX; y+=originY;             // 最后平移变换
			theUI.drawPixel(x, y, pixelAttrib);
			
        //  theUI.showMessage("*** PIXEL at (" + x + ", " + y + ")");
	    }
    }

    @Override
    public void exitPowerExpr(DrawGraphParser.PowerExprContext ctx) {
        double L = getValue(ctx.expr(0));
        double R = getValue(ctx.expr(1));
        double value = Math.pow(L, R);
        setValue(ctx, value);
    }

    @Override
    public void exitMulDivExpr(DrawGraphParser.MulDivExprContext ctx) {
        double left = getValue(ctx.expr(0));
        double right = getValue(ctx.expr(1));
        double value = 0;
        if (ctx.MUL() != null) value = left * right;
        else value = left / right;
        setValue(ctx, value);
    }

    @Override
    public void exitVarT(DrawGraphParser.VarTContext ctx) {
        setValue(ctx, valueOfT);
    }
    
    @Override 
    public void exitConst(DrawGraphParser.ConstContext ctx) {
	    Token tk = ctx.CONST_ID().getSymbol();    // 获得记号对象
	    String vName = tk.getText().toLowerCase();// 获得记号对象的文本并转换为小写字母
	    double value = 0;
	    
	    if(vName.equals("pi")) value = Math.PI; //3.1415926
	    else if(vName.equals("e")) value = Math.E; //2.7182818284
	    else {
	        try {
	           value = Double.valueOf(vName);
	        } catch(Exception e) {
	            theUI.showMessage("error " + tk.getLine() + ":" 
	               + tk.getCharPositionInLine()
	               + "  不支持的常量名 '" + vName  +"'" );
	            value = 0;
	        }
	    }

	    setValue(ctx, value);
    }

    @Override 
    public void exitPlusMinusExpr(DrawGraphParser.PlusMinusExprContext ctx) {
        double left = getValue(ctx.expr(0));
        double right = getValue(ctx.expr(1));
        double value = 0;
        if (ctx.PLUS() != null) value = left + right;
        else value = left - right;
        setValue(ctx, value);
    }

    @Override
    public void exitNestedExpr(DrawGraphParser.NestedExprContext ctx) {
        setValue(ctx, getValue(ctx.expr()));
    }

    @Override
    public void exitUnaryExpr(DrawGraphParser.UnaryExprContext ctx) {
        double value = getValue(ctx.expr());
        if (ctx.PLUS() == null) value = -value;
        setValue(ctx, value);
    }

    @Override
    public void exitFuncExpr(DrawGraphParser.FuncExprContext ctx) {
        Token id = ctx.ID().getSymbol();
	    String funcName = id.getText().toLowerCase();
	    double value = 0;
	    double param = getValue(ctx.expr());  // 函数调用的参数值
	    if(funcName.equals("sin")) value = Math.sin(param);
	    else if(funcName.equals("cos")) value = Math.cos(param);
	    else if(funcName.equals("tan")) value = Math.tan(param);
	    else {
	        theUI.showMessage("error " + id.getLine() + ":" 
	               + id.getCharPositionInLine()
	               + "  不支持的函数名 '" + funcName  +"'" );
	    }
	    setValue(ctx, value);
    }

    @Override
    public void exitColorStatement(DrawGraphParser.ColorStatementContext ctx) {
        TerminalNode node = ctx.RED();
	    if(node != null) {
	        pixelAttrib = new UiPixelAttrib(255, 0, 0);
	        return;
	    }
	    
	    node = ctx.GREEN();
	    if(node != null) {
	        pixelAttrib = new UiPixelAttrib(0, 255, 0);
	        return;
	    }
	    node = ctx.BLUE();
	    if(node != null) {
	        pixelAttrib = new UiPixelAttrib(0, 0, 255);
	        return;
	    }
	    
	    double r = getValue( ctx.expr(0) );
	    double g = getValue( ctx.expr(1) );
	    double b = getValue( ctx.expr(2) );
    	    
  	    pixelAttrib = new UiPixelAttrib(r, g, b);
    }

    @Override
    public void exitAssign(DrawGraphParser.AssignContext ctx) {
        String id = ctx.ID().getText();  // id is left-hand side of '='
        double value = getValue(ctx.expr());  
        memory.put(id, value);           // store it in our memory
        setValue(ctx, value);
    }

    @Override 
    public void exitVarExpr(DrawGraphParser.VarExprContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) )
            setValue(ctx, memory.get(id));
        else {
            theUI.showMessage("不存在变量" + id);
        }
	}

    @Override
    public void visitErrorNode(ErrorNode node) {}
}