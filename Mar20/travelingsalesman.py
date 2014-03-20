currentPosition = raw_input()
total_distance = 0.0

while True:
	try:
		newPosition = raw_input()
	except:
		break

	oldCoord = currentPosition[currentPosition.index('(') + 1 : currentPosition.index(')')].split(',')
	newCoord = newPosition[newPosition.index('(') + 1 : newPosition.index(')')].split(',')

	total_distance += (((float(oldCoord[0]) - float(newCoord[0])) ** 2) + (float(oldCoord[1]) - float(newCoord[1])) ** 2) ** 0.5

	print "The salesman has traveled a total of %.3f kilometers." % (total_distance)
	oldCoord = newCoord
