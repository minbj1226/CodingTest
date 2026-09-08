def solution(x, n):
    answer = []
    s = x
    
    while len(answer) != n:
        answer.append(x)
        x += s
        
    return answer