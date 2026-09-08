def solution(n):
    answer = -1
    
    if int(n ** 0.5) * int(n ** 0.5) == n:
        answer = (int(n ** 0.5) + 1) ** 2
    
    return answer