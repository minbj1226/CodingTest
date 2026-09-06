def solution(score):
    compare = []
    r = 0
    ans = []
    
    for s in score:
        compare.append(sum(s))
    
    for rank in compare:
        r = 1
        
        for others in compare:
            if others > rank:
                r += 1
                
        ans.append(r)
        
    return ans