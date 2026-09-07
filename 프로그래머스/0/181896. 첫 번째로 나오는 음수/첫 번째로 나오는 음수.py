def solution(num_list):
    answer = 0

    for num in num_list:
        if num < 0:
            return answer
        
        answer += 1
        
    return -1 