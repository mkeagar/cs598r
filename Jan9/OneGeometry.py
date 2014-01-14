numCases = int(raw_input())

for	i in range(numCases):
	line = raw_input()
	split = line.split(" ")
	
	print (str((int(split[1])-int(split[2])) + (int(split[1])-int(split[0]))))
