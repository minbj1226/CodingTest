def solution(numbers):
    num = [
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
    ]

    for idx, number in enumerate(num):
        numbers = numbers.replace(number, str(idx))

    return int(numbers)
