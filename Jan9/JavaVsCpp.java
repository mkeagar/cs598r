import java.util.Scanner;

class JavaVsCpp
{
	public static void main(String[] args)
	{
		String currentWord = "";
		String modifiedWord = "";
		Scanner scan = new Scanner(System.in);
		boolean error = false;
		
		while(scan.hasNext())
		{
			currentWord = scan.next();

			if (currentWord.contains("_"))
			{
				if (currentWord.charAt(0) == '_' || currentWord.charAt(currentWord.length()-1) == '_')
				{
					error = true;
				}
				for (int i = 0; i < currentWord.length() && error == false; i++)
				{
					if (Character.isUpperCase(currentWord.charAt(i)))
					{
						error = true;
						break;
					}
					else if (currentWord.charAt(i) == '_')
					{
						if (i != currentWord.length() - 1)
						{
							if (!Character.isUpperCase(currentWord.charAt(i+1)))
							{
								modifiedWord += currentWord.substring(i+1,i+2).toUpperCase();
								i++;
							}
							else
							{
								error = true;
								break;
							}
						}
					}
					else
					{
						modifiedWord += currentWord.charAt(i);
					}
				}
				if (error)
				{
					System.out.println("Error!");
					error = false;
				}
				else
				{
					System.out.println(modifiedWord);
				}
				modifiedWord = "";
			}
			else
			{
				for (int i = 0; i < currentWord.length(); i++)
				{
					if (Character.isUpperCase(currentWord.charAt(i)))
					{
						modifiedWord += "_" + currentWord.substring(i,i+1).toLowerCase();
					}
					else
					{
						modifiedWord += currentWord.charAt(i);
					}
				}
				
				System.out.println(modifiedWord);
				modifiedWord = "";
			}
		}
	}
}
