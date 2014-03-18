info = input()
info = info.split()

num_elements = int(info[0])
queries = int(info[1])

number_line = input()
elements = number_line.split()

for i in xrange(queries):
	query = input()
	if query in elements:
		print elements.index(query)
	else:
		print -1