
while True:
	line = raw_input()
	if line == "":
		break;
	
	number = long(line);
	first = number / 2
	second = number / 3
	third = number / 4
	if (first + second + third) > number:
		print str(first + second + third)
	else:
		print str(number)
