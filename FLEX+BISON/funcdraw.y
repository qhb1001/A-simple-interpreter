%{
#include "semantics.h"
#include <stdarg.h>
extern int yylex(void);
extern char *yytext;
double Parameter = 0, start = 0, end = 0, step = 0;
double Origin_x = 0, Origin_y = 0, Scale_x = 1, Scale_y = 1;
double Rot_angle = 0;
extern struct Token tokens;
void yyerror(const char *Msg)
{
    char errmsg[200];
    memset(errmsg, 0, 200);
    sprintf(errmsg, "Line %5d : %s", LineNo, Msg);
    printf("error exists at %s\n", errmsg);

}
%}

%token CONST_ID FUNC FOR FROM DRAW TO STEP ORIGIN SCALE;
%token ROT IS T ERRTOKEN SEMICO COMMA L_BRACKET R_BRACKET;
%left PLUS MINUS;
%left MUL DIV;
%right UNSUB;
%right POWER;
%start Program;

%%
Program: 
    | Program Statement SEMICO 
    ;
Statement:
    FOR T FROM Expr TO Expr STEP Expr DRAW L_BRACKET Expr COMMA Expr R_BRACKET
        {
            start = GetExprValue($4);
            end = GetExprValue($6);
            step = GetExprValue($8);
            DrawLoop(start, end, step, $11, $13);
            printf("DrawLoop start %.2f to %.2f, step %.2f\n", start, end, step);
        }
    | ORIGIN IS L_BRACKET Expr COMMA Expr R_BRACKET
        {
            Origin_x = GetExprValue($4);
            Origin_y = GetExprValue($6);
            printf("Set Origin(%.2f, %.2f)\n", Origin_x, Origin_y);
        }
    | SCALE IS L_BRACKET Expr COMMA Expr R_BRACKET
        {
            Scale_x = GetExprValue($4);
            Scale_y = GetExprValue($6);
            printf("Set Scale(%.2f, %.2f)\n", Scale_x, Scale_y);
        }
    | ROT IS Expr
        {
            Rot_angle = GetExprValue($3);
            printf("Set ROT(%.2f)\n", Rot_angle);
        }
    ;
Expr: T {$$ = MakeExprNode(T);}
    | CONST_ID {$$ = MakeExprNode(CONST_ID, tokens.value);}
    | Expr PLUS Expr {$$ = MakeExprNode(PLUS, $1, $3);}
    | Expr MINUS Expr {$$ = MakeExprNode(MINUS, $1, $3);}
    | Expr MUL Expr {$$ = MakeExprNode(MUL, $1, $3);}
    | Expr DIV Expr {$$ = MakeExprNode(DIV, $1, $3);}
    | Expr POWER Expr {$$ = MakeExprNode(POWER, $1, $3);}
    | L_BRACKET Expr R_BRACKET {$$ = $2;}
    | PLUS Expr %prec UNSUB {$$ = $2;}
    | MINUS Expr %prec UNSUB
        {$$ = MakeExprNode(MINUS, MakeExprNode(CONST_ID, 0.0), $2);}
    | FUNC L_BRACKET Expr R_BRACKET
        {$$ = MakeExprNode(FUNC, tokens.FuncPtr, $3);}
    | ERRTOKEN {yyerror("error token in the input");}
    ;
%%


struct ExprNode * MakeExprNode(enum yytokentype opcode, ...)
{
    va_list ArgPtr;
    struct ExprNode *ExprPtr = malloc(sizeof(struct ExprNode));
    ExprPtr->OpCode = opcode;
    va_start(ArgPtr, opcode);
    switch(opcode)
    {
        case CONST_ID:
            ExprPtr->Content.CaseConst = (double)va_arg(ArgPtr, double);
            break;
        case T:
            ExprPtr->Content.CaseParmPtr = &Parameter;
            break;
        case FUNC:
            ExprPtr->Content.CaseFunc.MathFuncPtr = (FuncPtr)va_arg(ArgPtr, FuncPtr);
            ExprPtr->Content.CaseFunc.Child = (struct ExprNode *) va_arg (ArgPtr, struct ExprNode *);
            break;
        default:
            ExprPtr->Content.CaseOperator.Left = (struct ExprNode*)va_arg(ArgPtr, struct ExprNode *);
            ExprPtr->Content.CaseOperator.Right = (struct ExprNode *)va_arg(ArgPtr, struct ExprNode *);
            break;
    }
    return ExprPtr;
}