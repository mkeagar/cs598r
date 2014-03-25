import re

LARGE = 100
priority = {'+': 2,	'-': 2,	'*': 1,	'(': -LARGE }

operators = "()+-*"
number_stack = []
operator_stack = []
for token in ['('] + re.findall("d+|[()+-*]", raw_input()) + [')']:
	if re.match("s", token):
		continue 
	# print "Stepping", token, operator_stack, number_stack
	if token not in operators:
		number_stack.append(token)    
	else:
		if token == '(':
			operator_stack.append(token)
		elif token == ')':
			while True:
				last_op = operator_stack.pop()
				if last_op == '(':
					break
				second = number_stack.pop()
				first = number_stack.pop()
				number_stack.append("("+first+last_op+second+")")
		else: # assert token in operators
			last_op = operator_stack[-1]
			if priority[last_op] >= priority[token]:
				operator_stack.pop() # already storedi n last_op
				second = number_stack.pop()
				first = number_stack.pop()
				number_stack.append("("+first+last_op+second+")")
			operator_stack.append(token)
print eval(number_stack[0])