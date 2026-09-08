def solution(numbers):
    num = [0,1,2,3,4,5,6,7,8,9]
    ans = 0
    
    for number in num:
        if number not in numbers:
            ans += number
    
    return ans