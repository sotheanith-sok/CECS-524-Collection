import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, RecognitionException {
        lab8Lexer lexer = new lab8Lexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        lab8Parser parser = new lab8Parser(tokens);
        parser.program();
    }
}
