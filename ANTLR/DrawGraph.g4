grammar DrawGraph;

options {
    language=Java;
}

PLUS: '+';
MINUS: '-';
DIV: '/';
MUL: '*';
POWER: '**';
SEMICO: ';';
L_BRACKET: '(';
R_BRACKET: ')';
COMMA: ',';

CONST_ID: Integer
    | Real
    | NamedConst
    ;
fragment Integer: Digits;
fragment Digits: [0-9]+;
fragment Real: Fraction Exponent?
    | Digits Exponent
    ;
fragment Fraction: Digits? '.' Digits
    | Digits '.'
    ;
fragment Exponent: E [+-]? Digits;
fragment NamedConst: P I
    | E
    ;
ORIGIN: O R I G I N;
SCALE: S C A L E;
ROT: R O T;
IS: I S;
TO: T O;
STEP: S T E P;
DRAW: D R A W;
FOR: F O R;
FROM: F R O M;
RED: R E D;
BLUE: B L U E;
GREEN: G R E E N;
COLOR: C O L O R;
T1: T;
WS : [ \t\f\r\n]+ -> skip;
COMMENT: (
    '//' ~[\r\n]*
    | '--' ~[\r\n]*
    | '/*' .*? '*/'
) -> skip;
ID : [a-zA-Z_][a-zA-Z_0-9]*;
ErrText: .;
fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];
program: (statement SEMICO)* EOF
    ;
statement: originStatement
    | scaleStatement
    | rotStatement
    | forStatement
    | colorStatement
    | variableStatement
    ;
variableStatement: ID '=' expr #Assign
    ; 
originStatement: ORIGIN IS L_BRACKET expr COMMA expr R_BRACKET;
scaleStatement: SCALE IS L_BRACKET expr COMMA expr R_BRACKET;
rotStatement: ROT IS expr;
forStatement: FOR T1 FROM expr TO expr STEP expr DRAW L_BRACKET expr COMMA expr R_BRACKET;
colorStatement: COLOR IS BLUE
    | COLOR IS GREEN
    | COLOR IS RED
    | COLOR IS L_BRACKET expr COMMA expr COMMA expr R_BRACKET
    ;
expr: <assoc=right> expr POWER expr #PowerExpr
    | (PLUS|MINUS) expr #UnaryExpr
    | expr (MUL|DIV) expr #MulDivExpr
    | expr (PLUS|MINUS) expr #PlusMinusExpr
    | CONST_ID #Const
    | T1 #VarT
    | ID L_BRACKET expr R_BRACKET #FuncExpr
    | L_BRACKET expr R_BRACKET #NestedExpr
    | ID #VarExpr
    ;


