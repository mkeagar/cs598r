while True:
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "":
		break
	lineArr = line.split(" ")
	m = float(lineArr[0])
	a = float(lineArr[1])
	f = int(lineArr[2])
	v = int(lineArr[3])

	pv = v - (v/(f+1))

	print str(round((m + pv*a)/v,2))