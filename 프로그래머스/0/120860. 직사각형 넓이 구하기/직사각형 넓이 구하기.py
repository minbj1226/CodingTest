def solution(dots):
    answer = 0
    x = []
    y = []
    
    # x와 y 좌표 각각 최대와 최소 빼서 곱
    for dot in dots:
        x.append(dot[0])
        y.append(dot[1])

    maxX = max(x)
    minX = min(x)
    maxY = max(y)
    minY = min(y)
    
    return (maxX - minX) * (maxY - minY) 