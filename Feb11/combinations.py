def changes(amount, coins):
    ways = [0] * (amount + 1)
    ways[0] = 1
    for coin in coins:
        for j in xrange(coin, amount + 1):
            ways[j] += ways[j - coin]
    return ways[amount]

while True:
	try:
		line = raw_input()
	except EOFError:
		break
	if line == "":
		break

	lineArr = line.split(",")

	print str(changes(15, lineArr))
