creamos el archivo
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

antlr4 For.g4
javac For*.java

creamos archivo test.txt
for (i = 0; i < 10; i = i + 1) {
    x = x + i;
}

Creacion del arbol
java -cp ".:$ANTLR_JAR" org.antlr.v4.gui.TestRig For prog -tree < test.txt
@DiegoEspx ➜ /workspaces/Evaluacion-exp/Practica_3 (main) $ java -cp ".:$ANTLR_JAR" org.antlr.v4.gui.TestRig For prog -tree < test.txt
(prog (sentencia (forStmt for ( (inicializacion i = (expresion 0)) ; (condicion i < 10) ; (actualizacion i = (expresion (expresion i) + (expresion 1))) ) { (sentencia (asignacion x = (expresion (expresion x) + (expresion i)) ;)) })))

Estos son los tokens
@DiegoEspx ➜ /workspaces/Evaluacion-exp/Practica_3 (main) $ java -cp ".:$ANTLR_JAR" org.antlr.v4.gui.TestRig For prog -tokens < test.txt
[@0,0:2='for',<'for'>,1:0]
[@1,4:4='(',<'('>,1:4]
[@2,5:5='i',<ID>,1:5]
[@3,7:7='=',<'='>,1:7]
[@4,9:9='0',<INT>,1:9]
[@5,10:10=';',<';'>,1:10]
[@6,12:12='i',<ID>,1:12]
[@7,14:14='<',<'<'>,1:14]
[@8,16:17='10',<INT>,1:16]
[@9,18:18=';',<';'>,1:18]
[@10,20:20='i',<ID>,1:20]
[@11,22:22='=',<'='>,1:22]
[@12,24:24='i',<ID>,1:24]
[@13,26:26='+',<'+'>,1:26]
[@14,28:28='1',<INT>,1:28]
[@15,29:29=')',<')'>,1:29]
[@16,31:31='{',<'{'>,1:31]
[@17,37:37='x',<ID>,2:4]
[@18,39:39='=',<'='>,2:6]
[@19,41:41='x',<ID>,2:8]
[@20,43:43='+',<'+'>,2:10]
[@21,45:45='i',<ID>,2:12]
[@22,46:46=';',<';'>,2:13]
[@23,48:48='}',<'}'>,3:0]
[@24,49:48='<EOF>',<EOF>,3:1]

Respuestas Cuestionario
1. A
2. B
3. A