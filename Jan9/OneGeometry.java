//One Geometry
//(d-c)+(c-b) = a

import java.util.Scanner;

class OneGeometry
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int numCases = scan.nextInt();
		
		for (int i = 0; i < numCases; i++)
		{
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			
			System.out.println((c-d)+(c-b));
		}
	}
}
