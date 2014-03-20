while True:
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "-1 -1":
		break
	if line == "":
		break

	line_arr = line.split()
	girls = float(line_arr[0])
	boys = float(line_arr[1])

	gender_equality = 0
	if girls > boys:
		gender_equality = girls / (boys + 1)
		gender_equality += 1
	elif boys > girls:
		gender_equality = boys / (girls + 1)
		gender_equality += 1
	elif boys == 0 and girls == 0:
		gender_equality = 0
	else:
		gender_equality = boys / girls

	gender_equality = int(gender_equality)
	print gender_equality
	