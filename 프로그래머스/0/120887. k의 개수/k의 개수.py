def solution(i, j, k):
    answer = 0
    
    for num in range(i, j+1):
        check = str(num) 
        compare = str(k) 
        
        answer += check.count(compare)      
        
    return answer