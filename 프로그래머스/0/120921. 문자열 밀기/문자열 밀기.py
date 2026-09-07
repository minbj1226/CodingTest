def solution(A, B):
    cnt = 0
    
    for i in range(len(A)):
        if A == B:
            break
        
        A = A[-1] + A[:-1]
        cnt += 1
        
    if A != B:
        cnt = -1
        
    return cnt
            
    