def solution(n):
    answer = 0
    compare = n
    
    while n != 0:
        if compare % n == 0:
            answer += n
        
        n-=1
        
    return answer