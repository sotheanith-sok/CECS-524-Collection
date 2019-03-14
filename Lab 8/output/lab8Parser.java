// $ANTLR null D:\\Workspace\\CECS-524\\Lab 8\\lab8.g 2019-02-21 12:52:13

import java.util.HashMap;
import java.util.Scanner;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lab8Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", 
		"'='", "'BEGIN'", "'END'", "'INPUT'", "'INTEGER'", "'LET'", "'PRINT'", 
		"'PRINTLN'"
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
	public static final int T__30=30;
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


	public lab8Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public lab8Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return lab8Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Workspace\\CECS-524\\Lab 8\\lab8.g"; }


		HashMap memory = new HashMap();
		Scanner scanner = new Scanner(System.in);



	// $ANTLR start "program"
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:10:1: program : 'BEGIN' ( statement )* 'END' ;
	public final void program() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:10:10: ( 'BEGIN' ( statement )* 'END' )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:10:12: 'BEGIN' ( statement )* 'END'
			{
			match(input,24,FOLLOW_24_in_program20); 
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:10:20: ( statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 26 && LA1_0 <= 30)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:10:20: statement
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:11:1: statement : ( printS | printlnS | printE | printlnE | integer | calculation | input );
	public final void statement() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:12:3: ( printS | printlnS | printE | printlnE | integer | calculation | input )
			int alt2=7;
			switch ( input.LA(1) ) {
			case 29:
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
			case 30:
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
			case 27:
				{
				alt2=5;
				}
				break;
			case 28:
				{
				alt2=6;
				}
				break;
			case 26:
				{
				alt2=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:12:5: printS
					{
					pushFollow(FOLLOW_printS_in_statement34);
					printS();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:13:5: printlnS
					{
					pushFollow(FOLLOW_printlnS_in_statement40);
					printlnS();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:14:5: printE
					{
					pushFollow(FOLLOW_printE_in_statement46);
					printE();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:15:5: printlnE
					{
					pushFollow(FOLLOW_printlnE_in_statement52);
					printlnE();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:16:5: integer
					{
					pushFollow(FOLLOW_integer_in_statement58);
					integer();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:17:5: calculation
					{
					pushFollow(FOLLOW_calculation_in_statement64);
					calculation();
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:18:5: input
					{
					pushFollow(FOLLOW_input_in_statement70);
					input();
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:20:1: printS : 'PRINT' STRING ;
	public final void printS() throws RecognitionException {
		Token STRING1=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:20:9: ( 'PRINT' STRING )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:20:11: 'PRINT' STRING
			{
			match(input,29,FOLLOW_29_in_printS80); 
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_printS82); 
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:22:1: printlnS : 'PRINTLN' STRING ;
	public final void printlnS() throws RecognitionException {
		Token STRING2=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:22:10: ( 'PRINTLN' STRING )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:22:12: 'PRINTLN' STRING
			{
			match(input,30,FOLLOW_30_in_printlnS94); 
			STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_printlnS96); 
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:24:1: printE : 'PRINT' expr ;
	public final void printE() throws RecognitionException {
		int expr3 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:24:10: ( 'PRINT' expr )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:24:12: 'PRINT' expr
			{
			match(input,29,FOLLOW_29_in_printE110); 
			pushFollow(FOLLOW_expr_in_printE112);
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:26:1: printlnE : 'PRINTLN' expr ;
	public final void printlnE() throws RecognitionException {
		int expr4 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:26:10: ( 'PRINTLN' expr )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:26:12: 'PRINTLN' expr
			{
			match(input,30,FOLLOW_30_in_printlnE124); 
			pushFollow(FOLLOW_expr_in_printlnE126);
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:28:1: calculation : 'LET' ID '=' expr ;
	public final void calculation() throws RecognitionException {
		Token ID5=null;
		int expr6 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:28:13: ( 'LET' ID '=' expr )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:28:15: 'LET' ID '=' expr
			{
			match(input,28,FOLLOW_28_in_calculation138); 
			ID5=(Token)match(input,ID,FOLLOW_ID_in_calculation140); 
			match(input,23,FOLLOW_23_in_calculation142); 
			pushFollow(FOLLOW_expr_in_calculation144);
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:93:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:94:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:94:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr732);
			e=multExpr();
			state._fsp--;

			value = e;
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:95:6: ( '+' e= multExpr | '-' e= multExpr )*
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
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:95:10: '+' e= multExpr
					{
					match(input,19,FOLLOW_19_in_expr746); 
					pushFollow(FOLLOW_multExpr_in_expr750);
					e=multExpr();
					state._fsp--;

					value += e;
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:96:13: '-' e= multExpr
					{
					match(input,21,FOLLOW_21_in_expr766); 
					pushFollow(FOLLOW_multExpr_in_expr770);
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:100:1: multExpr returns [int value] : e= atom ( '*' e= atom | '/' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:101:5: (e= atom ( '*' e= atom | '/' e= atom )* )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:101:9: e= atom ( '*' e= atom | '/' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr808);
			e=atom();
			state._fsp--;

			value = e;
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:102:5: ( '*' e= atom | '/' e= atom )*
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
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:102:6: '*' e= atom
					{
					match(input,18,FOLLOW_18_in_multExpr818); 
					pushFollow(FOLLOW_atom_in_multExpr822);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:103:7: '/' e= atom
					{
					match(input,22,FOLLOW_22_in_multExpr833); 
					pushFollow(FOLLOW_atom_in_multExpr837);
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:106:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT7=null;
		Token ID8=null;
		int expr9 =0;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:107:5: ( INT | ID | '(' expr ')' )
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
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:107:9: INT
					{
					INT7=(Token)match(input,INT,FOLLOW_INT_in_atom869); 
					value = Integer.parseInt((INT7!=null?INT7.getText():null));
					}
					break;
				case 2 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:108:9: ID
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_atom881); 

					        Integer v = (Integer)memory.get((ID8!=null?ID8.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("undefined variable "+(ID8!=null?ID8.getText():null));
					        
					}
					break;
				case 3 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:114:9: '(' expr ')'
					{
					match(input,16,FOLLOW_16_in_atom901); 
					pushFollow(FOLLOW_expr_in_atom903);
					expr9=expr();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom905); 
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:118:1: integer : 'INTEGER' idlist ;
	public final void integer() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:118:9: ( 'INTEGER' idlist )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:118:11: 'INTEGER' idlist
			{
			match(input,27,FOLLOW_27_in_integer925); 
			pushFollow(FOLLOW_idlist_in_integer927);
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:119:1: idlist : idname ( ',' idname )* ;
	public final void idlist() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:119:8: ( idname ( ',' idname )* )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:119:10: idname ( ',' idname )*
			{
			pushFollow(FOLLOW_idname_in_idlist934);
			idname();
			state._fsp--;

			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:119:17: ( ',' idname )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==20) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:119:18: ',' idname
					{
					match(input,20,FOLLOW_20_in_idlist937); 
					pushFollow(FOLLOW_idname_in_idlist939);
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
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:120:1: idname : ID ;
	public final void idname() throws RecognitionException {
		Token ID10=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:120:9: ( ID )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:120:11: ID
			{
			ID10=(Token)match(input,ID,FOLLOW_ID_in_idname949); 
				
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



	// $ANTLR start "input"
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:128:1: input : 'INPUT' id1name ( ',' id1name )* ;
	public final void input() throws RecognitionException {
		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:128:7: ( 'INPUT' id1name ( ',' id1name )* )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:128:9: 'INPUT' id1name ( ',' id1name )*
			{
			match(input,26,FOLLOW_26_in_input958); 
			pushFollow(FOLLOW_id1name_in_input960);
			id1name();
			state._fsp--;

			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:128:25: ( ',' id1name )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==20) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:128:26: ',' id1name
					{
					match(input,20,FOLLOW_20_in_input963); 
					pushFollow(FOLLOW_id1name_in_input965);
					id1name();
					state._fsp--;

					}
					break;

				default :
					break loop7;
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
	// $ANTLR end "input"



	// $ANTLR start "id1name"
	// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:129:1: id1name : ID ;
	public final void id1name() throws RecognitionException {
		Token ID11=null;

		try {
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:129:9: ( ID )
			// D:\\Workspace\\CECS-524\\Lab 8\\lab8.g:129:11: ID
			{
			ID11=(Token)match(input,ID,FOLLOW_ID_in_id1name974); 
				
						try{
							if(memory.containsKey((ID11!=null?ID11.getText():null))){
								String input = scanner.nextLine();
								int intValue=Integer.parseInt(input);
					        		memory.put((ID11!=null?ID11.getText():null), new Integer(intValue));
					        	}else{
					        		System.err.println("Undefined variable: "+(ID11!=null?ID11.getText():null)+" on line:"+(ID11!=null?ID11.getLine():0));
					        	}
						}catch(Exception e){
							System.err.println(e);
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
	// $ANTLR end "id1name"

	// Delegated rules



	public static final BitSet FOLLOW_24_in_program20 = new BitSet(new long[]{0x000000007E000000L});
	public static final BitSet FOLLOW_statement_in_program22 = new BitSet(new long[]{0x000000007E000000L});
	public static final BitSet FOLLOW_25_in_program25 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printS_in_statement34 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnS_in_statement40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printE_in_statement46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnE_in_statement52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_statement58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_calculation_in_statement64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_in_statement70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_printS80 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_printS82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_printlnS94 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_printlnS96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_printE110 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_printE112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_printlnE124 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_printlnE126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_calculation138 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_calculation140 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_calculation142 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_calculation144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr732 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_19_in_expr746 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr750 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_21_in_expr766 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr770 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_atom_in_multExpr808 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_18_in_multExpr818 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr822 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_22_in_multExpr833 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr837 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_INT_in_atom869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_atom901 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_atom903 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_integer925 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_idlist_in_integer927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idname_in_idlist934 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_idlist937 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_idname_in_idlist939 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ID_in_idname949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_input958 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_id1name_in_input960 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_input963 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_id1name_in_input965 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ID_in_id1name974 = new BitSet(new long[]{0x0000000000000002L});
}
