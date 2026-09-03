def solution(spell, dic):
    answer = 0
    
    for word in dic:
        check = "".join(spell)
        
        if sorted(word) == sorted(check):
            answer = 1
            break
        else:
            answer = 2
            
    return answer