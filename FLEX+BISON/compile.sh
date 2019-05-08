flex funcdraw.l
bison -dy funcdraw.y
source activate spinningup
gcc lex.yy.c y.tab.h -c main.c 
gcc -c semantics.h semantics.c
gcc main.o semantics.o
./a.out input.txt