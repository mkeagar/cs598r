currentPosition = raw_input()
distance = 0.0

while True:
	try:
		newPosition = raw_input()
	except:
		break

	currentPositionMap = map(float, currentPosition[currentPosition.index('(') + 1 : currentPosition.index(')')].split(','))

	newPositionMap = map(float, newPosition[newPosition.index('(') + 1 : newPosition.index(')')].split(','))

	distance += (((currentPositionMap[0] - newPositionMap[0]) ** 2) + (newPositionMap[1] - currentPositionMap[1]) ** 2) ** 0.5

	print "The salesman has traveled a total of %.3f kilometers." % (distance)
	currentPosition = newPosition