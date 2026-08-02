def solution(my_string):
    num = "123456789"
    answer = 0
    
    for word in my_string:
        if word in num:
            answer += int(word)
        
    return answer