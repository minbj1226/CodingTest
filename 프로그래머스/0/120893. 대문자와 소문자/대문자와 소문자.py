def solution(my_string):
    answer = ""

    for word in my_string:
        if word.isupper() == True:
            answer += word.lower()
        else:
            answer += word.upper()

    return answer
