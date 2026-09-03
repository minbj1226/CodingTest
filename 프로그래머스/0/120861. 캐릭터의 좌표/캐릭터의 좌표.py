def solution(keyinput, board):
    answer = []
    x = 0
    y = 0

    for key in keyinput:
        if key == "left":
            if x <= -(board[0] // 2):
                continue
            x -= 1
        elif key == "right":
            if x >= (board[0] // 2):
                continue
            x += 1
        elif key == "up":
            if y >= (board[1] // 2):
                continue
            y += 1
        elif key == "down":
            if y <= -(board[1] // 2):
                continue
            y -= 1

    answer.append(x)
    answer.append(y)

    return answer
