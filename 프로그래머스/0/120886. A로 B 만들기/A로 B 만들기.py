def solution(before, after):
    answer = 1
    
    # 개수 같은지 판단
    for word in before:
        if before.count(word) != after.count(word):
            answer = 0
            
    return answer