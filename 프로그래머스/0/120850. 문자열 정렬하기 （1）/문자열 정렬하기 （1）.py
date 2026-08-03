def solution(my_string):
    num = "0123456789"
    answer = []

    for number in my_string:
        if number in num:
            answer.append(int(number))

    answer.sort()
    return answer