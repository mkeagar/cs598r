import java.util.ArrayList;
import java.util.Scanner;

class MaxProd
{

	public static void main(String[] args)
	{
		int tests = 0;
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\n");
		ArrayList<String> lines = new ArrayList<String>();
		
		tests = Integer.parseInt(scan.next());
		
		for (int i = 0; i < tests; i++)
		{
			lines.add(scan.next());
		}
		scan.close();
		
		for (String s : lines)
		{
			int max = 0;
			String[] numbers = s.split(" ");
			if (numbers.length < 3)
			{
				max = prod(numbers);
			}
			else
			{
				max = maxProd(numbers);
			}	
			System.out.println(max);
		}
	}
	
	public static int maxProd(String[] numbers)
	{
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		

		
		for (String s : numbers)
		{
			int sInt = Integer.parseInt(s);
			
			if (sInt > first)
				first = sInt;
		}
		
		for (String s : numbers)
		{
			int sInt = Integer.parseInt(s);
			
			if (sInt > second && sInt < first)
				second = sInt;
		}
		
		for (String s : numbers)
		{
			int sInt = Integer.parseInt(s);
			if (sInt > third && sInt < second)
				third = sInt;
		}
		
		return first*second*third;
	}

	public static int prod(String[] numbers)
	{
		int product = 1;
		
		for (String s : numbers)
		{
			int sInt = Integer.parseInt(s);
			
			product *= sInt;
		}
		
		return product;
	}
}
