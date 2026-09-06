# balls 가지고 있는 개수, share는 나누어 줄 개수
def solution(balls, share):
    answer = 0
    m = 1
    n_m = 1
    n = 1
    
    for i in range(1, balls+1):
        m *= i
    
    for i in range(1, balls-share+1):
        n_m *= i

    for i in range(1, share+1):
        n *= i

    return (m // (n_m * n))