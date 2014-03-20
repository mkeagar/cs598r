num_matches = 16
num_cases = int(raw_input())

for i in xrange(num_cases):
	teams = []
	losers = []

	for i in xrange(num_matches):
		line = raw_input()
		line_arr = line.split()
		teams.append(line_arr[0])
		teams.append(line_arr[1])

		if line_arr[2] > line_arr[3]:
			if line_arr[1] not in losers:
				losers.append(line_arr[1])
		else:
			if line_arr[0] not in losers:
				losers.append(line_arr[0])

		for i in losers:
			if i in teams:
				teams.remove(i)

	print teams[0]
