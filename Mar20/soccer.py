num_matches = 16
num_cases = int(raw_input())

for i in xrange(num_cases):
	matches = []
	teams = set()
	for i in xrange(num_matches):
		line = raw_input()
		line_arr = line.split()
		teams.add(line_arr[0])
		teams.add(line_arr[1])
		matches.append(line)

	for i in xrange(num_matches):
		match = matches[i].split()
		s1 = match[2]
		s2 = match[3]

		if s1 > s2 and match[1] in teams:
			teams.remove(match[1])
		elif s2 < s1 and match[0] in teams:
			teams.remove(match[0])

	a = teams.pop()

	print a
