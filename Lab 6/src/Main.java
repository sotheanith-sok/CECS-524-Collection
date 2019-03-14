import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, RecognitionException {

        lab6Lexer lexer = new lab6Lexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        lab6Parser parser = new lab6Parser(tokens);
        parser.program();
    }
}
