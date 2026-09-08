def solution(x):
    answer = False
    total = 0
    ans = str(x)
    
    for i in range(len(ans)):
        total += int(ans[i])
    
    if x % total == 0:
        answer = True
               
    return answer