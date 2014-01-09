import java.util.*;

class LonelyNumber2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int numLines = scan.nextInt();
		int number = scan.nextInt();
		
		for (int i = 1; i < numLines; i++)
		{
			number = number ^ scan.nextInt();
		}
		
		System.out.println(number);
	}
}
