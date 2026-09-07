def solution(a, b):
    first = str(a) + str(b)
    second = str(b) + str(a)
    
    if int(first) > int(second):
        return int(first)
    elif int(first) < int(second):
        return int(second)
    else:
        return int(first)