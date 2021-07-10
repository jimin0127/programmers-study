def solution(N, stages):
    answer = []
    percent = []
    for i in range(1, N+1):
        percent.append(stages.count(i)/max(len([j for j in stages if j >= i]), 1))
        
    index = sorted(percent, reverse = True)
    
    for i in range(len(percent)):
        answer.append(percent.index(index[i])+1)
        percent[percent.index(index[i])] = 2
    return answer