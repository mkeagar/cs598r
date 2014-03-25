import math
import operator
import sys

pi2 = 2 * math.pi

def calc_points(id, x, y, r):
	try:
		delta = math.asin(r / math.sqrt(x * x + y * y))
	except ValueError:
		yield 0, id
		yield pi2, id
	else:
		angle = math.atan2(y, x)
		a1 = (angle - delta + pi2) % pi2
		a2 = (angle + delta + pi2) % pi2
		if a1 > a2:
			yield 0, id
			yield pi2, id
		yield a1, id
		yield a2, id

points = sorted([
	p for i, line in enumerate(sys.stdin) if i
	for p in calc_points(i, *map(float, line.split(' ')))
])

current_ids = set()
total = 0
for (prev, _), (angle, id) in zip([(None, None)] + points, points):
	if current_ids:
		total += angle - prev
	if id in current_ids:
		current_ids.remove(id)
	else:
		current_ids.add(id)

print '{:.0f}%'.format(total / pi2 * 100)