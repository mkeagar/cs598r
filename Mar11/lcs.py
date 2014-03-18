first = raw_input()
second = raw_input()

M = len(first)
N = len(second)
lcs = [[0]*(N + 1) for i in xrange(M + 1)]

for i in reversed(xrange(M)):
	for j in reversed(xrange(N)):
		if (i == M) or (j == N):
			lcs[i][j] = 0;
		else:
			lcs[i][j] = max(lcs[i+1][j], lcs[i][j+1])

			if (first[i] == second[j]):
				lcs[i][j] = max(lcs[i][j], lcs[i+1][j+1] + 1)

print lcs[0][0]





# [code]
# // lcs is an array of dimensions [M+1][N+1]
# // s is first string of length M
# // t is second string of length N
# for (int i=M; i>=0; i--)  // using the ith character onwards of first string
# for (int j=N; j>=0; j--) {   // using the jth character onwards of second string
#     if (i==M || j==N) lcs[i][j]=0;   // empty string
#     else {
#         lcs[i][j] = max(lcs[i+1][j],lcs[i][j+1]);   // first two cases
        
#         if (s[i]==t[j]) lcs[i][j] = max(lcs[i][j], lcs[i+1][j+1] + 1);   // third case
#     }
# }
# [/code]