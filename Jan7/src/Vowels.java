import java.util.Scanner;

public class Vowels
{

	public static void main(String[] args)
	{
		String input = "";
		char[] inputArray;
		int vowelCount = 0;
		String vowels = "aeiou";
		Scanner scan = new Scanner(System.in);
		
		input = scan.next();
		
		inputArray = input.toLowerCase().toCharArray();
		
		for (int i = 0; i < inputArray.length; i++)
		{
			if (vowels.contains(inputArray[i] + ""))
			{
				vowelCount++;
			}
		}
		
		System.out.println(vowelCount);
	}

}
