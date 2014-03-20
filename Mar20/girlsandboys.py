import math

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
	girls = int(line_arr[0])
	boys = int(line_arr[1])

	gender_equality = 0
	if girls > boys:
		gender_equality = math.ceil(float(girls) / (boys + 1))
	elif boys > girls:
		gender_equality = math.ceil(float(boys) / (girls + 1))
	elif girls == 0 and boys == 0:
		gender_equality = 0
	else:
		gender_equality = boys / girls

	gender_equality = int(gender_equality)
	print gender_equality
	