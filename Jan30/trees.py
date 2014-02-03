caseNum = 0

while True:
	caseNum += 1
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "0 0" or line == "":
		break

	lineArr = line.split(" ")

	n = int(lineArr[0])
	m = int(lineArr[1])

	treeList = [set() for i in xrange(n)]
	
	for i in range(n):
		treeList[i].add(i+1)

	for edge in range(m):
		edgeArr = raw_input().split(" ")
		start = int(edgeArr[0])
		end = int(edgeArr[1])
		startIndex = -1
		endIndex = -1

		for i in range(len(treeList)):
			if (start in treeList[i]):
				startIndex = i;
			if (end in treeList[i]):
				endIndex = i;

		if startIndex == endIndex:
			del treeList[startIndex]
			continue

		treeList[startIndex] = treeList[startIndex].union(treeList[endIndex])
		del treeList[endIndex]

	if len(treeList) > 1:
		print "Case", str(caseNum) + ": A forest of", str(len(treeList)), "trees."
	elif len(treeList) == 1:
		print "Case", str(caseNum) + ": There is one tree."
	else:
		print "Case", str(caseNum) + ": No trees."