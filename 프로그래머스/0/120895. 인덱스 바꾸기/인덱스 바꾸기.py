def solution(my_string, num1, num2):
    change = list(my_string)
    change[num1], change[num2] = change[num2], change[num1]
    
    answer = ""
    
    for word in change:
        answer += word

    return answer
