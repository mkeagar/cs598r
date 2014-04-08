
import math

numCases = int(raw_input())

for i in range(numCases):
	n = int(raw_input())
	currentNumber = n * (n + 2)
	tempNumber = 2 * n + 1
	numerator = currentNumber * tempNumber

	output = numerator / 8
	print int(output)