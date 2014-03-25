import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Reverse2 {
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
				if(!symbols.isEmpty() && symbols.peek().equals('-'))
				{
					Long a = (Long) numbers.pop();
					Long b = (Long) numbers.pop();
					numbers.push(b - a);
					symbols.pop();
				}
				else if(!symbols.isEmpty() && symbols.peek().equals('+'))
				{
					Long a = (Long) numbers.pop();
					Long b = (Long) numbers.pop();
					numbers.push(b + a);
					symbols.pop();
				}
				else if(!symbols.isEmpty() && symbols.peek().equals(')'))
				{
					symbols.pop();
					Character l;
					while(!(l = (Character) symbols.pop()).equals('('))
					{
						numbers.push((Long) numbers.pop() * (Long) numbers.pop());
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
		if(!symbols.isEmpty() && symbols.peek().equals('-'))
		{
			Long a = (Long) numbers.pop();
			Long b = (Long) numbers.pop();
			numbers.push(b - a);
			symbols.pop();
		}
		else if(!symbols.isEmpty() && symbols.peek().equals('+'))
		{
			Long a = (Long) numbers.pop();
			Long b = (Long) numbers.pop();
			numbers.push(b + a);
			symbols.pop();
		}
		while(!numbers.isEmpty())
		{
			result *= (Long) numbers.pop();
		}
		System.out.println(result);
	}
}