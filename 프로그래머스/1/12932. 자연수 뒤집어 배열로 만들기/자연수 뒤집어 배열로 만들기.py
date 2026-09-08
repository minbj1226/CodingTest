def solution(n):
    answer = []
    
    # 0 1 2 3 4
    for i in range(len(str(n))):
        answer.append(str(n)[len(str(n))-i-1])
        
    answer = list(map(int, answer))
    
    return answer