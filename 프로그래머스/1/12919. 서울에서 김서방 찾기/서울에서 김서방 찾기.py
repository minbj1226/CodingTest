def solution(seoul):
    answer = ''
    
    for idx, person in enumerate(seoul):
        if person == "Kim":
            answer = "김서방은 " + str(idx) + "에 있다"
            
    return answer