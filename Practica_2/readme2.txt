practica 2 , se crea carpeta ya archivo

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
WS  : [ \t\r\n]+ -> skip ;

antlr4 ControlFlow.g4
javac ControlFlow*.java

se crea el test.txt
x = 0;
while (x < 5) {
    x = x + 1;
}

java -cp ".:$ANTLR_JAR" org.antlr.v4.gui.TestRig ControlFlow prog -tree < test.txt

este es el arbol
@DiegoEspx ➜ /workspaces/Evaluacion-exp/Practica_2 (main) $ java -cp ".:$ANTLR_JAR" org.antlr.v4.gui.TestRig ControlFlow prog -tree < test.txt
(prog (stat (assign x = (expr 0)) ;) (stat while ( (cond (expr x) < (expr 5)) ) { (stat (assign x = (expr (expr x) + (expr 1))) ;) }))

estos son los tokens
java -cp ".:$ANTLR_JAR" org.antlr.v4.gui.TestRig ControlFlow prog -tokens < test.txt
@DiegoEspx ➜ /workspaces/Evaluacion-exp/Practica_2 (main) $ java -cp ".:$ANTLR_JAR" org.antlr.v4.gui.TestRig ControlFlow prog -tokens < test.txt
[@0,0:0='x',<ID>,1:0]
[@1,2:2='=',<'='>,1:2]
[@2,4:4='0',<INT>,1:4]
[@3,5:5=';',<';'>,1:5]
[@4,7:11='while',<'while'>,2:0]
[@5,13:13='(',<'('>,2:6]
[@6,14:14='x',<ID>,2:7]
[@7,16:16='<',<'<'>,2:9]
[@8,18:18='5',<INT>,2:11]
[@9,19:19=')',<')'>,2:12]
[@10,21:21='{',<'{'>,2:14]
[@11,27:27='x',<ID>,3:4]
[@12,29:29='=',<'='>,3:6]
[@13,31:31='x',<ID>,3:8]
[@14,33:33='+',<'+'>,3:10]
[@15,35:35='1',<INT>,3:12]
[@16,36:36=';',<';'>,3:13]
[@17,38:38='}',<'}'>,4:0]
[@18,39:38='<EOF>',<EOF>,4:1]

Respuestas Cuestionarios
1. A
2. C
3. A