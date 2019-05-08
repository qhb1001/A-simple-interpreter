import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
public class BackEnd {
    protected ParseTree tree = null;
    protected BaseUI theUI = null;
    public BackEnd(ParseTree t, BaseUI ui) {
        tree = t; 
        theUI = ui;
    }
    public void run() {
        ParseTreeWalker walker = new ParseTreeWalker();
        DrawerListener eval = new DrawerListener();
        eval.setUI(theUI);
        walker.walk(eval, tree);
    }
}