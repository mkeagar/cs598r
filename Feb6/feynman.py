while True:
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "0":
		break

	n = int(line)

	total = 0
	for i in range(1,n+1):
		total += pow(i,2)

	print str(total)