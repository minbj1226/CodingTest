def solution(arr, divisor):
    answer = []
    
    for num in arr:
        if (num % divisor) == 0:
            answer.append(num)

    if len(answer) == 0:
        answer.append(-1)
    
    sort_num = sorted(answer)
    
    return sort_num