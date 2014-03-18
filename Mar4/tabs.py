n = int(raw_input())
lines = [0] * n
tabCount = 0

for i in xrange(n):
	lines[i] = int(raw_input())

for i in xrange(n):
	while lines[i] > 0:
		furthestConsecutive = i;

		while (furthestConsecutive < n) and (lines[furthestConsecutive] > 0):
			furthestConsecutive += 1

		for j in range(i,furthestConsecutive):
			lines[j] -= 1

		tabCount += 1

print tabCount