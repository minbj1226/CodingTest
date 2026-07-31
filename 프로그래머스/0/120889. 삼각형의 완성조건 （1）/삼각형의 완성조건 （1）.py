def solution(sides):
    answer = 0
    big = sides[0]
    sum = 0
    
    #제일 큰값이 나머지 두개의 합보다 작으면 1 아니면 2
    for num in sides:
        sum += num
        if num > big:
            big = num
    
    
    if big >= sum - big:
        answer = 2
    else:
        answer = 1
    
    return answer