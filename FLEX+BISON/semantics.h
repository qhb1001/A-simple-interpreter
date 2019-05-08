#ifndef SEMANTICS_H
#define SEMANTICS_H
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include "y.tab.h"


#define MAX_CHARS 200

extern double Parameter, start, end, step;
extern double Origin_x, Origin_y, Scale_x, Scale_y, Rot_angle;
extern unsigned int LineNo;

typedef double (*MathFuncPtr)(double);
typedef double (*FuncPtr)(double);
struct Token {
    char *lexeme;
    int type;
    double value;
    double (*FuncPtr)(double);
};
struct ExprNode {
    enum yytokentype OpCode;

    union {
        struct {struct ExprNode *Left, *Right;} CaseOperator;
        struct {struct ExprNode *Child; FuncPtr MathFuncPtr;} CaseFunc;
        double CaseConst;
        double *CaseParmPtr;
    } Content;
};
extern struct ExprNode *MakeExprNode(enum yytokentype opcode, ...);
extern void DrawLoop(double Start, double End, double Step, struct ExprNode * HorPtr, struct ExprNode * VerPtr);
extern void DrawPixel(double x, double y);
extern double GetExprValue(struct ExprNode * root);	
extern int yyparse();
#endif