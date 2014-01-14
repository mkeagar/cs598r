while (true)
	line = raw input()
	if (line == "0 0"):
		break
	split = line.split(" ")
	w = int(split[0]);
	h = int(split([1]);
	
	r1 = w / (2.0 * math.pi)
	h1 = h - 2 * r1
	r2 = min(h / (2.0 * (math.pi + 1.0)), w/2.0)
	h2 = w
	w1 = (math.pi * r1 + r1 * h1)
	w2 = (math.pi * r2 + r2 * h2)
	if (w1 > w2)
		print ("%3lf" % w1)
	else
		print 
