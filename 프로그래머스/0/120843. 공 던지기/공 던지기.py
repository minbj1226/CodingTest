def solution(numbers, k):
    idx = 0
    for i in range(k-1): # k번 반복
        idx += 2
        if idx >= len(numbers):
            idx -= len(numbers)
    return numbers[idx]