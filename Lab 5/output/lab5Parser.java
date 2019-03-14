// $ANTLR null D:\\Workspace\\CECS-524\\Lab 5\\lab5.g 2019-02-12 13:54:57

import java.util.HashMap;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lab5Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'='", 
		"'PRINT'", "'PRINTLN'"
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


	public lab5Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public lab5Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return lab5Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Workspace\\CECS-524\\Lab 5\\lab5.g"; }


		HashMap memory = new HashMap();



	// $ANTLR start "program"
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:10:1: program : ( statement )+ ;
	public final void program() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:10:9: ( ( statement )+ )
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:10:11: ( statement )+
			{
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:10:11: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||(LA1_0 >= 23 && LA1_0 <= 24)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:10:11: statement
					{
					pushFollow(FOLLOW_statement_in_program21);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:11:1: statement : ( printS | printlnS | printE | printlnE | calculation );
	public final void statement() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:12:2: ( printS | printlnS | printE | printlnE | calculation )
			int alt2=5;
			switch ( input.LA(1) ) {
			case 23:
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
			case 24:
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
			case ID:
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
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:12:4: printS
					{
					pushFollow(FOLLOW_printS_in_statement30);
					printS();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:13:4: printlnS
					{
					pushFollow(FOLLOW_printlnS_in_statement35);
					printlnS();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:14:4: printE
					{
					pushFollow(FOLLOW_printE_in_statement40);
					printE();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:15:4: printlnE
					{
					pushFollow(FOLLOW_printlnE_in_statement45);
					printlnE();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:16:4: calculation
					{
					pushFollow(FOLLOW_calculation_in_statement50);
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
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:17:1: printS : 'PRINT' STRING ;
	public final void printS() throws RecognitionException {
		Token STRING1=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:17:9: ( 'PRINT' STRING )
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:17:11: 'PRINT' STRING
			{
			match(input,23,FOLLOW_23_in_printS58); 
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_printS60); 
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
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:18:1: printlnS : 'PRINTLN' STRING ;
	public final void printlnS() throws RecognitionException {
		Token STRING2=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:18:10: ( 'PRINTLN' STRING )
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:18:11: 'PRINTLN' STRING
			{
			match(input,24,FOLLOW_24_in_printlnS68); 
			STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_printlnS70); 
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
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:19:1: printE : 'PRINT' expr ;
	public final void printE() throws RecognitionException {
		int expr3 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:19:9: ( 'PRINT' expr )
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:19:11: 'PRINT' expr
			{
			match(input,23,FOLLOW_23_in_printE80); 
			pushFollow(FOLLOW_expr_in_printE82);
			expr3=expr();
			state._fsp--;

			System.out.println(expr3);
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
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:20:1: printlnE : 'PRINTLN' expr ;
	public final void printlnE() throws RecognitionException {
		int expr4 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:20:9: ( 'PRINTLN' expr )
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:20:11: 'PRINTLN' expr
			{
			match(input,24,FOLLOW_24_in_printlnE90); 
			pushFollow(FOLLOW_expr_in_printlnE92);
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
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:21:1: calculation : ID '=' expr ;
	public final void calculation() throws RecognitionException {
		Token ID5=null;
		int expr6 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:21:13: ( ID '=' expr )
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:21:16: ID '=' expr
			{
			ID5=(Token)match(input,ID,FOLLOW_ID_in_calculation102); 
			match(input,22,FOLLOW_22_in_calculation104); 
			pushFollow(FOLLOW_expr_in_calculation106);
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
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:81:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:82:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:82:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr688);
			e=multExpr();
			state._fsp--;

			value = e;
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:83:6: ( '+' e= multExpr | '-' e= multExpr )*
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
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:83:10: '+' e= multExpr
					{
					match(input,19,FOLLOW_19_in_expr702); 
					pushFollow(FOLLOW_multExpr_in_expr706);
					e=multExpr();
					state._fsp--;

					value += e;
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:84:13: '-' e= multExpr
					{
					match(input,20,FOLLOW_20_in_expr722); 
					pushFollow(FOLLOW_multExpr_in_expr726);
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
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:88:1: multExpr returns [int value] : e= atom ( '*' e= atom | '/' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:89:5: (e= atom ( '*' e= atom | '/' e= atom )* )
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:89:9: e= atom ( '*' e= atom | '/' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr764);
			e=atom();
			state._fsp--;

			value = e;
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:90:5: ( '*' e= atom | '/' e= atom )*
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
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:90:6: '*' e= atom
					{
					match(input,18,FOLLOW_18_in_multExpr774); 
					pushFollow(FOLLOW_atom_in_multExpr778);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:91:7: '/' e= atom
					{
					match(input,21,FOLLOW_21_in_multExpr789); 
					pushFollow(FOLLOW_atom_in_multExpr793);
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
	// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:93:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT7=null;
		Token ID8=null;
		int expr9 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:94:5: ( INT | ID | '(' expr ')' )
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
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:94:9: INT
					{
					INT7=(Token)match(input,INT,FOLLOW_INT_in_atom820); 
					value = Integer.parseInt((INT7!=null?INT7.getText():null));
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:95:9: ID
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_atom832); 

					        Integer v = (Integer)memory.get((ID8!=null?ID8.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("undefined variable "+(ID8!=null?ID8.getText():null));
					        
					}
					break;
				case 3 :
					// D:\\Workspace\\CECS-524\\Lab 5\\lab5.g:101:9: '(' expr ')'
					{
					match(input,16,FOLLOW_16_in_atom852); 
					pushFollow(FOLLOW_expr_in_atom854);
					expr9=expr();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom856); 
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



	public static final BitSet FOLLOW_statement_in_program21 = new BitSet(new long[]{0x0000000001800402L});
	public static final BitSet FOLLOW_printS_in_statement30 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnS_in_statement35 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printE_in_statement40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnE_in_statement45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_calculation_in_statement50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_printS58 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_printS60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_printlnS68 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_printlnS70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_printE80 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_printE82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_printlnE90 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_printlnE92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_calculation102 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_calculation104 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_calculation106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr688 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_19_in_expr702 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr706 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_20_in_expr722 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr726 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_atom_in_multExpr764 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_18_in_multExpr774 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr778 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_21_in_multExpr789 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr793 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_INT_in_atom820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_atom852 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_atom854 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom856 = new BitSet(new long[]{0x0000000000000002L});
}
