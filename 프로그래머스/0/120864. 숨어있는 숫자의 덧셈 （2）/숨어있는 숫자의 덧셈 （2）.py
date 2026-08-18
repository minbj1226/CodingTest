def solution(my_string):
    answer = ""
    num = "0123456789"
    ans = 0 
    for word in my_string:
        if word in num:
            answer += word
        else:
            answer += " "

    ans = answer.strip().split(" ")
    sol = 0
    for i in ans:
        if i != '':
            sol += int(i)
    return sol