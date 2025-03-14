grammar Expr;

prog:   stat+;
stat:   expr ';';
expr:   expr ('*' | '/') expr         # MulDiv
      | expr ('+' | '-') expr         # AddSub
      | '(' expr ')'                  # Parens
      | ID '=' expr                   # Assign
      | INT                           # Int
      | ID                            # Id
      ;

ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;