def solution(s):
    list_word = list(set(s))
    cnt = ""
    
    for i in list_word:
        if s.count(i) == 1:
            cnt += i       
            
    return "".join(sorted(cnt))