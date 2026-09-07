def solution(quiz):
    answer = []

    # for문으로 문제 하나씩 빼내기
    for q in quiz:
        full_q = q.split("=")
        calc = full_q[0].split(" ")
        total = int(calc[0])
        prev = ""

        for num in calc[1:]:
            if num == "-":
                prev = "-"
            elif num == "+":
                prev = "+"
            elif num == "":
                continue
            else:
                if prev == "+":
                    total += int(num)
                elif prev == "-":
                    total -= int(num)

        # if 앞에 계산한 값과 뒤에 숫자가 같으면 answer.append("O")
        if total == int(full_q[1]):
            answer.append("O")
        # 계산과 숫자가 다르다면 answer.append("X")
        else:
            answer.append("X")

    return answer
