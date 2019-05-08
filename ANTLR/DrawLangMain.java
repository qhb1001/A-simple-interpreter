public class DrawLangMain {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("未指定输入源文件\n");
            System.exit(1);
        }
        try {
            BaseUI theUI = new BaseUI();
            DrawLangMain.doFile(args[0], theUI);
        } catch (Exception e) {
            System.err.println("Exception in main: " + e);
            e.printStackTrace();
            System.exit(1);
        }
    }
    public static void doFile(String file, BaseUI theUI) throws Exception {
        FrontEnd fe = new FrontEnd(file);
        int nErr = fe.doParse();
        if (nErr > 0) {
            theUI.showMessage("语法分析出现错误");
            System.gc();
            return ;
        }
        theUI.setVisible(true);

        BackEnd be = new BackEnd(fe.getTree(), theUI);
        be.run();
    }
}