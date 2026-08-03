def solution(array, height):
    answer = 0
    
    for compare in array:
        if compare > height:
            answer +=1 
            
    return answer