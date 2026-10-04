def solution(s):
    words = s.split(" ")
    ans = []
    
    for word in words:
        chk = ""
        for length in range(len(word)):
            if length % 2 == 0:
                chk += word[length].upper()
            else:
                chk += word[length].lower()
        ans.append(chk)
            
    return " ".join(ans)