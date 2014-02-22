N = 1000001
v = [0] * 10
maximum = 0
minimum = 0

def encode(s):
    ans = 0
    i = 0
    while s[i] == '0':
        i += 1

    while s[i] != '0':
        v[int(s[i])] += 1
    for j in range(10):
        if v[j] > 0:
            ans |= 1<<i
    if maximum < ans:
        maximum = ans
    if minimum > ans:
        minimum = ans
    return ans

n = 0
a = [0] * N
bucket = [0] * 5000
n = int(raw_input())
maximum = 0
minimum = 5000
temp = 0

for i in range(n):
    s = raw_input()
    a[i] = encode(s)
    bucket[a[i]] += 1

ans = 0
for i in range(minimum, maximum+1):
    if bucket[i] == 0:
        continue
    for j in range(i+1, maximum+1):
        if bucket[j] == 0:
            continue
        if (i&j):
            ans += bucket[i] * bucket[j]

    ans += bucket[i] * (bucket[i] - 1) / 2

print ans