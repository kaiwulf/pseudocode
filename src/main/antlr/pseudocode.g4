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
    : ID '←' expression
    | ID '[' expression ']' '←' expression
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
    : primary
    | '⌊' expression '⌋'
    | '⌈' expression '⌉'
    | expression ('×' | '*' | '÷' | '/') expression
    | expression ('+' | '-') expression
    | expression ('=' | '≠' | '<' | '>' | '≤' | '≥') expression
    | expression ('∈' | '∉') expression
    | expression ('∪' | '∩') expression
    | ID '(' argList? ')'  // function call
    | ID '[' expression ']'  // array access
    ;

primary
    : NUMBER
    | STRING
    | ID
    | 'true'
    | 'false'
    | 'null'
    | '∞'
    | '∅'
    | '(' expression ')'
    | '[' argList? ']'  // array literal
    ;

argList
    : expression (',' expression)*
    ;

ID : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;
STRING : '"' (~["\r\n])* '"' ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;