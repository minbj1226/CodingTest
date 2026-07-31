def solution(my_string):
    words = "aeiou"
    answer = ""

    for char in my_string:
        if char not in words:
            answer += char
    
    return answer