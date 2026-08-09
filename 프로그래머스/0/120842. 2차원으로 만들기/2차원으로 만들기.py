def solution(num_list, n):
    answer = []
    length = len(num_list) # 8
    
    for i in range(0, length, n):
        answer.append(num_list[i:i+n])
        
    return answer