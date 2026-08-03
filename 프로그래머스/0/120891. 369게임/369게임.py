def solution(order):
    answer = 0
    orders = str(order)
    
    for num in orders:
        if num == '3' or num == '6' or num == '9':
            answer += 1
            
    return answer