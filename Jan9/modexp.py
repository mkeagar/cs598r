numCases = int(raw_input())

for i in xrange(1, numCases+1):
	line_arr = raw_input().split()
	b = long(line_arr[0])
	e = long(line_arr[1])
	m = long(line_arr[2])

	c = pow(b, e, m)

	print "%d. %d" % (i , c)