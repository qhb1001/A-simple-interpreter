from enum import Enum
import math
import exceptions


class TokenType(Enum):
    ORIGIN = "ORIGIN"
    SCALE = "SCALE"
    ROT = "ROT"
    IS = "IS"
    TO = "TO"
    STEP = "STEP"
    DRAW = "DRAW"
    FOR = "FOR"
    FROM = "FROM"
    T = "T"
    SEMICO = ';'
    L_BRACKET = '('
    R_BRACKET = ')'
    COMMA = ','
    PLUS = '+'
    MINUS = '-'
    MUL = '*'
    DIV = '/'
    POWER = '**'
    FUNC = "FUNCTION"
    CONST_ID = 21
    NONTOKEN = 22
    ERRTOKEN = 23


class Token:
    """This class stores the information for token
       token - 'TokenType' type
       lexeme - original string of input
       value - corresponding value if it is 'CONST_ID'
       func_ptr - function pointer if it is 'FUNC'
    """
    def __init__(self, token, lexeme="", value=0, func_ptr=None):
        self.token_type = token
        self.string = lexeme
        self.value = value
        self.func_ptr = func_ptr


def my_ln(x):
    return math.log(x, math.e)


def get_token(string):
    print(string)
    """This method returns token types for one whole line"""
    ans = []
    now = None
    base = 10
    decimal = 1
    isPoint = False
    for c in string:
        # at first, get the input
        if c.isalpha():
            # if 'now' is not initialized yet
            if now == None:
                now = c
            # else add the income part
            else:
                now = now + c
        elif c.isdigit():
            # get the double value
            if now == None:
                now = int(c)
            else:
                now = now * base + decimal * int(c)
                # update the 'decimal' to get a smaller number next time
                if isPoint:
                    decimal *= 0.1
        # if this is the beginning part of decimal
        elif c == '.':
            decimal = 0.1
            base = 1
            isPoint = True
        elif c == '/' or c == '*' or c == '+' or c == '-' or c == '(' or c == ')' or c == ',' or c == ';':
            now = c
        # second, deal with termination symbol ' '
        elif c == ' ':
            # '-'
            if now == TokenType.MINUS.value:
                ans.append(Token(TokenType.MINUS, lexeme=now))
                now = None
            # '+'
            elif now == TokenType.PLUS.value:
                ans.append(Token(TokenType.PLUS, lexeme=now))
                now = None
            # '*'
            elif now == TokenType.MUL.value:
                ans.append(Token(TokenType.MUL, lexeme=now))
                now = None
            # '/'
            elif now == TokenType.DIV.value:
                ans.append(Token(TokenType.DIV, lexeme=now))
                now = None
            # '('
            elif now == TokenType.L_BRACKET.value:
                ans.append(Token(TokenType.L_BRACKET, lexeme=now))
                now = None
            # ')'
            elif now == TokenType.R_BRACKET.value:
                ans.append(Token(TokenType.R_BRACKET, lexeme=now))
                now = None
            # ','
            elif now == TokenType.COMMA.value:
                ans.append(Token(TokenType.COMMA, lexeme=now))
                now = None
            # "ORIGIN"
            elif now == TokenType.ORIGIN.value:
                ans.append(Token(TokenType.ORIGIN, lexeme=now))
                now = None
            # "SCALE"
            elif now == TokenType.SCALE.value:
                ans.append(Token(TokenType.SCALE, lexeme=now))
                now = None
            # "ROT"
            elif now == TokenType.ROT.value:
                ans.append(Token(TokenType.ROT, lexeme=now))
                now = None
            # "IS"
            elif now == TokenType.IS.value:
                ans.append(Token(TokenType.IS, lexeme=now))
                now = None
            # "TO"
            elif now == TokenType.TO.value:
                ans.append(Token(TokenType.TO, lexeme=now))
                now = None
            # "STEP"
            elif now == TokenType.STEP.value:
                ans.append(Token(TokenType.STEP, lexeme=now))
                now = None
            # "DRAW"
            elif now == TokenType.DRAW.value:
                ans.append(Token(TokenType.DRAW, lexeme=now))
                now = None
            # "FOR"
            elif now == TokenType.FOR.value:
                ans.append(Token(TokenType.FOR, lexeme=now))
                now = None
            # "FROM"
            elif now == TokenType.FROM.value:
                ans.append(Token(TokenType.FROM, lexeme=now))
                now = None
            # "SIN"
            elif now == "SIN":
                ans.append(Token(TokenType.FUNC, lexeme="SIN", func_ptr=math.sin))
                now = None
            # "COS"
            elif now == "COS":
                ans.append(Token(TokenType.FUNC, lexeme="COS", func_ptr=math.cos))
                now = None
            # "EXP"
            elif now == "EXP":
                ans.append(Token(TokenType.FUNC, lexeme="EXP", func_ptr=math.exp))
                now = None
            # "SQRT"
            elif now == "SQRT":
                ans.append(Token(TokenType.FUNC, lexeme="SQRT", func_ptr=math.sqrt))
                now = None
            # "LN"
            elif now == "LN":
                ans.append(Token(TokenType.FUNC, lexeme="LN", func_ptr=my_ln))
                now = None
            # "TAN"
            elif now == "TAN":
                ans.append(Token(TokenType.FUNC, lexeme="TAN", func_ptr=math.tan))
                now = None
            elif now == ';':
                return ans
            else:
                if now == "PI":
                    ans.append(Token(TokenType.CONST_ID, lexeme=now, value=math.pi))
                elif now == "E":
                    ans.append(Token(TokenType.CONST_ID, lexeme=now, value=math.e))
                elif now == "T":
                    ans.append(Token(TokenType.T, lexeme=now))
                elif isinstance(now, str):
                    raise exceptions.NoSuchWord("No Such word:", now)
                elif isinstance(now, float) or isinstance(now, int):
                    ans.append(Token(TokenType.CONST_ID, lexeme=str(now), value=now))
                elif now == None:
                    continue

                # initialization
                now = None
                base = 10
                decimal = 1
                isPoint = False

    raise exceptions.NoSemico("Missing Semicolon at the end.")


def show(now):
    print("category".ljust(10), "original input".ljust(20), "value".ljust(20), "function pointer")
    for x in now:
        print(x.token_type.name.ljust(10), x.string.ljust(20), format(x.value, "<20"), x.func_ptr)


def preprocess(temp):
    temp = " + ".join(temp.split('+'))
    temp = " / ".join(temp.split('/'))
    temp = " * ".join(temp.split('*'))
    temp = " - ".join(temp.split('-'))
    temp = " , ".join(temp.split(','))
    temp = " ( ".join(temp.split('('))
    temp = " ) ".join(temp.split(')'))
    temp = " ; ".join(temp.split(';'))
    return temp
def scanner():
    try:
        lineNum = 1
        with open("code.txt") as fp:
            result = []
            for line in fp.readlines():
                print("Line", lineNum, ":")
                lineNum += 1
                now = get_token(preprocess(line))

                # to get '**' afterwards
                ans = []
                last = None
                for now_token in now:
                    if last != None and last.token_type == TokenType.MUL and now_token.token_type == TokenType.MUL:
                        ans.pop()
                        ans.append(Token(TokenType.POWER, lexeme='**'))
                        continue

                    last = now_token
                    ans.append(now_token)

                show(ans)
                result.append(ans)
            return result

    except OSError as e:
        print("LEXICAL EXCEPTION:", e)
    except exceptions.NoSuchWord as e:
        print("LEXICAL EXCEPTION:", e.args)
    except exceptions.NoSemico as e:
        print("LEXICAL EXCEPTION:", e.args)


scanner()

