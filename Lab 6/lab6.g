grammar lab6;

@header {
import java.util.HashMap;}
@members{
	HashMap memory = new HashMap();
}
program		:	'BEGIN' statement* 'END';
statement
		:	printS
		|	printlnS
		|	printE
		|	printlnE
		|	calculation;
	
printS		:	'PRINT' STRING {System.out.print($STRING.text.substring(1, $STRING.text.length()-1));}
		;
printlnS	:	'PRINTLN' STRING {System.out.println($STRING.text.substring(1, $STRING.text.length()-1));}
		;
printE 		:	'PRINT' expr {System.out.print($expr.value);}
		;
printlnE	:	'PRINTLN' expr {System.out.println($expr.value);}
		;
calculation	:	'LET' ID '=' expr
	        	{memory.put($ID.text, new Integer($expr.value));}
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
