def solution(n):
    answer = []
    sol = ""
    num = str(n)

    for i in num:
        answer.append(int(i))

    ans = sorted(answer, reverse=True)

    for j in ans:
        sol += str(j)
        
    return int(sol)