grammar lab8;

@header {
import java.util.HashMap;
import java.util.Scanner;}
@members{
	HashMap memory = new HashMap();
	Scanner scanner = new Scanner(System.in);
}
program		:	'BEGIN' statement* 'END';
statement
		:	printS
		|	printlnS
		|	printE
		|	printlnE
		|	integer
		|	calculation
		|	input;
	
printS		:	'PRINT' STRING {System.out.print($STRING.text.substring(1, $STRING.text.length()-1));}
		;
printlnS	:	'PRINTLN' STRING {System.out.println($STRING.text.substring(1, $STRING.text.length()-1));}
		;
printE 		:	'PRINT' expr {System.out.print($expr.value);}
		;
printlnE	:	'PRINTLN' expr {System.out.println($expr.value);}
		;
calculation	:	'LET' ID '=' expr
	        	{	if(memory.containsKey($ID.text)){
	        			memory.put($ID.text, new Integer($expr.value));
	        		}else{
	        			System.err.println("Undefined variable: "+$ID.text+" on line:"+$ID.line);
	        		}
	        	}
	        ;


ID 		:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
expr returns [int value]
    :   e=multExpr {$value = $e.value;} 
    	(   '+' e=multExpr {$value += $e.value;}
        |   '-' e=multExpr {$value -= $e.value;}
        )*
    ;

multExpr returns [int value]
    :   e=atom {$value = $e.value;} 
    ('*' e=atom {$value *= $e.value;} 
    | '/' e=atom {$value /= $e.value;})*
    ; 
    
atom returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   ID
        {
        Integer v = (Integer)memory.get($ID.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    |   '(' expr ')' {$value = $expr.value;}
    ;

    
integer	:	'INTEGER' idlist;
idlist	:	idname (',' idname)*;
idname 	:	ID {	
			if(memory.containsKey($ID.text)){
	        		System.err.println("Error: "+$ID.text + " already defined line:"+ $ID.line);	
	        	}else{
	        		memory.put($ID.text, 0);

	        	}
		};
input	:	'INPUT'	id1name (',' id1name)*;
id1name	:	ID{	
			try{
				if(memory.containsKey($ID.text)){
					String input = scanner.nextLine();
					int intValue=Integer.parseInt(input);
		        		memory.put($ID.text, new Integer(intValue));
		        	}else{
		        		System.err.println("Undefined variable: "+$ID.text+" on line:"+$ID.line);
		        	}
			}catch(Exception e){
				System.err.println(e);
			}
		};


