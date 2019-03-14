import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, RecognitionException {
        lab7Lexer lexer = new lab7Lexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        lab7Parser parser = new lab7Parser(tokens);
        parser.program();
    }
}
