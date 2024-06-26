grammar Tiggrammar;

@header {
    package grammar;
}
//Program is expr
prog returns [ast.ASTprogram node] 
    : 
    (func)* body=expr EOF
    ;

//Functions
func returns [ast.ASTfunction node] 
    : 'fn' identifier=ID '(' ( args+=ID (',' args+=ID)*)? ')' block=expr
    ;

// Expressions enrichies
expr returns [ast.ASTexpression node]
    : '$' arg=expr # Print

    | 'if' cond=expr 'then' argT=expr ('else' argF=expr)? # Condition
    | 'while' cond=expr 'do' task=expr # While
    | 'for' var=ID ('=' init=expr)? 'to' goal=expr 'do' task=expr # For

    | op=('-' | '+' | '!') arg=expr # Unary
    | expType=TYPE? '(' arg=expr ')' # GroupedExpr
    | '{' exprs+=expr (';'? exprs+=expr)* ';'? '}' # Sequence
    | arg1=expr op=('==' | '!=' | '>' | '>=' | '<' | '<=') arg2=expr # Binary
    | arg1=expr op=('*' | '/' | '%' | '**') arg2=expr # Binary
    | arg1=expr op=('+' | '-') arg2=expr # Binary
    | intConst=INT # ConstInteger
    | boolConst=BOOL # ConstBool
    | strConst=STRING # ConstStr
    | identifier=ID '=' value=expr # Assign
    | identifier=ID '(' ( args+=expr (',' args+=expr)* )? ')' #FunctionCall 
    | identifier=ID                # Read
    ;

/*
 * Règles lexicales.
 * 
 * ANTLR impose que le nom des règles lexicales commencent par
 * une majuscule. 
 * Ces règles prnnent la forme d'expressions régulières.
 */

// Constantes entières
TYPE : 'int' | 'bool' | 'str' ;
INT : [0-9]+ ;
BOOL : 'true' | 'false' | 'T' | 'F' ;
STRING : '"' (.)*? '"' ;
ID : [a-z] [a-zA-Z0-9_]*;

// Commentaires
LINE_COMMENT : '//' (~[\r\n])* -> skip;
COMMENT : '/*' ('*' ~[/] | ~[*])* '*/' -> skip;

// Espaces
SPACE : [ \t\r\n]+ -> skip;
