def solution(cipher, code):
    answer = ""
    
    for num in range(len(cipher)+1):
        if (num % code == 0) and num != 0:
            answer += cipher[num-1]
            
    return answer