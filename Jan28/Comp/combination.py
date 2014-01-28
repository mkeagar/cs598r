caseNum = 0

while True:
	caseNum += 1
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "" or line == "0 0 0 0":
		break
	lineArr = line.split(" ")

	n = float(lineArr[0])
	t_1 = float(lineArr[1])
	t_2 = float(lineArr[2])
	t_3 = float(lineArr[3])

	total_ticks = 0.0;
	
	for start in range(int(n)):
		ticks1 = 0.0
		ticks2 = 0.0
		ticks3 = 0.0

		#ticks to first stop -> t_1
		ticks1 += 2*n
		if t_1 == start:
			ticks1 = ticks1
		elif t_1 < start:
			ticks1 += (start-t_1)
		else:
			ticks3 += start + (n-t_1)

		#ticks to second stop -> t_2
		ticks2 += n
		if t_2 < t_1:
			ticks2 += (n-t_1) + t_2
		else:
			ticks2 += (t_2 - t_1)

		#ticks to third stop -> t_3
		if (t_3 < t_2):
			ticks3 += (t_2 - t_3)
		else:
			ticks3 += t_2 + (n-t_3)

		total_ticks += (ticks1 + ticks2 + ticks3)

	avg_ticks = total_ticks/n

	print "%0.3f" % (avg_ticks,)