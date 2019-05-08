import exceptions
import lexical


# first deal with the brackets
def check_brackets(lines):
    line_number = 0

    # if last
    if lines == None:
        exit()

    for line in lines:
        stack = []
        line_number += 1
        for token in line:
            # if this is a '(', then just push it into the stack
            if token.token_type == lexical.TokenType.L_BRACKET:
                stack.append('(')
            # else if this is a ')', then check is there exists a '(' on top of stack
            elif token.token_type == lexical.TokenType.R_BRACKET:
                if len(stack) == 0:
                    raise exceptions.BracketException("BracketException in line", line_number, ", missing left bracket.")
                elif stack.pop() != '(':
                    raise exceptions.BracketException("BracketException in line", line_number, ", missing right bracket.")

        if len(stack) != 0:
            raise exceptions.BracketException("BracketException in line", line_number, ", missing right bracket.")


def check_for(line, line_number):
    # define the syntax of FOR-LOOP statement should be
    # FOR T FROM CONST_ID TO CONST_ID STEP CONST_ID DRAW (T,T)
    check_list = []
    check_list.append(lexical.TokenType.FOR)
    check_list.append(lexical.TokenType.T)
    check_list.append(lexical.TokenType.FROM)
    check_list.append(lexical.TokenType.CONST_ID)
    check_list.append(lexical.TokenType.TO)
    check_list.append(lexical.TokenType.CONST_ID)
    check_list.append(lexical.TokenType.STEP)
    check_list.append(lexical.TokenType.CONST_ID)
    check_list.append(lexical.TokenType.DRAW)
    check_list.append(lexical.TokenType.L_BRACKET)
    check_list.append(lexical.TokenType.T)
    check_list.append(lexical.TokenType.COMMA)
    check_list.append(lexical.TokenType.T)
    check_list.append(lexical.TokenType.R_BRACKET)

    length = len(check_list)
    idx = 0
    for token in line:
        if token.token_type == check_list[idx]:
            idx += 1
        if idx == length:
            break

    if idx != length:
        raise exceptions.SyntaxNotMatched("Syntax not matched exception in line", line_number)


def check_rot(line, line_number):
    # define the syntax of ROT-IS statement should be
    # ROT IS CONST_ID
    check_list = []
    check_list.append(lexical.TokenType.ROT)
    check_list.append(lexical.TokenType.IS)
    check_list.append(lexical.TokenType.CONST_ID)

    length = len(check_list)
    idx = 0
    for token in line:
        if token.token_type == check_list[idx]:
            idx += 1
        if idx == length:
            break

    if idx != length:
        raise exceptions.SyntaxNotMatched("Syntax not matched exception in line", line_number)


def check_scale(line, line_number):
    # define the syntax of SCALE-IS statement should be
    # SCALE IS (CONST_ID,CONST_ID)
    check_list = []
    check_list.append(lexical.TokenType.SCALE)
    check_list.append(lexical.TokenType.IS)
    check_list.append(lexical.TokenType.L_BRACKET)
    check_list.append(lexical.TokenType.CONST_ID)
    check_list.append(lexical.TokenType.COMMA)
    check_list.append(lexical.TokenType.CONST_ID)
    check_list.append(lexical.TokenType.R_BRACKET)

    length = len(check_list)
    idx = 0
    for token in line:
        if token.token_type == check_list[idx]:
            idx += 1
        if idx == length:
            break

    if idx != length:
        raise exceptions.SyntaxNotMatched("Syntax not matched exception in line", line_number)


def check_origin(line, line_number):
    # define the syntax of SCALE-IS statement should be
    # SCALE IS (CONST_ID,CONST_ID)
    check_list = []
    check_list.append(lexical.TokenType.ORIGIN)
    check_list.append(lexical.TokenType.IS)
    check_list.append(lexical.TokenType.L_BRACKET)
    check_list.append(lexical.TokenType.CONST_ID)
    check_list.append(lexical.TokenType.COMMA)
    check_list.append(lexical.TokenType.CONST_ID)
    check_list.append(lexical.TokenType.R_BRACKET)

    length = len(check_list)
    idx = 0
    for token in line:
        if token.token_type == check_list[idx]:
            idx += 1
        if idx == length:
            break

    if idx != length:
        raise exceptions.SyntaxNotMatched("Syntax not matched exception in line", line_number)


def check_grammar(lines):
    try:
        check_brackets(lines)

        line_number = 0
        for line in lines:
            line_number += 1
            if line[0].token_type == lexical.TokenType.FOR:
                check_for(line, line_number)
            elif line[0].token_type == lexical.TokenType.ROT:
                check_rot(line, line_number)
            elif line[0].token_type == lexical.TokenType.SCALE:
                check_scale(line, line_number)
            elif line[0].token_type == lexical.TokenType.ORIGIN:
                check_origin(line, line_number)

    except exceptions.BracketException as e:
        print("GRAMMAR EXCEPTION:", e.args)
    except exceptions.SyntaxNotMatched as e:
        print("GRAMMAR EXCEPTION:", e.args)


