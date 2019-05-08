import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
public class FrontEnd {
    protected ParseTree tree = null;
    protected String theFilePath;

    public FrontEnd(String filePath) {
        theFilePath = filePath;
    }
    public ParseTree getTree() {
        return tree;
    }

    public int doParse() throws Exception {
        java.io.InputStream is = System.in;
        if (theFilePath != null) is = new FileInputStream(theFilePath);
        ANTLRInputStream input = new ANTLRInputStream(is);
        DrawGraphLexer lexer = new DrawGraphLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DrawGraphParser parser = new DrawGraphParser(tokens);

        tree = parser.program();
        int nErr = parser.getNumberOfSyntaxErrors();
        return nErr;
    }
}