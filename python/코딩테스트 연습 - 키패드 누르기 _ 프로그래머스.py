def solution(numbers, hand):
    answer = ''
    left = '*'
    right = '#'
    for n in numbers:
        if n in [1, 4, 7]:
            answer += 'L'
            left = n
            continue
        elif n in [3, 6, 9]:
            answer += 'R'
            right = n
            continue
        else : 
            left_, right_ = check(left, right, n)
            if left_ < right_:
                answer += 'L'
                left = n
            elif left_ > right_:
                answer += 'R'
                right = n
            else : 
                if hand == 'left':
                    answer += 'L'
                    left = n
                else : 
                    answer += 'R'
                    right = n
                
    return answer

def check(left, right, n):
    keypad = {1: [0, 0], 2:[0, 1], 3:[0, 2],
             4:[1, 0], 5:[1, 1], 6:[1, 2],
             7:[2, 0], 8:[2, 1], 9:[2, 2],
             '*':[3, 0], 0 : [3, 1], '#':[3, 2]}
    left_ =  abs(keypad[n][0] - keypad[left][0]) + abs(keypad[n][1] -keypad[left][1])
    right_ = abs(keypad[n][0] - keypad[right][0]) + abs(keypad[n][1] -keypad[right][1])
    
    return left_, right_