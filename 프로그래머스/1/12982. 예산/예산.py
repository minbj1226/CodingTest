def solution(d, budget):
    sort_d = sorted(d)
    total = 0
    cnt = 0
    
    for money in sort_d:
        total += money
        
        if total > budget:
            break
        cnt += 1
    
    return cnt