def solution(n):
    answer = 0
    odd = 0
    
    while(answer < n):
        answer+=1
        
        if answer % 2 == 0:
            odd+=answer        
    
    return odd