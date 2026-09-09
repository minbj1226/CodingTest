def solution(s):
    ans = sorted(s, reverse=True)
    words = ""
    
    for word in ans:
        words += word
        
    return words