def sub_hash(key):
	key_hash = 0
	count = len(key)
	for i in range(count):
		key_hash += ord(key[i]) * (i + 1)
	return key_hash * 19

def hash_this(key):
	key_hash = sub_hash(key) % 101
	return key_hash

def find_key(table, key):
	index = hash_this(key)
	if table[index] == key:
		return index

	for i in range(1,20):
		index2 = (index + (i * i) + (23 * i)) % 101;
		if table[index2] == key:
			return index2
		return -1

def find_next_open_address(table, index):
	if not table[index]:
		return index

	for i in range(1, 20):
		index2 = (index + (j * j) + (23 * j)) % 101
		if not table[index2]:
			return index2
	return -1

numCases = int(raw_input())

for i in range(numCases):
	table = [""] * 101
	numOps = int(raw_input())
	for j in range(numOps):
		line = raw_input()
		linArray = line.split(":")
		op = linArray[0]
		key = linArray[1]
		index = find_key(table, key)

		if op == "ADD":
			if index == -1:
				index = find_next_open_address(table, hash_this(key))
				if index >= 0:
					table[index] = key
			else:
				if index >= 0:
					table[index] = ""

		stringBuilder = ""
		count = 0
		for j in range(101):
			if table[j]:
				count += 1
				stringBuilder += str(j) + ":" + table[j] + "\n"

		print count
		print stringBuilder