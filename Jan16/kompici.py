numCases = int(raw_input())

pals = 0
numList = {}

for	i in range(numCases):
	numList[i] = str(raw_input()) + ""
	
index = 0

for i in range(numCases-1):
	current = numList[i]
	for j in range(1,numCases-1):
		next = numList[j]
		for c in current:
			oldPals = pals
			for n in next:
				if int(n) ^ int(c) == 0:
					pals = pals + 1
					break
			if pals > oldPals:
				break

print pals
