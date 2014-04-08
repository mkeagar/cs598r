num_cases = int(raw_input())

entries = {}

for i in xrange(num_cases):
    line = raw_input()
    line_arr = line.split()
    n = long(line_arr[0])
    k = long(line_arr[0])

    entries[i] = k - 1

for i in xrange(num_cases):
    gender = long(0)
    while(entries[i]):
        gender += entries[i] % 2
        entries[i] = entries[i] / 2
    if (gender % 2) == 1:
        print "Female\n"
    else:
        print "Male\n"

# #include <iostream>
# #include <vector>

# using namespace std;

# int main()
# {
#     int tN, sn, i, j;
#     unsigned long long int in;
#     scanf("%d", &tN);
#     vector<unsigned long long int> input(tN);
#     for(i=0;i<tN;i++)
#     {
#         scanf("%d %llu", &sn, &in);
#         input[i]=in-1;
#     }
#     for(i=0;i<tN;i++)
#     {
#         long gender=0;
#         while(input[i])
#         {
#             gender+=input[i]%2;
#             input[i]=input[i]/2;
#             //printf("%d %d\n",gender,input[i]);
#         }
#         if((gender%2)==1)
#             printf("Female\n");        
#         else
#             printf("Male\n");
#     }
#     return 0;
# }