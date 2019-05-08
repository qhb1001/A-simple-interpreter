/* A Bison parser, made by GNU Bison 3.2.4.  */

/* Bison interface for Yacc-like parsers in C

   Copyright (C) 1984, 1989-1990, 2000-2015, 2018 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* Undocumented macros, especially those whose name start with YY_,
   are private implementation details.  Do not rely on them.  */

#ifndef YY_YY_Y_TAB_H_INCLUDED
# define YY_YY_Y_TAB_H_INCLUDED
/* Debug traces.  */
#ifndef YYDEBUG
# define YYDEBUG 0
#endif
#if YYDEBUG
extern int yydebug;
#endif

/* Token type.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
  enum yytokentype
  {
    CONST_ID = 258,
    FUNC = 259,
    FOR = 260,
    FROM = 261,
    DRAW = 262,
    TO = 263,
    STEP = 264,
    ORIGIN = 265,
    SCALE = 266,
    ROT = 267,
    IS = 268,
    T = 269,
    ERRTOKEN = 270,
    SEMICO = 271,
    COMMA = 272,
    L_BRACKET = 273,
    R_BRACKET = 274,
    PLUS = 275,
    MINUS = 276,
    MUL = 277,
    DIV = 278,
    UNSUB = 279,
    POWER = 280
  };
#endif
/* Tokens.  */
#define CONST_ID 258
#define FUNC 259
#define FOR 260
#define FROM 261
#define DRAW 262
#define TO 263
#define STEP 264
#define ORIGIN 265
#define SCALE 266
#define ROT 267
#define IS 268
#define T 269
#define ERRTOKEN 270
#define SEMICO 271
#define COMMA 272
#define L_BRACKET 273
#define R_BRACKET 274
#define PLUS 275
#define MINUS 276
#define MUL 277
#define DIV 278
#define UNSUB 279
#define POWER 280

/* Value type.  */
#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef int YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define YYSTYPE_IS_DECLARED 1
#endif


extern YYSTYPE yylval;

int yyparse (void);

#endif /* !YY_YY_Y_TAB_H_INCLUDED  */
