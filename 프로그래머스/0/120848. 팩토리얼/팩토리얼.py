def solution(n):
    ans = 1
    count = 1
    
    # 팩토리얼의 합이 n을 넘으면 안됨
    while True:
        count += 1
        ans *= count
        
        if ans > n:
            break
        
    return count-1