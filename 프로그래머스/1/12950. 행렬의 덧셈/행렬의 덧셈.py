def solution(arr1, arr2):
    answer = []
    
    for i in range(len(arr1)):
        list_num = []
        for j in range(len(arr1[0])):
            list_num += [arr1[i][j] + arr2[i][j]] 
        
        answer.append(list_num)
    return answer