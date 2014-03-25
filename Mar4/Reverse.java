import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Reverse {
	public static void main(String[] args) throws Throwable
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack numbers = new Stack<Long>();
		Stack symbols = new Stack<Character>();
		
		String input = br.readLine();
		String current = "";
		for(char c : input.toCharArray())
		{
			if(c == ' ')
			{
				continue;
			}
			if("*()-+".contains(c+""))
			{
				if(current.length() > 0)
				{
					numbers.push(Long.parseLong(current));
					current = "";
				}
				if(!symbols.isEmpty() && symbols.peek() == '-')
				{
					long a = (long) numbers.pop();
					long b = (long) numbers.pop();
					numbers.push(b - a);
					symbols.pop();
				}
				else if(!symbols.isEmpty() && symbols.peek() == '+')
				{
					long a = (long) numbers.pop();
					long b = (long) numbers.pop();
					numbers.push(b + a);
					symbols.pop();
				}
				else if(!symbols.isEmpty() && symbols.peek() == ')')
				{
					symbols.pop();
					char l;
					while((l = (char) symbols.pop()) != '(')
					{
						numbers.push((long) numbers.pop() * (long) numbers.pop());
					}
				}
				
				symbols.push(c);
			}
			else
			{
				current += c;
			}
		}
		if(current.length() > 0)
		{
			numbers.push(Long.parseLong(current));
		}
		int result = 1;
		if(!symbols.isEmpty() && symbols.peek() == '-')
		{
			long a = (long) numbers.pop();
			long b = (long) numbers.pop();
			numbers.push(b - a);
			symbols.pop();
		}
		else if(!symbols.isEmpty() && symbols.peek() == '+')
		{
			long a = (long) numbers.pop();
			long b = (long) numbers.pop();
			numbers.push(b + a);
			symbols.pop();
		}
		while(!numbers.isEmpty())
		{
			result *= (long) numbers.pop();
		}
		System.out.println(result);
	}
}