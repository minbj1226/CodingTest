# 가장 긴 변의 길이가 두 변의 합보다 작아야 한다.
def solution(sides):
    answer = 0
    cnt = 0
    
    # 새로 들어오는게 제일 큰 길이
    num = max(sides)
    
    while num < sum(sides):
        cnt+=1
        num+=1
    
    # sides에서 제일 큰 길이 존재
    for k in range(1, max(sides)):
        if k + min(sides) > max(sides):
            cnt+=1
        
    return cnt