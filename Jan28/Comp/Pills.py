def factorial(n):
	if n == 0:
		return 1
	else:
		return n * factorial(n - 1)

while True:
	try:
		line = raw_input()
	except EOFError:
		break

	if line == "" or line == "0":
		break
		
	n = int(line)

	print factorial(2 * n) / (factorial(n + 1) * factorial(n))