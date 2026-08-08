def solution(age):
    word = "abcdefghij"
    count = str(age)
    answer = ""
    
    for i in count:
        answer += word[int(i)]
    
    return answer