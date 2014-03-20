teamID = 1

while True:
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "":
		break

	team_arr = line.split()

	time_list = [int(team_arr[0]), int(team_arr[1]), int(team_arr[2])]
	attempts = [int(team_arr[3]), int(team_arr[4]), int(team_arr[5])]

	output = "team " + str(teamID) + ": "

	total_time = 0
	num_solved = 0
	for i in xrange(3):
		if (time_list[i] > 0):
			total_time += time_list[i]
			num_solved += 1
			if (attempts[i] > 1):
				total_time += (attempts[i] - 1) * 1200

	output += str(num_solved) + ", " + str(total_time)

	print output
	teamID += 1
