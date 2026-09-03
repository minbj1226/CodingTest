def solution(my_string):
    parts = my_string.split()
    first = int(parts[0])

    for calc in parts[1:]:
        if calc == "+":
            prev = "+"
        elif calc == "-":
            prev = "-"
        else:
            if prev == "+":
                first += int(calc)
            elif prev == "-":
                first -= int(calc)

    return first
