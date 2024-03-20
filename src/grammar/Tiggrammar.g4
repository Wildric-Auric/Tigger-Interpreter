grammar Tiggrammar;

@header {
    package grammar;
}

// un programme est (pour l'instant) une expression
prog returns [ast.ASTprogram node] 
    : body=expr EOF
    ;

// Expressions enrichies
expr returns [ast.ASTexpression node]
    : arg=expr ';' # Sequence
    | '$' arg=expr # Print

    | 'if' cond=expr 'then' argT=expr 'else' argF=expr # Condition

    | op=('-' | '+') arg=expr # Unary
    | '(' arg=expr ')' # GroupedExpr
    | arg1=expr op=('==' | '!=' | '>' | '>=' | '<' | '<=') arg2=expr # Binary
    | arg1=expr op=('*' | '/' | '%') arg2=expr # Binary
    | arg1=expr op=('+' | '-') arg2=expr # Binary
    | intConst=INT # ConstInteger
    | boolConst=BOOL # ConstBool
    ;

/*
 * Règles lexicales.
 * 
 * ANTLR impose que le nom des règles lexicales commencent par
 * une majuscule. 
 * Ces règles prnnent la forme d'expressions régulières.
 */

// Constantes entières
INT : [0-9]+ ;
BOOL : 'true' | 'false' | 'T' | 'F' ;
ID : [a-z] [a-zA-Z0-9_] ;

// Commentaires
LINE_COMMENT : '//' (~[\r\n])* -> skip;
COMMENT : '/*' ('*' ~[/] | ~[*])* '*/' -> skip;

// Espaces
SPACE : [ \t\r\n]+ -> skip;
