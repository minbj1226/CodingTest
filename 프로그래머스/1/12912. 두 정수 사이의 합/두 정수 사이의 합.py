def solution(a, b):
    sum = 0
    max_num = max(a, b)
    min_num = min(a, b)
    
    for i in range(min_num, max_num+1):
        sum += i
        
    return sum