import java.util.Scanner;

class StringPermutations
{
	private static void swapChars(StringBuilder temp, int x, int y)
	{
		char t = temp.charAt(x);
		temp.setCharAt(x, temp.charAt(y));
		temp.setCharAt(y, t);
	}

	private static void getPermutations(StringBuilder temp, int start, int end)
	{
		int index;
		if (start == end)
			System.out.println(temp.toString());
		else
			for (index = start; index <= end; index++)
			{
				swapChars(temp, start, index);
				getPermutations(temp, start+1, end);
				swapChars(temp, start, index);
			}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		getPermutations(new StringBuilder(input), 0, input.length()-1);
	}
}
 
// // Swap two characters.
// void swap (char *x, char *y)
// {
// 	char temp;
// 	temp = *x;
// 	*x = *y;
// 	*y = temp;
// }
  
// /* Function to print permutations of string
// 	This function takes three parameters:
// 	1. String
// 	2. Starting index of the string
// 	3. Ending index of the string. */
// void get_permutations(char *a, int start, int end) 
// {
// 	int j; 
// 	if (start == end)
// 		printf("%s\n", a);
// 	else
// 	{
// 		for (j = start; j <= end; j++)
// 		{
// 			swap((a+start), (a+j));
// 			permute(a, start+1, end);
// 			swap((a+start), (a+j)); //backtrack
// 		}
// 	}
// } 
	
// /* Driver program to test above functions */
// int main()
// {
// 	string input;

// 	cin >> input;


// 	char a[] = input.c_str();  
// 	permute(a, 0, 2);
// 	getchar();
// 	return 0;
// }