import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Bytelandian
{
	// Variables
	private Map<Long, Long> values;
	public Bytelandian()
	{
		values = new HashMap<Long, Long>();
	}
	
	public long maxExchange(long number)
	{
		if (values.containsKey(number))
		{
			return values.get(number);
		}
		else
		{
			long first = number / 2;
			long second = number / 3;
			long third = number / 4;
			
			if ((first + second + third) > number)
			{
				long newEntry = maxExchange(first) + maxExchange(second) + maxExchange(third);
				values.put(number, newEntry);
				return newEntry;
			}
			else
			{
				values.put(number, number);
				return number;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Bytelandian bl = new Bytelandian();
		
		while (scan.hasNextLong())
		{
			long number = scan.nextLong();
			System.out.println(bl.maxExchange(number));
		}
	}
}
