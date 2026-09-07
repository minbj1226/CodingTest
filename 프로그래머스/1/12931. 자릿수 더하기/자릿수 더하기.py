def solution(n):
    answer = 0
    trans = str(n)
    
    for num in trans:
        answer += int(num)

    return answer