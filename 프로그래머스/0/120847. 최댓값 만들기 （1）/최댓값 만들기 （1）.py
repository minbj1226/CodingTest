def solution(numbers):
    answer = 0

    numbers.sort()
    answer = numbers[len(numbers)-2] * numbers[len(numbers)-1]
    
    return answer