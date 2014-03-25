num_cases=int(raw_input())

for i in range(num_cases):
    line=raw_input()
    line_arr=line.split(' ')

    w=int(line_arr[0])
    b=int(line_arr[1])
    c=b%10
    
    if(b%2==0):
        print "0.000000"
    else:
        print "1.000000"