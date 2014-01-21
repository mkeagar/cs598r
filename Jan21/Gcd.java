import java.util.Scanner;

class Gcd
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int first = Integer.parseInt(scan.nextLine());
		
		first = gcd(first, Integer.parseInt(scan.nextLine()));
		
		
		while (scan.hasNextLine())
		{
			String temp = scan.nextLine();
			if (temp.equals("")) break;
			else
				first = gcd(first, Integer.parseInt(temp));
		}
		System.out.println(first);
	}
	
	private static int gcd(int x, int y)
	{
		int a, b, g, z;
		
		if (x > y)
		{
			a = x;
			b = y;
		}
		else
		{
			a = y;
			b = x;
		}
		
		if (b == 0) return 0;
		
		g = b;
		while (g != 0)
		{
			z = a % g;
			a = g;
			g = z;
		}
		return a;
	}
}
