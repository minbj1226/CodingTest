def solution(my_string):
    word = ""
    
    for str in my_string:
        word += str
    
    return word[::-1]