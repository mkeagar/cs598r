
while True:
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "0.00":
		break

	length = float(line)

	numCards = 1
	overhang = 0.0
	base = 0.0
	addToBase = 1.0/(numCards + 1)
	base += addToBase
	overhang += addToBase
	while overhang < length:
		numCards += 1
		addToBase = 1.0/(numCards + 1)
		base += addToBase
		overhang += addToBase

	print numCards,"card(s)"