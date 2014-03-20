num_cases = int(raw_input())

for i in xrange(num_cases):
	line_arr = raw_input().split()

	print pow(int(line_arr[0]), int(line_arr[1]), 10)