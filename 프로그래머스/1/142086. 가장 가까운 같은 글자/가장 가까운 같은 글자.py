def solution(s):
    last = {}
    ans = []
    
    for idx, chk in enumerate(s):
        if chk in last:
            ans.append(idx - last[chk])
        else:
            ans.append(-1)
            
        last[chk] = idx
        
    return ans
