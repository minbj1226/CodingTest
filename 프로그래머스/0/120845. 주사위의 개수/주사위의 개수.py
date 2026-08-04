def solution(box, n):
    answer = 0
    
    #박스 가로 길이
    width = box[0] // n
    
    #박스 세로 길이
    length = box[1] // n
    
    #박스 높이
    height = box[2] // n
    
    answer = width * length * height
    
    return answer