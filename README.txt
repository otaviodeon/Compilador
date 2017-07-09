Feito por Pedro Lima e Otávio Deon
[plima@inf.ufsm.br, odeon@inf.ufsm.br]

Trabalho Final de Compiladores - Um Interpretador para Autômatos Finitos Determinísticos

Ferramentas: ANTLR Parser Generator Version 4.7 
Linguagem java, com openjdk versão "1.8.0_111"


Para rodar o programa, rode no terminal "java Programa < arquivo.txt", onde arquivo.txt contém as informações do autômato e sua entrada.

O arquivo exemplo.txt contém a definição de um autômato conforme o padrão estabelecido.


Definição do Autômato:


A primeira linha da definição do automato contém o nome de todos estados, separados por vírgula. 
Os nomes válidos começam com q seguido de um número, por exemplo q1,q2,q3.

A segunda linha contém os simbolos definidos para o alfabeto da gramática, separados por vírgula. Só são aceitos letras minúsculas de 'a' a 'z'.

A terceira linha contém as transições de cada estado, separados entre parenteses. No exemplo (q1, a) -> q2, 
o estado q1 recebendo a entrada 'a' irá ir para o estado q2. É necessário colocar ',' entre duas transições.

A quarta linha é onde se define o estado inicial do automato.

A quinta linha define todos estados finais, utilizando o mesmo padrão de nomenclatura dos estados.

A sexta e última linha é a entrada do autômato, onde são aceitos caracteres variando de 'a' a 'z'. Esses caracteres tem de estar inclusos no conjunto alfabeto definido na segunda linha, ou a palavra não será reconhecida.