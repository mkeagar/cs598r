storage = {}

def split_string(input_string, dictionary):
	if input_string in dictionary:
		return input_string

	if input_string in storage.viewkeys():
		return storage[input_string]

	inputlength = len(input_string)
	for i in range(1,len(input_string)):
		prefix = input_string[0:i]
		if prefix in dictionary:
			suffix = input_string[i:]		
			split_suffix = split_string(suffix, dictionary)
			if split_suffix:
				storage[input_string] = prefix + " " + split_suffix
				return storage[input_string]
	storage[input] = None		
	return None


dictwordcount = int(raw_input())
word_list = []

for i in range(dictwordcount):
	try:
		word = raw_input()
	except EOFError:
		print "Errorrorrorrorrorror!"
		break
	word_list.append(word)

if (word_list[0]):
	dictionary = set(word_list)
	while True:
		try:
			line = raw_input()
		except EOFError:
			break
		if line == "":
			break

		print split_string(line, dictionary)