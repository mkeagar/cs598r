numCases = int(raw_input())

for i in range(numCases):
	line = raw_input()
	split = line.split(" ")
	beg = int(split[0])
	end = int(split[1])
	maxCount = 0;
	for n in range(beg, end+1):
		count = 0;
		
		while n is not 1:
			if n % 2 == 0:
				n = n / 2
			else:
				n = 3 * n + 1
			count+=1
		maxCount = max(count, maxCount)
	print str(maxCount)
