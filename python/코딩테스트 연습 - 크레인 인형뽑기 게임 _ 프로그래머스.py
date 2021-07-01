def solution(board, moves):
    answer = 0
    stk = []
    for m in moves:
        for i in range(len(board)):
            if board[i][m-1] != 0:
                stk.append(board[i][m-1])
                board[i][m-1] = 0
                
                if len(stk) > 1:
                    if stk[-1] == stk[-2]:
                        stk.pop(-1)
                        stk.pop(-1)
                        answer += 2
                break
    return answer