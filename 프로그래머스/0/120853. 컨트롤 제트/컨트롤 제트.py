def solution(s):
    answer = 0
    lst = []

    for idx, i in enumerate(s.split(" ")):
        lst.append(i)

        if i == "Z":
            answer -= int(lst[idx - 1])
        else:
            answer += int(i)

    return answer