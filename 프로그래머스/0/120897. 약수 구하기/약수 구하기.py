def solution(n):
    answer = []
    num = 0
    
    while num != n:
        num += 1
        if n % num == 0:
            answer.append(num)
        
    return answer