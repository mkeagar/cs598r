#include <iostream>
#include <string>
 
// Swap two characters.
void swap (char *x, char *y)
{
	char temp;
	temp = *x;
	*x = *y;
	*y = temp;
}
  
/* Function to print permutations of string
	This function takes three parameters:
	1. String
	2. Starting index of the string
	3. Ending index of the string. */
void get_permutations(char *a, int start, int end) 
{
	int j; 
	if (start == end)
		printf("%s\n", a);
	else
	{
		for (j = i; j <= n; j++)
		{
			swap((a+i), (a+j));
			permute(a, i+1, n);
			swap((a+i), (a+j)); //backtrack
		}
	}
} 
	
/* Driver program to test above functions */
int main()
{
	string input;

	cin >> input;


	char a[] = input.c_str();  
	permute(a, 0, 2);
	getchar();
	return 0;
}