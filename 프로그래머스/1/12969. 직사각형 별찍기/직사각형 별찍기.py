a, b = map(int, input().strip().split(' '))
ans = ""

for i in range(b):
    for j in range(a):
        ans += "*"
    ans += "\n"
    
print(ans)