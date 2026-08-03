def solution(hp):
    answer = 0
    
    gen = hp // 5
    hp -= gen * 5
    sol = hp // 3
    hp -= sol * 3 
    wor = hp // 1
    hp -= wor * 1
    
    answer = gen + sol + wor
    
    return answer