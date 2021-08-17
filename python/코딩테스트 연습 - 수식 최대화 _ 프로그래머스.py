import re
from itertools import permutations

def solution(expr):
    seq = ["*", "+", "-"]

    for op in seq:
        expr = expr.replace(op, " " + op + " ")

    spl = expr.split(' ')

    def f(spl, op_seq):
        for op in op_seq:
            while True:
                try:
                    idx = spl.index(op)
                    o1 = spl[idx - 1]
                    o2 = spl[idx + 1]
                    r = eval(o1 + op + o2)
                    spl = spl[:idx - 1] + [str(r)] + spl[idx + 2:]
                except ValueError:
                    break
        return abs(int(spl[0]))

    m = -1

    for p in list(permutations(["*", "+", "-"], 3)):
        seq = list(p)
        r = f(spl, seq)
        if r > m:
            m = r

    return m