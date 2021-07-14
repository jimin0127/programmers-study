def solution(s):
    answer = []
    _map = {'zero':'0', 'one':'1', 'two':'2', 'three':'3', 'four':'4', 'five':'5', 'six':'6', 'seven':'7', 'eight':'8', 'nine':'9'}
    
    number = ''
    for c in s:
        if c.isdigit():
            answer.append(c)
            continue 
        number += c
        if number in _map:
            answer.append(_map[number])
            number = ''
            
    return int(''.join(answer))