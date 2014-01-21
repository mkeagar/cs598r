numCases = int(raw_input())

for i in range(numCases):
	numVertices = int(raw_input())
	x = 0.0
	y = 0.0
	for j in range(numVertices):
		line = raw_input()
		lineArr = line.split(' ')
		x = x + float(lineArr[0])
		y = y + float(lineArr[1])
	x = x / numVertices
	y = y / numVertices
	x = round(x,2)
	y = round(y,2)
	
	print '%.2f %.2f' % (x, y)