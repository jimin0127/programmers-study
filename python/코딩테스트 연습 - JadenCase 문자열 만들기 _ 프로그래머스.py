def solution(s):
    answer = []
    s = s.lower()
    s = list(s)
    flag = True
    
    for w in s:
        if w == ' ':
            flag = True
            answer.append(' ')
            continue
        if flag == True:
            answer.append(w.upper())
            flag = False
        else:
            answer.append(w)
            
            
        
    return "".join(answer)