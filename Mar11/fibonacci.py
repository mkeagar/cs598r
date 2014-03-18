import sys

index = int(raw_input())

fib = {}
fib[0] = 0
fib[1] = 1

num = 0;

if index == 0 or index == 1:
	print fib[index]
	sys.exit()
else:
	for i in xrange(2,index + 1):
		fib[i] = fib[i-2] + fib[i-1]

	print fib[index]