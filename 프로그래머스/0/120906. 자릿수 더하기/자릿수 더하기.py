def solution(n):
    num = str(n)
    answer = 0
    
    for i in range (len(num)):
        answer += int(num[i])
    
    return answer