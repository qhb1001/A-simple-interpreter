#include "semantics.h"
#include <stdarg.h>
#include <stdlib.h>
#include <string.h>
#include <stdio.h>
extern double Parameter, start, end, step;
extern double Origin_x, Origin_y, Scale_x, Scale_y, Rot_angle;
extern unsigned int LineNo;

void DrawLoop(double Start, double End, double Step, struct ExprNode * HorPtr, struct ExprNode * VerPtr);
void DrawPixel(double x, double y);
double GetExprValue(struct ExprNode * root);
void Errmsg(char *string);
static void CalcCoord(struct ExprNode *Hor_Exp, struct ExprNode *Ver_Exp, double *Hot_x, double *Ver_y);

void Errmsg(char *string) {exit(1);}


void DrawLoop(double Start, double End, double Step, struct ExprNode *HorPtr, struct ExprNode *VerPtr)
{
    double x, y;
    // printf("start: %f end: %f, step: %f\n", Start, End, Step);
    for (Parameter = Start; Parameter <= End; Parameter += Step)
    {

        CalcCoord(HorPtr, VerPtr, &x, &y);
        // printf("%f %f\n", x, y);
        DrawPixel(x, y);
    }
}

double GetExprValue(struct ExprNode* root)
{
    if (root == NULL) return 0.0;
    switch(root->OpCode) 
    {
        case PLUS:
            return GetExprValue(root->Content.CaseOperator.Left) + 
                    GetExprValue(root->Content.CaseOperator.Right);
        case MINUS:
            return GetExprValue(root->Content.CaseOperator.Left) - 
                    GetExprValue(root->Content.CaseOperator.Right);            
        case MUL:
            return GetExprValue(root->Content.CaseOperator.Left) * 
                    GetExprValue(root->Content.CaseOperator.Right);

        case DIV:
            return GetExprValue(root->Content.CaseOperator.Left) / 
                    GetExprValue(root->Content.CaseOperator.Right);

        case POWER:
            return pow(GetExprValue(root->Content.CaseOperator.Left), 
                    GetExprValue(root->Content.CaseOperator.Right));

        case FUNC:
            return (* root->Content.CaseFunc.MathFuncPtr)
                    (GetExprValue(root->Content.CaseFunc.Child));
        case CONST_ID:
            return root->Content.CaseConst;
        case T:
            return *(root->Content.CaseParmPtr);
        default:
            return 0.0;
    }
}

void DrawPixel(double x, double y)
{
    FILE* fp = fopen("output.txt", "a+");
    if (fp == NULL) 
    {
        printf("File open error\n");
        exit(0);
    }
    fprintf(fp, "%f %f\n", x, y);
    fclose(fp);
}
void CalcCoord(struct ExprNode *Hor_Exp, struct ExprNode *Ver_Exp, double *Hot_x, double *Ver_y)
{
    double HorCord, VerCord, Hor_tmp;

    HorCord = GetExprValue(Hor_Exp);
    VerCord = GetExprValue(Ver_Exp);

    // printf("HorCord: %f VerCord: %f\n", HorCord, VerCord);
    
    HorCord *= Scale_x;
    VerCord *= Scale_y;

    Hor_tmp = HorCord * cos(Rot_angle) + VerCord * sin(Rot_angle);
    VerCord = VerCord * cos(Rot_angle) - HorCord * sin(Rot_angle);
    HorCord = Hor_tmp;

    HorCord += Origin_x;
    VerCord += Origin_y;

    *Hot_x = HorCord;
    *Ver_y = VerCord;
}