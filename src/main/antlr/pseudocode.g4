grammar pseudocode;

program
    : algorithmDecl* EOF
    ;

algorithmDecl
    : 'Algorithm' ID '(' paramList? ')' block 'end' 'Algorithm'
    | 'Procedure' ID '(' paramList? ')' block 'end' 'Procedure'
    ;

paramList
    : ID (',' ID)*
    ;

block
    : statement*
    ;

statement
    : assignment
    | ifStatement
    | whileStatement
    | forStatement
    | repeatStatement
    | returnStatement
    | expressionStatement
    ;

assignment
    : ID ASSIGN expression
    | ID '[' expression ']' ASSIGN expression
    ;

ifStatement
    : 'if' expression 'then' block
      ('else' 'if' expression 'then' block)*
      ('else' block)?
      'end' 'if'
    ;

whileStatement
    : 'while' expression 'do' block 'end' 'while'
    ;

forStatement
    : 'for' ID '←' expression 'to' expression 'do' block 'end' 'for'
    | 'for' 'each' ID 'in' expression 'do' block 'end' 'for'
    ;

repeatStatement
    : 'repeat' block 'until' expression
    ;

returnStatement
    : 'return' expression
    ;

expressionStatement
    : expression
    ;

expression
    : FLOOR_OPEN  expression FLOOR_CLOSE
    | CEIL_OPEN expression CEIL_CLOSE
    | expression ( TIMES | DIV ) expression
    | expression (PLUS | MINUS) expression
    | expression (EQ | NEQ | LT | GT | LEQ | GEQ) expression
    | expression (IN | NOT_IN) expression
    | expression (UNION | INTERSECT) expression
    | ID '(' argList? ')'  // function call
    | ID '[' arrayList ']'  // array access
    | primary
    ;

setElements
    : expression (',' expression)*
    ;

arrayList
    : NUMBER
    | STRING
    | BOOL
    | 'null'
    ;

primary
    : NUMBER
    | STRING
    | ID
    | 'true'
    | 'false'
    | 'null'
    | INFINITY
    | EMPTY_SET
    | '(' expression ')'
    | '[' argList? ']'  // array literal
    | '{' setElements? '}'  // set literal
    ;

argList
    : expression (',' expression)*
    ;

// TOKENS
INFINITY     : '∞' | 'inf' ;
EMPTY_SET    : '∅' ;
ASSIGN       : '←' | '<-' ;
IN           : '∈' | 'in' ;
NOT_IN       : '∉' | 'not' [ \t]+ 'in' ;
UNION        : '∪' | '|' ;
INTERSECT    : '∩' | '&' ;

// Floor and Ceiling
FLOOR_OPEN   : '⌊' | '[\\' ;
FLOOR_CLOSE  : '⌋' | '/]' ;
CEIL_OPEN    : '⌈' | '{|' ;
CEIL_CLOSE   : '⌉' | '|}' ;

// Comparison operators
EQ           : '=' ;
NEQ          : '≠' | '<>' ;
LT           : '<' ;
GT           : '>' ;
LEQ          : '≤' | '<=' ;
GEQ          : '≥' | '>=' ;

// Arithmetic operators
PLUS         : '+' ;
MINUS        : '-' ;
TIMES        : '×' | '*' ;
DIV          : '÷' | '/' ;

ID : [a-zA-Z_][a-zA-Z0-9_]* ;
BOOL : ('true'|'false') ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;
STRING : '"' (~["\r\n])* '"' ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : ';' ~[\r\n]* -> skip ;
MULTI_COMMENT  : '(-' .*? '-)' -> skip ;