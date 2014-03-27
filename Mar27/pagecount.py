while True:
	try:
		numPages = raw_input()
	except EOFError:
		break
	if numPages == "00:00" or numPages == "":
		break

	numPages = int(numPages)

	pages = [False] * numPages

	rangeList = raw_input().split(",")
	for i in rangeList:
		if "-" in i:
			i = i.split("-")
			lo = int(i[0])
			hi = int(i[1])
		else:
			lo = int(i)
			hi = int(i)
		if lo > hi:
			continue
		for j in xrange(lo-1,hi):
			if j < numPages:
				pages[j] = True

	pageCount = 0
	for i in xrange(len(pages)):
		if pages[i]:
			pageCount += 1

	print pageCount

