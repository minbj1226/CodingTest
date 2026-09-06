def solution(polynomial):
    numbers = polynomial.split("+")  # [3x, 7, x]
    word_sum = 0
    n = 0
    ans = ""
    
    for num in numbers:
        num = num.strip()
        if "x" in num:
            if num == "x":
                word_sum +=1
            elif num.endswith("x"):
                word_sum += int(num[:-1])
        else:
            n += int(num)
        
    if word_sum > 1:
        if n == 0:
            ans = str(word_sum) + "x"
        else:
            ans = str(word_sum) + "x" + " + " + str(n)
    elif word_sum == 1:
        if n == 0:
            ans = "x"
        else:
            ans = "x" + " + " + str(n)
    else:
        ans = str(n)
            
    return ans