#define YYSTYPE struct ExprNode*
#include <string.h>
#include "semantics.h"
#include "lex.yy.c"
#include "y.tab.c"

char SrcFilePath[MAX_CHARS];

static FILE *InFile;
static int CheckSrcFile(char filename[]);
static void CloseFile();
extern int yyparse();
extern FILE *yyin;

int main(int argc,char* argv[])
{
    // for (int i = 0; i < argc; ++i) printf("line %d: %s\n", i, argv[i]);
    // printf("%d\n", argc);
    if (argc != 2) {printf("conmmand line parameters error!\n"); exit(0);}

    if (!CheckSrcFile(argv[1])) return 1;
    yyparse();
    CloseFile();
    system("python funcdraw.py");
}

int CheckSrcFile(char filename[])
{
    InFile = NULL;
    if (strlen(filename) == 0) 
    {
        // MessageBox(NULL, "未指定源程序文件", "错误", MB_OK);
        printf("没有指定文件名\n");
        return 0;
    }
    if ((InFile = fopen(filename, "r")) == NULL)
    {
        // MessageBox(NULL, "打开源程序文件出错", "错误", MB_OK);
        printf("打开源程序文件出错\n");
        return 0;
    }
    yyin = InFile;

    FILE* temp = fopen("output.txt", "w");
    fclose(temp);
    return 1;
}

static void CloseFile() {if (InFile != NULL) fclose(InFile);}

