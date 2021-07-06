def solution(s):
    answer = []
    li = s[2:-2].split('},{')
    li.sort(key = len)
    for i in li:
        for j in i.split(','):
            if not j in answer:
                answer.append(j)
    
    return list(map(int, answer))