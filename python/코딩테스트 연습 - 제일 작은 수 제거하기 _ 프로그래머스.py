def solution(arr):
    if len(arr) == 1:
        return [-1]
    val = min(arr)
    while val in arr:
        arr.remove(val)
    return arr