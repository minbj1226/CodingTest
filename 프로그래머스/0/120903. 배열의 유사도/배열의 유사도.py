def solution(s1, s2):
    answer = 0
    
    for word1 in s1:
        for word2 in s2:
            if word1 == word2:
                answer += 1
    
    return answer