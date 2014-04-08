while  hasChanged
	save List[0]

	for i =0, 2, 3, ..., n-1
	list [i] = abs( list[i] - list[i+1])
	list (length - 1) = list [i-1] - saved

	go through list, check if all equal
		if all equal: break

		if not, continue: