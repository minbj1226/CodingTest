def solution(my_string):
    check = ""
    
    for word in my_string:
        if word not in check:
            check += word
        
        if word in check:
            continue
        
    return check