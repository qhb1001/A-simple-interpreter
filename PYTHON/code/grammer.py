import expression
import exceptions
import lexical
import matplotlib.pyplot as plt
import numpy as np
import math

angle, scale_x, scale_y, origin_x, origin_y = 0, 1, 1, 0, 0


def match_token(token, want):
    # statement to debug
    # print(token, want)
    if token != want:
        raise exceptions.SyntaxNotMatched()


def find_index(token_list, want, start=0):
    for i in range(start, len(token_list)):
        token = token_list[i].string
        if token == want:
            return i

    raise exceptions.SyntaxNotMatched()


def get_expression(token_list):
    root, flag = expression.expression(token_list)

    if flag == False:
        raise exceptions.SyntaxNotMatched

    return root


def program():
    lines = lexical.scanner()
    results = []  # to store the information of expressions of statement
    for line in lines:
        dir = for_statement(line)
        if dir:
            results.append(dir)
            print("<-------------- Structure of FOR Statement -------------->")
            print("*************** Expression Tree of FROM ***************")
            dir["FROM"].traverse()
            print("*************** Expression Tree of TO ***************")
            dir["TO"].traverse()
            print("*************** Expression Tree of STEP ***************")
            dir["STEP"].traverse()
            print("*************** Expression Tree of X ***************")
            dir["X"].traverse()
            print("*************** Expression Tree of Y ***************")
            dir["Y"].traverse()
            continue

        dir = scale_statement(line)
        if dir:
            results.append(dir)
            print("<-------------- Structure of SCALE Statement -------------->")
            print("*************** Expression Tree of X ***************")
            dir["X"].traverse()
            print("*************** Expression Tree of Y ***************")
            dir["Y"].traverse()
            continue

        dir = rot_statement(line)
        if dir:
            results.append(dir)
            print("<-------------- Structure of ROT Statement -------------->")
            print("*************** Expression Tree of ANGLE ***************")
            dir["ANGLE"].traverse()
            continue

        dir = origin_statement(line)
        if dir:
            results.append(dir)
            print("<-------------- Structure of ORIGIN Statement -------------->")
            print("*************** Expression Tree of X ***************")
            dir["X"].traverse()
            print("*************** Expression Tree of Y ***************")
            dir["Y"].traverse()
            continue

        # if the statement is not matched, then error
        raise exceptions.SyntaxNotMatched("Syntax not matched")

    return {"lines": lines, "results": results}


def draw(FROM, TO, STEP, X, Y):
    x, y = [], []
    X.find_T()
    Y.find_T()
    for T in np.arange(FROM, TO, STEP):
        x.append(X.calculate(T))
        y.append(Y.calculate(T))

    # print(scale_x, scale_y)
    x = np.array(x) * scale_x
    y = np.array(y) * scale_y
    temp = x * math.cos(angle) + y * math.sin(angle)
    y = y * math.cos(angle) - x * math.sin(angle)
    x = temp
    x = x + origin_x
    y = y + origin_y
    # print(x)
    # print(y)
    plt.scatter(x, y, s=1)



def for_statement(token_list):
    """to match the structure of FOR statement"""
    try:
        dir = {}
        match_token(token_list[0].token_type.value, "FOR")
        match_token(token_list[1].token_type.value, "T")
        match_token(token_list[2].token_type.value, "FROM")
        s, t = 3, find_index(token_list, "TO")
        dir['FROM'] = get_expression(token_list[s:t])

        s = t + 1
        t = find_index(token_list, "STEP")
        dir['TO'] = get_expression(token_list[s:t])

        s = t + 1
        t = find_index(token_list, "DRAW")
        dir['STEP'] = get_expression(token_list[s:t])

        print(token_list[t + 1].string == '(')

        match_token(token_list[t + 1].string, '(')

        s = t + 2
        t = find_index(token_list, ',')
        dir['X'] = get_expression(token_list[s:t])

        s = t + 1
        t = len(token_list) - 1
        dir['Y'] = get_expression(token_list[s:t])

        match_token(token_list[-1].string, ')')

        draw(dir['FROM'].calculate(), dir['TO'].calculate(), dir['STEP'].calculate(), dir['X'], dir['Y'])
        return dir

    except exceptions.SyntaxNotMatched:
        return None


def scale_statement(token_list):
    """to match the structure of SCALE statement"""
    try:
        dir, s, t = {}, 0, 0
        match_token(token_list[0].string, "SCALE")
        match_token(token_list[1].string, "IS")
        match_token(token_list[2].string, "(")
        s, t = 3, find_index(token_list, ",")
        dir['X'] = get_expression(token_list[s:t])
        s, t = t + 1, len(token_list) - 1
        dir['Y'] = get_expression(token_list[s:t])
        match_token(token_list[t].string, ')')

        # semantic analysis
        global scale_y, scale_x
        scale_x, scale_y = dir['X'].calculate(), dir['Y'].calculate()

        return dir
    except exceptions.SyntaxNotMatched:
        return None


def rot_statement(token_list):
    """to match the structure of ROT statement"""
    try:
        dir = {}
        match_token(token_list[0].string, "ROT")
        match_token(token_list[1].string, "IS")
        dir["ANGLE"] = get_expression(token_list[2:len(token_list)])

        # semantic analysis
        global angle
        angle = dir['ANGLE'].calculate()
        return dir

    except exceptions.SyntaxNotMatched:
        return None


def origin_statement(token_list):
    """to match the structure of ORIGIN statement"""
    try:
        dir, s, t = {}, 0, 0
        match_token(token_list[0].string, "ORIGIN")
        match_token(token_list[1].string, "IS")
        match_token(token_list[2].string, "(")
        s, t = 3, find_index(token_list, ",")
        dir['X'] = get_expression(token_list[s:t])
        s, t = t + 1, len(token_list) - 1
        dir['Y'] = get_expression(token_list[s:t])
        match_token(token_list[t].string, ')')

        # semantic analysis
        global origin_x, origin_y
        origin_x, origin_y = dir['X'].calculate(), dir['Y'].calculate()
        return dir
    except exceptions.SyntaxNotMatched:
        return None


try:
    program()
    ax = plt.gca()
    plt.xlim(0)
    plt.ylim(0)
    ax.set_aspect("equal")
    ax.xaxis.set_ticks_position('top')
    ax.invert_yaxis()
    plt.show()
except exceptions.SyntaxNotMatched as e:
    print("GRAMMAR EXCEPTION:", e.args)

