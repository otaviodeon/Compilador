import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.io.FileInputStream;

public class Programa  {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        AutomatoLexer lexer = new AutomatoLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AutomatoParser parser = new AutomatoParser(tokens);
        ParseTree tree = parser.definicao(); // iniciamos o parsing pela regra init
        //System.out.println(tree.toStringTree(parser)); // print arvore

        ParseTreeWalker walker = new ParseTreeWalker();
        Mostra mostra = new Mostra();
        walker.walk(mostra, tree);
    }
}
