def solution(emergency):
    copys = sorted(emergency, reverse=True)
    answer = []

    for num in emergency:
        answer.append(copys.index(num)+1)

    return answer
