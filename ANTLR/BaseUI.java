// for JDK
import java.awt.*;
import javax.swing.*;


interface ui_ops {
	
	public void reportError(String msg);
	
	public void showMessage(String msg);

	public void drawPixel(double x, double y, UiPixelAttrib pa);

    public void setTree(org.antlr.v4.runtime.tree.ParseTree tree, String[] ruleNames);

    public void beginPaint();

    public void endPaint(boolean noError);
}
/**
 * 有最简单界面的主程序。
 * 
 * @author WXQ
 *
 */
public class BaseUI extends JFrame implements ui_ops 
{
//
// 下面是窗口自身的属性 和 操作
//
	private   JPanel contentPane;
	protected JComponent jPanel = null; /* 图像显示面板 */

	/** 显示图像的设备。缺省为图像显示面板。*/
	protected Graphics2D theDevice ; 
	/**
	 * 将图像保存在缓冲区中
	 * 仅一次生成屏幕大小的图像，每次刷屏时仅显示，可避免闪烁
	 */
	protected Image theOnceImage = null; 

	/**
	 * Create the frame.
	 */
	public BaseUI() {
		setFont(new Font("宋体", Font.BOLD, 24));
		setTitle("函数绘图语言解释器（ANTLR/Java) from Hongbo Qin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 1000, 700);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int myWidth = screenSize.width /2;    //* 3 / 4;
		int myHeight = screenSize.height * 3 / 4;
		// int x = (screenSize.width - myWidth) / 2;
		// int y = (screenSize.height - myHeight) / 2;
		// int x = 1000, y = 1000;

		setBounds(0, 0, 1000, 1000);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		jPanel = contentPane;
		jPanel.setFont(getFont());
		contentPane.setLayout(new BorderLayout(0, 0));
		theDevice= (Graphics2D)jPanel.getGraphics();
	}

	public void dispose() {
		super.dispose();
    }

	public void paint(Graphics g)
	{
		if(!getClass().equals(BaseUI.class))
			super.paint(g);
		else {
			if(theOnceImage != null){
				// 当先调用 super.paint的话，会先清除背景，从而
				// 造成界面闪烁
				g.drawImage(theOnceImage, 0, 0, null);
			}
		}
	}


//
// 下面实现 interface ui_ops 的操作集
//

	/** 
	 * 显示出错信息。
	 * 主要用于词法、语法、树分析过程中进行错误提示。
	 * @param msg 信息文本
	 */
	public void reportError(String msg)
	{
		System.err.print( msg );
		if(msg.length()>0 && msg.charAt(msg.length()-1) != '\n')
    		System.err.print( "\n" );

		if(theDevice == null)
			theDevice = (Graphics2D)jPanel.getGraphics();
        if(theDevice == null) return;
		theDevice.setBackground(Color.WHITE);
		theDevice.clearRect(0, 0, getWidth(), 100);
        ((Graphics)theDevice).setFont(new Font("微软雅黑",Font.BOLD,28));
		theDevice.drawString(msg, 20, 60);
	}
	
	public void showMessage(String msg)
	{
		/*
		Graphics2D g = (Graphics2D) getGraphics();
		g.setBackground(Color.WHITE);
		g.clearRect(0, 0, getSize().width, getSize().height);
		g.drawString(msg, 20, 150);
		*/
		System.out.println( msg );
	}
	

	/**
	 * 在 绘图区 绘制一个像素点。
	 * @param x 横坐标
	 * @param y 纵坐标
	 * @param R 颜色之红色分量
	 * @param G 颜色之绿色分量
	 * @param B 颜色之蓝色分量
	 * @param pixelSize 点的大小，有效范围是 2~60
	 */
	public void drawPixel(double x, double y, UiPixelAttrib pa)
	{
		if( theDevice == null )
			theDevice = (Graphics2D)getGraphics();
		if( theDevice == null )
		    return;

		theDevice.setColor(new Color((int)pa.red(), (int)pa.green(), (int)pa.blue()));
		
		// 实心圆 绘制一个像素点
		theDevice.fillArc((int)x, (int)y, (int)pa.size(), (int)pa.size(), 0, 360);

		// 空心矩形
		//theDevice.drawRect((int)x, (int)y, (int)pa.size(), (int)pa.size());
		
		// 实心矩形
		//theDevice.fillRect((int)x, (int)y, (int)pa.size(), (int)pa.size());
		
	}

    public void setTree(org.antlr.v4.runtime.tree.ParseTree tree, String[] ruleNames)
    {}

    public void beginPaint()
    {
        setVisible(true);
		if( theDevice == null ) {
			theDevice = (Graphics2D)jPanel.getGraphics(); 
		}
		
		//
		//Step 1: 准备空的内存图像，尺寸同全屏幕
		//
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int imgWidth = screenSize.width; //getSize().width;
		int imgHeight = screenSize.height; //getSize().height;
		theOnceImage = createImage(imgWidth, imgHeight);
		theDevice = (Graphics2D)theOnceImage.getGraphics();
		
		//
		//Step 2: 将内存图像先设置为白色背景
		//
		theDevice.setBackground(Color.WHITE);
		theDevice.clearRect(0, 0, imgWidth, imgHeight);
    }

    public void endPaint(boolean noError)
    {
		drawWaterMarker(theDevice, 10,100);
        if(theDevice != null) { theDevice.dispose(); }        
        repaint();
    }
//
// interface ui_ops 的操作集结束
//
	protected void drawWaterMarker(Graphics g, int x, int y){
		String waterMarker = "王献青制作, ANTLR4/Java, 2019";
		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float)0.4);
		Composite oldac = ((Graphics2D)g).getComposite();
		((Graphics2D)g).setComposite(ac);
		g.setColor(Color.BLACK);
		g.setFont(new Font("微软雅黑",Font.BOLD,28));
		g.drawString(waterMarker, (int)x, (int)y);
		((Graphics2D)g).setComposite(oldac);
	}

}
