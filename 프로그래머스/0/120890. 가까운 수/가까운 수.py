def solution(array, n):
    ans = 0
    com = 100
    sol = 0

    arr = sorted(array)
    for num in arr:
        ans = abs(n-num)

        if com > ans:
            com = ans
            sol = num

    return sol

            