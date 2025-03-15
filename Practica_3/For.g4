grammar For;

prog: sentencia+ ;  // Esta es la regla de inicio

sentencia
    : forStmt
    | asignacion
    ;

forStmt
    : 'for' '(' inicializacion ';' condicion ';' actualizacion ')' '{' sentencia* '}'
    ;

inicializacion
    : ID '=' expresion
    ;

condicion
    : ID ('<' | '>' | '==' | '!=') INT
    ;

actualizacion
    : ID '=' expresion
    ;

asignacion
    : ID '=' expresion ';'
    ;

expresion
    : expresion ('+' | '-') expresion
    | INT
    | ID
    | '(' expresion ')'
    ;

ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;