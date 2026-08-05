def solution(numbers):
    answer = 0

    sort_num = sorted(numbers)
    mul_minus = sort_num[0] * sort_num[1]
    mul_plus = sort_num[len(numbers) - 2] * sort_num[len(numbers) - 1]

    if mul_minus > mul_plus:
        answer = mul_minus
    else:
        answer = mul_plus

    return answer
