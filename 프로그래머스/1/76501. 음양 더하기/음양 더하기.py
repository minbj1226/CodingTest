def solution(absolutes, signs):
    numbers = []
    ans = 0
    
    for idx, num in enumerate(absolutes):
        if signs[idx] == True:
            numbers.append(num)
        elif signs[idx] == False:
            numbers.append(-num)
            
    for calc in numbers:
        ans += calc
    
    return ans