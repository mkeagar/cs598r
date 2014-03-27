while True:
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "00:00" or line == "":
		break

	time = line.split(":")
	mins = int(time[0])
	secs = int(time[1])

	minsecs = mins * 60
	totaltime = minsecs + secs
	upper = totaltime + (totaltime/10)
	lower = totaltime - (totaltime/10)

	mostNines = -1
	winStr = ""
	winNum = -1
	for i in xrange(lower, upper + 1):
		if i <= 99:
			iStr = str(i)
			nines = iStr.count("9")
			if nines > mostNines:
				mostNines = nines
				winStr = iStr
				winNum = i
			else nines == mostNines:
				winningDif = abs(winNum - totaltime)
				iDif = abs(i - totaltime)
				if iDif < winningDif:
					winNum = i
					winStr = iStr
				elif iDif == winningDif:
					winStr = sorted([iStr, winStr])[0]
					winNum = int(winStr)

		minutes = i % 60
		seconds = i - (minutes * 60)

		iStr = str(minutes) + ":" + str(seconds)
		nines = iStr.count("9")
		if nines > mostNines:
			mostNines = nines
		elif nines == mostNines:
