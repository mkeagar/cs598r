numbers = []
symbols = []

line = raw_input()
current = ""

for c in line:
	if c == ' ':
		continue
	if c in "*()-+":
		if len(current) > 0:
			numbers.append(long(current))
			current = ""
		if symbols and symbols[-1] == '-':
			a = long(numbers.pop())
			b = long(numbers.pop())
			numbers.append(b-a)
			symbols.pop()
		elif symbols and symbols[-1] == '+':
			a = long(numbers.pop())
			b = long(numbers.pop())
			numbers.append(b+a)
			symbols.pop()
		elif symbols and symbols[-1] == '(':
			symbols.pop()
			l = ''
			while l != '(':
				if symbols:
					l = symbols.pop()
				numbers.append(numbers.pop() * numbers.pop())

		symbols.append(c)
	else:
		current += c

if len(current) > 0:
	numbers.append(long(current))

result = 1
if symbols and symbols[-1] == '-':
	a = long(numbers.pop())
	b = long(numbers.pop())
	numbers.push(b-a)
	symbols.pop()
elif symbols and symbols[-1] == '+':
	a = long(numbers.pop())
	b = long(numbers.pop())
	numbers.append(b+a)
	symbols.pop()

while numbers:
	result *= numbers.pop()

print result