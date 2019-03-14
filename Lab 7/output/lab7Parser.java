// $ANTLR null D:\\Workspace\\CECS-524\\Lab 7\\lab7.g 2019-02-19 12:43:46

import java.util.HashMap;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lab7Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", 
		"'='", "'BEGIN'", "'END'", "'INTEGER'", "'LET'", "'PRINT'", "'PRINTLN'"
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
	public static final int T__28=28;
	public static final int T__29=29;
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


	public lab7Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public lab7Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return lab7Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Workspace\\CECS-524\\Lab 7\\lab7.g"; }


		HashMap memory = new HashMap();



	// $ANTLR start "program"
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:8:1: program : 'BEGIN' ( statement )* 'END' ;
	public final void program() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:8:10: ( 'BEGIN' ( statement )* 'END' )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:8:12: 'BEGIN' ( statement )* 'END'
			{
			match(input,24,FOLLOW_24_in_program20); 
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:8:20: ( statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 26 && LA1_0 <= 29)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:8:20: statement
					{
					pushFollow(FOLLOW_statement_in_program22);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,25,FOLLOW_25_in_program25); 
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
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:9:1: statement : ( printS | printlnS | printE | printlnE | integer | calculation );
	public final void statement() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:10:3: ( printS | printlnS | printE | printlnE | integer | calculation )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 28:
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
			case 29:
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
			case 26:
				{
				alt2=5;
				}
				break;
			case 27:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:10:5: printS
					{
					pushFollow(FOLLOW_printS_in_statement34);
					printS();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:11:5: printlnS
					{
					pushFollow(FOLLOW_printlnS_in_statement40);
					printlnS();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:12:5: printE
					{
					pushFollow(FOLLOW_printE_in_statement46);
					printE();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:13:5: printlnE
					{
					pushFollow(FOLLOW_printlnE_in_statement52);
					printlnE();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:14:5: integer
					{
					pushFollow(FOLLOW_integer_in_statement58);
					integer();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:15:5: calculation
					{
					pushFollow(FOLLOW_calculation_in_statement64);
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
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:17:1: printS : 'PRINT' STRING ;
	public final void printS() throws RecognitionException {
		Token STRING1=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:17:9: ( 'PRINT' STRING )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:17:11: 'PRINT' STRING
			{
			match(input,28,FOLLOW_28_in_printS74); 
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_printS76); 
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
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:19:1: printlnS : 'PRINTLN' STRING ;
	public final void printlnS() throws RecognitionException {
		Token STRING2=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:19:10: ( 'PRINTLN' STRING )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:19:12: 'PRINTLN' STRING
			{
			match(input,29,FOLLOW_29_in_printlnS88); 
			STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_printlnS90); 
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
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:21:1: printE : 'PRINT' expr ;
	public final void printE() throws RecognitionException {
		int expr3 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:21:10: ( 'PRINT' expr )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:21:12: 'PRINT' expr
			{
			match(input,28,FOLLOW_28_in_printE104); 
			pushFollow(FOLLOW_expr_in_printE106);
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
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:23:1: printlnE : 'PRINTLN' expr ;
	public final void printlnE() throws RecognitionException {
		int expr4 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:23:10: ( 'PRINTLN' expr )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:23:12: 'PRINTLN' expr
			{
			match(input,29,FOLLOW_29_in_printlnE118); 
			pushFollow(FOLLOW_expr_in_printlnE120);
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
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:25:1: calculation : 'LET' ID '=' expr ;
	public final void calculation() throws RecognitionException {
		Token ID5=null;
		int expr6 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:25:13: ( 'LET' ID '=' expr )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:25:15: 'LET' ID '=' expr
			{
			match(input,27,FOLLOW_27_in_calculation132); 
			ID5=(Token)match(input,ID,FOLLOW_ID_in_calculation134); 
			match(input,23,FOLLOW_23_in_calculation136); 
			pushFollow(FOLLOW_expr_in_calculation138);
			expr6=expr();
			state._fsp--;

				if(memory.containsKey((ID5!=null?ID5.getText():null))){
				        			memory.put((ID5!=null?ID5.getText():null), new Integer(expr6));
				        		}else{
				        			System.err.println("Undefined variable: "+(ID5!=null?ID5.getText():null)+" on line:"+(ID5!=null?ID5.getLine():0));
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
	// $ANTLR end "calculation"



	// $ANTLR start "expr"
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:90:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:91:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:91:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr726);
			e=multExpr();
			state._fsp--;

			value = e;
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:92:6: ( '+' e= multExpr | '-' e= multExpr )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==19) ) {
					alt3=1;
				}
				else if ( (LA3_0==21) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:92:10: '+' e= multExpr
					{
					match(input,19,FOLLOW_19_in_expr740); 
					pushFollow(FOLLOW_multExpr_in_expr744);
					e=multExpr();
					state._fsp--;

					value += e;
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:93:13: '-' e= multExpr
					{
					match(input,21,FOLLOW_21_in_expr760); 
					pushFollow(FOLLOW_multExpr_in_expr764);
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
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:97:1: multExpr returns [int value] : e= atom ( '*' e= atom | '/' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:98:5: (e= atom ( '*' e= atom | '/' e= atom )* )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:98:9: e= atom ( '*' e= atom | '/' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr802);
			e=atom();
			state._fsp--;

			value = e;
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:99:5: ( '*' e= atom | '/' e= atom )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==18) ) {
					alt4=1;
				}
				else if ( (LA4_0==22) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:99:6: '*' e= atom
					{
					match(input,18,FOLLOW_18_in_multExpr812); 
					pushFollow(FOLLOW_atom_in_multExpr816);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:100:7: '/' e= atom
					{
					match(input,22,FOLLOW_22_in_multExpr827); 
					pushFollow(FOLLOW_atom_in_multExpr831);
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
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:103:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT7=null;
		Token ID8=null;
		int expr9 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:104:5: ( INT | ID | '(' expr ')' )
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
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:104:9: INT
					{
					INT7=(Token)match(input,INT,FOLLOW_INT_in_atom863); 
					value = Integer.parseInt((INT7!=null?INT7.getText():null));
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:105:9: ID
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_atom875); 

					        Integer v = (Integer)memory.get((ID8!=null?ID8.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("undefined variable "+(ID8!=null?ID8.getText():null));
					        
					}
					break;
				case 3 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:111:9: '(' expr ')'
					{
					match(input,16,FOLLOW_16_in_atom895); 
					pushFollow(FOLLOW_expr_in_atom897);
					expr9=expr();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom899); 
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



	// $ANTLR start "integer"
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:115:1: integer : 'INTEGER' idlist ;
	public final void integer() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:115:9: ( 'INTEGER' idlist )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:115:11: 'INTEGER' idlist
			{
			match(input,26,FOLLOW_26_in_integer919); 
			pushFollow(FOLLOW_idlist_in_integer921);
			idlist();
			state._fsp--;

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
	// $ANTLR end "integer"



	// $ANTLR start "idlist"
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:116:1: idlist : idname ( ',' idname )* ;
	public final void idlist() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:116:8: ( idname ( ',' idname )* )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:116:10: idname ( ',' idname )*
			{
			pushFollow(FOLLOW_idname_in_idlist928);
			idname();
			state._fsp--;

			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:116:17: ( ',' idname )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==20) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:116:18: ',' idname
					{
					match(input,20,FOLLOW_20_in_idlist931); 
					pushFollow(FOLLOW_idname_in_idlist933);
					idname();
					state._fsp--;

					}
					break;

				default :
					break loop6;
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
	}
	// $ANTLR end "idlist"



	// $ANTLR start "idname"
	// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:117:1: idname : ID ;
	public final void idname() throws RecognitionException {
		Token ID10=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:117:9: ( ID )
			// D:\\Workspace\\CECS-524\\Lab 7\\lab7.g:117:11: ID
			{
			ID10=(Token)match(input,ID,FOLLOW_ID_in_idname943); 
				
						if(memory.containsKey((ID10!=null?ID10.getText():null))){
				        		System.err.println("Error: "+(ID10!=null?ID10.getText():null) + " already defined line:"+ (ID10!=null?ID10.getLine():0));	
				        	}else{
				        		memory.put((ID10!=null?ID10.getText():null), 0);

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
	// $ANTLR end "idname"

	// Delegated rules



	public static final BitSet FOLLOW_24_in_program20 = new BitSet(new long[]{0x000000003E000000L});
	public static final BitSet FOLLOW_statement_in_program22 = new BitSet(new long[]{0x000000003E000000L});
	public static final BitSet FOLLOW_25_in_program25 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printS_in_statement34 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnS_in_statement40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printE_in_statement46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnE_in_statement52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_statement58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_calculation_in_statement64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_printS74 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_printS76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_printlnS88 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_printlnS90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_printE104 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_printE106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_printlnE118 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_printlnE120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_calculation132 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_calculation134 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_calculation136 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_calculation138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr726 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_19_in_expr740 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr744 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_21_in_expr760 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr764 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_atom_in_multExpr802 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_18_in_multExpr812 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr816 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_22_in_multExpr827 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr831 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_INT_in_atom863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_atom895 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_atom897 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_integer919 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_idlist_in_integer921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idname_in_idlist928 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_idlist931 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_idname_in_idlist933 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ID_in_idname943 = new BitSet(new long[]{0x0000000000000002L});
}
