import java.util.Scanner;
class BaseNegTwo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int numCases = scan.nextInt();
		for (int i = 0; i < numCases; i++)
		{
			int num = 0;
			String current = scan.next();
			for (int j = current.length()-1; j >= 0; j--)
				if (current.charAt(j) == '1')
					num += Math.pow(-2.0, current.length()-1-j);
			System.out.print(num + " ");
		}
	}
}
