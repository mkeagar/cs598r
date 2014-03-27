caseNum = 0

while True:
	caseNum += 1
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "0 0 0" or line == "":
		break

	lineArr = line.split()
	l = int(lineArr[0])
	p = int(lineArr[1])
	v = int(lineArr[2])

	fullPeriods = v / p
	daysLeft = v % p
	totalDays = fullPeriods * l

	if (daysLeft < l):
		totalDays += daysLeft
	else:
		totalDays += l

	print "Case %d: %d" % (caseNum, totalDays)