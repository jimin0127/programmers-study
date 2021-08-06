def solution(a, b):
    answer = ''
    days = ["THU", "FRI","SAT", "SUN","MON","TUE","WED"]
    months = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    d = sum([months[i] for i in range(a-1)])
    d += b
    return days[d % 7]