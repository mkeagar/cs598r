numCases = int(raw_input())

for i in range(numCases):
	numPosters = int(raw_input())
	poster_visibility = [0] * numPosters
	segments = [-1] * (10000000)
	for j in range(numPosters):
		poster = raw_input().split()
		poster[0] = int(poster[0])
		poster[1] = int(poster[1])

		for k in range(poster[0] - 1, poster[1] - 1):
			if segments[k] == -1:
				segments[k] = j
				poster_visibility[j] += 1
			else:
				poster_visibility[segments[k]] -= 1
				segments[k] = j
				poster_visibility[j] += 1
	answer = 0
	for j in poster_visibility:
		if j > 0:
			answer += 1

	print answer


# numCases = int(raw_input())

# for i in range(numCases):
# 	numPosters = int(raw_input())
# 	lefts = []
# 	rights = []

# 	for j in range(numPosters):
# 		poster = raw_input().split()
# 		left = poster[0]
# 		right = poster[1]
		
# 		rights.append(poster[1])

