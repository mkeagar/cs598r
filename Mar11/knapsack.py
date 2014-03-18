sn = raw_input().split()
S = int(sn[0])
N = int(sn[1])

B = [[0]*(S+1) for i in xrange(N+1)]

for i in xrange(1,N+1):
	item_arr = raw_input().split()
	weight = int(item_arr[0])
	value = int(item_arr[1])
	for j in xrange(1, S+1):
		if (weight > j):
			B[i][j] = B[i-1][j]
		else:
			newValue = value + B[i-1][j-weight]
			B[i][j] = max(B[i-1][j], newValue)

print B[N][S]