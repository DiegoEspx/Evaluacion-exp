grammar ControlFlow;

prog:   stat+;
stat:   'while' '(' cond ')' '{' stat* '}' | assign ';' ;
assign: ID '=' expr;
expr:   expr ('+' | '-') expr
      | ID
      | INT
      | '(' expr ')' ;

cond:   expr ('<' | '>' | '==' | '!=') expr;

ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;