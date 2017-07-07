grammar Automato;

definicao: listaestados '\n' alfabeto '\n' transicao '\n' inicial '\n' finais '\n';

listaestados: estados ; 

estados: estado (',' estado)* ;
estado: 'q' NUM ;

alfabeto: palavra (',' palavra)*;
palavra: PAL;

transicao: funcao (',' funcao)*;
funcao: '(' estado ',' palavra ')' '->' estado;

inicial: estado;

finais: estados;

NUM: [0-9]+;
PAL: [a-z]+;
WS	:	[ \t\r\n]+ -> skip ;
