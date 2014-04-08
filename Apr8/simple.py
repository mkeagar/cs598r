numCases = int(raw_input())

for case in range(numCases):
	line = raw_input()
	lineArr = raw_input().split()
	currentNum = int(lineArr[0])
	i = 1

	while i < len(lineArr):
		operator = lineArr[i]
		if(operator == "="):
			print currentNum
			break
		nextNum = int(lineArr[i + 1])

		if operator == "+":
			currentNum = currentNum + nextNum
		elif operator == "-":
			currentNum = currentNum - nextNum
		elif operator == "*":
			currentNum = currentNum * nextNum
		elif operator == "/":
			currentNum = currentNum / nextNum

		i += 2