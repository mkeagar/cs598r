import java.util.Scanner;

class AddTwoNumbers
{

	public static void main(String[] args)
	{
		int one = Integer.MIN_VALUE;
		int two = Integer.MIN_VALUE;
		
		Scanner scan = new Scanner(System.in);
		
		one = Integer.parseInt(scan.next());
		two = Integer.parseInt(scan.next());
		
		if (two >= 0)
			for (int i = 0; i < two; i++)
			{
				one++;
			}
		else
			for (int i = two; i > 0; i--)
			{
				one--;
			}
		
		System.out.println(one);
	}

}
