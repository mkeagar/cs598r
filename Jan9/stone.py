class Point(object):
	def __init__(self):
		self.x = 0.0
		self.y = 0.0

MAX = 1000009

numCases = int(raw_input())

points = [Point() for i in xrange(MAX)]

for index in xrange(numCases):
	n = int(raw_input())

	for p in xrange(n):
		line_arr = raw_input().split()
		points[p].x = float(line_arr[0])
		points[p].y = float(line_arr[1])

	points[n].x = points[0].x
	points[n].y = points[0].y

	cx = 0.0
	cy = 0.0
	a = 0.0

	for i in xrange(n):
		d = (points[i].x * points[i+1].y) - (points[i+1].x * points[i].y)
		a += d
		cx += (points[i].x + points[i+1].x) * d;
		cy += (points[i].y + points[i+1].y) * d;

	cx /= (3.0 * a)
	cy /= (3.0 * a)

	print "%.2f %.2f" % (cx, cy)
