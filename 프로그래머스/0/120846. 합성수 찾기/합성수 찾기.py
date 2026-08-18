def solution(n):
    count = 0

    for num in range(1, n+1):
        div = 0
        for i in range(1, num+1):
            if num % i == 0:
                div += 1

        if div>=3:
            count += 1

    return count