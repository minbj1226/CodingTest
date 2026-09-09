def solution(s):
    flag = True
    
    if ((len(s) == 4) or (len(s) == 6)) and s.isdigit():
        flage = True
    else:
        flag = False
        
    return flag