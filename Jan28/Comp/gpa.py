caseNum = 0;

while True:
	caseNum += 1
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "":
		break
	lineArr = line.split(" ")
	total = 0.0
	msg = ""
	grades = len(lineArr)
	for grade in lineArr:
		if grade == "A":
			total += 4.0
		elif grade == "B":
			total += 3.0
		elif grade == "C":
			total += 2.0
		elif grade == "D":
			total += 1.0
		elif grade == "F":
			total += 0.0
		elif grade == "":
			grades -= 1
		else:
			msg = "Unknown letter grade in input"

	if msg == "":
		total /= grades
		msg = "%0.2f" % (total,)

	print "Case",str(caseNum) + ": " + str(msg)