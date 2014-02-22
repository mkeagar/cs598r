numCases = int(raw_input())

pals = 0
numList = {}

for	i in range(numCases):
	numList[i] = str(raw_input()) + ""
	
index = 0

for i in range(numCases):
	current = numList[i]
	for j in range(i+1, numCases):
		compare = numList[j]
		for c,n in current,compare:
			oldPals = pals
			for n in compare:
				if int(n) ^ int(c) == 0:
					pals = pals + 1
					break
			if pals > oldPals:
				break

print pals
