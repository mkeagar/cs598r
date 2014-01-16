numCases = int(raw_input())
counts = {}

for i in range(numCases):
	line = raw_input()
	split = line.split(" ")
	beg = int(split[0])
	end = int(split[1])
	maxCount = 0
	for n in range(beg, end+1):
		count = 0;
		if n in counts:
			count = counts[n]
		else:
			number = n
			while number is not 1:
				if number % 2 == 0:
					number = number / 2
				else:
					number = 3 * number + 1
				count+=1
			counts[n] = count
		maxCount = max(count, maxCount)
	print str(maxCount)
