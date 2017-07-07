grammar Bool;
r	: 	pa r pf | r c r | b;
b	:	'V' | 'F';
pa	:	'(';
pf	:	')';
c	:	'e' | 'ou';

WS	:	[ \t\r\n]+ -> skip ;
