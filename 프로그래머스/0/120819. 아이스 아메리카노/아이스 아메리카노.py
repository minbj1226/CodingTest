def solution(money):
    m = money // 5500
    count = money - 5500 * m
    
    answer = [m, count]
    return answer