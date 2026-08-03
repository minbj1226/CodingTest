def solution(n):
    answer = []

    while n != 0:
        if n % 2 == 1:
            answer.append(n)
        n -= 1
        
    return answer[::-1]