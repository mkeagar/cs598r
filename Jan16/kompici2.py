numSet = [0] * 1024
pals = 0
numCases = int(raw_input())

for i in range(numCases):
	number = [False] * 10
	numLine = raw_input()
	index = 0
	for c in numLine:
		digit = int(c)
		if not number[digit]:
			index += (1 << digit)
			number[digit] = True
	numSet[index] += 1

for i in range(len(numSet)):
	if numSet[i] == 0:
		continue
	else:
		for j in range(i+1, len(numSet)):
			if numSet[j] == 0:
				continue
			elif (i & j) != 0:
				pals += numSet[i] * numSet[j]

		pals += (numSet[i] * (numSet[i] - 1)) >> 1

print pals