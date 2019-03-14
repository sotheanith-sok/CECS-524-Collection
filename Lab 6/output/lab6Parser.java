// $ANTLR null D:\\Workspace\\CECS-524\\Lab 6\\lab6.g 2019-02-14 12:20:17

import java.util.HashMap;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lab6Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'='", 
		"'BEGIN'", "'END'", "'LET'", "'PRINT'", "'PRINTLN'"
	};
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int HEX_DIGIT=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int OCTAL_ESC=12;
	public static final int STRING=13;
	public static final int UNICODE_ESC=14;
	public static final int WS=15;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public lab6Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public lab6Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return lab6Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Workspace\\CECS-524\\Lab 6\\lab6.g"; }


		HashMap memory = new HashMap();



	// $ANTLR start "program"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:8:1: program : 'BEGIN' ( statement )* 'END' ;
	public final void program() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:8:9: ( 'BEGIN' ( statement )* 'END' )
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:8:11: 'BEGIN' ( statement )* 'END'
			{
			match(input,23,FOLLOW_23_in_program19); 
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:8:19: ( statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 25 && LA1_0 <= 27)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:8:19: statement
					{
					pushFollow(FOLLOW_statement_in_program21);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,24,FOLLOW_24_in_program24); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:9:1: statement : ( printS | printlnS | printE | printlnE | calculation );
	public final void statement() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:10:2: ( printS | printlnS | printE | printlnE | calculation )
			int alt2=5;
			switch ( input.LA(1) ) {
			case 26:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==STRING) ) {
					alt2=1;
				}
				else if ( ((LA2_1 >= ID && LA2_1 <= INT)||LA2_1==16) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 27:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==STRING) ) {
					alt2=2;
				}
				else if ( ((LA2_2 >= ID && LA2_2 <= INT)||LA2_2==16) ) {
					alt2=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 25:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:10:4: printS
					{
					pushFollow(FOLLOW_printS_in_statement32);
					printS();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:11:4: printlnS
					{
					pushFollow(FOLLOW_printlnS_in_statement37);
					printlnS();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:12:4: printE
					{
					pushFollow(FOLLOW_printE_in_statement42);
					printE();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:13:4: printlnE
					{
					pushFollow(FOLLOW_printlnE_in_statement47);
					printlnE();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:14:4: calculation
					{
					pushFollow(FOLLOW_calculation_in_statement52);
					calculation();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "printS"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:16:1: printS : 'PRINT' STRING ;
	public final void printS() throws RecognitionException {
		Token STRING1=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:16:9: ( 'PRINT' STRING )
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:16:10: 'PRINT' STRING
			{
			match(input,26,FOLLOW_26_in_printS61); 
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_printS63); 
			System.out.print((STRING1!=null?STRING1.getText():null).substring(1, (STRING1!=null?STRING1.getText():null).length()-1));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printS"



	// $ANTLR start "printlnS"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:18:1: printlnS : 'PRINTLN' STRING ;
	public final void printlnS() throws RecognitionException {
		Token STRING2=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:18:10: ( 'PRINTLN' STRING )
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:18:11: 'PRINTLN' STRING
			{
			match(input,27,FOLLOW_27_in_printlnS74); 
			STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_printlnS76); 
			System.out.println((STRING2!=null?STRING2.getText():null).substring(1, (STRING2!=null?STRING2.getText():null).length()-1));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printlnS"



	// $ANTLR start "printE"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:20:1: printE : 'PRINT' expr ;
	public final void printE() throws RecognitionException {
		int expr3 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:20:10: ( 'PRINT' expr )
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:20:11: 'PRINT' expr
			{
			match(input,26,FOLLOW_26_in_printE89); 
			pushFollow(FOLLOW_expr_in_printE91);
			expr3=expr();
			state._fsp--;

			System.out.print(expr3);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printE"



	// $ANTLR start "printlnE"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:22:1: printlnE : 'PRINTLN' expr ;
	public final void printlnE() throws RecognitionException {
		int expr4 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:22:10: ( 'PRINTLN' expr )
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:22:11: 'PRINTLN' expr
			{
			match(input,27,FOLLOW_27_in_printlnE102); 
			pushFollow(FOLLOW_expr_in_printlnE104);
			expr4=expr();
			state._fsp--;

			System.out.println(expr4);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printlnE"



	// $ANTLR start "calculation"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:24:1: calculation : 'LET' ID '=' expr ;
	public final void calculation() throws RecognitionException {
		Token ID5=null;
		int expr6 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:24:13: ( 'LET' ID '=' expr )
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:24:14: 'LET' ID '=' expr
			{
			match(input,25,FOLLOW_25_in_calculation115); 
			ID5=(Token)match(input,ID,FOLLOW_ID_in_calculation117); 
			match(input,22,FOLLOW_22_in_calculation119); 
			pushFollow(FOLLOW_expr_in_calculation121);
			expr6=expr();
			state._fsp--;

			memory.put((ID5!=null?ID5.getText():null), new Integer(expr6));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "calculation"



	// $ANTLR start "expr"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:84:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:85:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:85:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr707);
			e=multExpr();
			state._fsp--;

			value = e;
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:86:6: ( '+' e= multExpr | '-' e= multExpr )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==19) ) {
					alt3=1;
				}
				else if ( (LA3_0==20) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:86:10: '+' e= multExpr
					{
					match(input,19,FOLLOW_19_in_expr721); 
					pushFollow(FOLLOW_multExpr_in_expr725);
					e=multExpr();
					state._fsp--;

					value += e;
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:87:13: '-' e= multExpr
					{
					match(input,20,FOLLOW_20_in_expr741); 
					pushFollow(FOLLOW_multExpr_in_expr745);
					e=multExpr();
					state._fsp--;

					value -= e;
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:91:1: multExpr returns [int value] : e= atom ( '*' e= atom | '/' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:92:5: (e= atom ( '*' e= atom | '/' e= atom )* )
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:92:9: e= atom ( '*' e= atom | '/' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr783);
			e=atom();
			state._fsp--;

			value = e;
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:93:5: ( '*' e= atom | '/' e= atom )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==18) ) {
					alt4=1;
				}
				else if ( (LA4_0==21) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:93:6: '*' e= atom
					{
					match(input,18,FOLLOW_18_in_multExpr793); 
					pushFollow(FOLLOW_atom_in_multExpr797);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:94:7: '/' e= atom
					{
					match(input,21,FOLLOW_21_in_multExpr808); 
					pushFollow(FOLLOW_atom_in_multExpr812);
					e=atom();
					state._fsp--;

					value /= e;
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:96:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT7=null;
		Token ID8=null;
		int expr9 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:97:5: ( INT | ID | '(' expr ')' )
			int alt5=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt5=1;
				}
				break;
			case ID:
				{
				alt5=2;
				}
				break;
			case 16:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:97:9: INT
					{
					INT7=(Token)match(input,INT,FOLLOW_INT_in_atom839); 
					value = Integer.parseInt((INT7!=null?INT7.getText():null));
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:98:9: ID
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_atom851); 

					        Integer v = (Integer)memory.get((ID8!=null?ID8.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("undefined variable "+(ID8!=null?ID8.getText():null));
					        
					}
					break;
				case 3 :
					// D:\\Workspace\\CECS-524\\Lab 6\\lab6.g:104:9: '(' expr ')'
					{
					match(input,16,FOLLOW_16_in_atom871); 
					pushFollow(FOLLOW_expr_in_atom873);
					expr9=expr();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom875); 
					value = expr9;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_23_in_program19 = new BitSet(new long[]{0x000000000F000000L});
	public static final BitSet FOLLOW_statement_in_program21 = new BitSet(new long[]{0x000000000F000000L});
	public static final BitSet FOLLOW_24_in_program24 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printS_in_statement32 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnS_in_statement37 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printE_in_statement42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnE_in_statement47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_calculation_in_statement52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_printS61 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_printS63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_printlnS74 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_printlnS76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_printE89 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_printE91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_printlnE102 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_printlnE104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_calculation115 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_calculation117 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_calculation119 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_calculation121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr707 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_19_in_expr721 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr725 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_20_in_expr741 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr745 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_atom_in_multExpr783 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_18_in_multExpr793 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr797 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_21_in_multExpr808 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr812 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_INT_in_atom839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_atom871 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_atom873 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom875 = new BitSet(new long[]{0x0000000000000002L});
}
