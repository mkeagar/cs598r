size = int(raw_input())
numbers = {}
count = 0

for i in xrange(size):
	number = raw_input()
	if number not in numbers:
		numbers[number] = 1
	else:
		numbers[number] += 1

for i in numbers.iterkeys():
	if numbers[i] % 2 != 0:
		count += 1

print count