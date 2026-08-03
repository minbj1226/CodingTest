def solution(num, k):
    answer = -1
    compare = str(num)

    for word in compare:
        if word == str(k):
            answer = compare.index(str(k))+1 # 인덱스는 원래 위치보다 -1이므로
            break

    return answer
