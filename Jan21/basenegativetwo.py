numCases = int(raw_input())
cases = raw_input().split(' ');
for i in range(numCases):
	num = 0;
	case = cases[i]
	for j in range(len(case)):
		if int(case[-j-1])==1:
			num = num + pow(-2, j)
	answer = str(num)
	print answer,
