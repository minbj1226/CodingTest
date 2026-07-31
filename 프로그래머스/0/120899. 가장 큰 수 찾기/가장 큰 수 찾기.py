def solution(array):    
    m = max(array)
    idx = array.index(max(array))
    
    answer = [m, idx]
    return answer