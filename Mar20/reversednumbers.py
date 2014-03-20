def reverse(num):
	new_num = ""
	for i in str(num):
		new_num = i + new_num
	return int(new_num)

num_cases = int(raw_input())

for i in xrange(num_cases):
	line_arr = raw_input().split()

	n1 = line_arr[0]
	n2 = line_arr[1]

	num_sum = reverse(n1) + reverse(n2)
	print reverse(num_sum)
