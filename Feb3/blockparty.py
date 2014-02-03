weeks = int(raw_input())
addresses = {}
for week in range(weeks):
	addresses[week] = int(raw_input())
	number = 0
	size = len(addresses)
	if size % 2 == 1:
		number = (size / 2) + 1
	else:
		number = size / 2
	print str(addresses[number - 1])