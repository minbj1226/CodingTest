def solution(left, right):
    total = 0
    
    for num in range(left, right+1):
        # num의 약수가 짝수면 값 더하기
        x = 0
        cnt = 0
        
        while num != x:
            x += 1
            if (num % x) == 0:
                cnt += 1
        
        if (cnt % 2) == 0:
            total += num
        else:
            total -= num
        
    return total