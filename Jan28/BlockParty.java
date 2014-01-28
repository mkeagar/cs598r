import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class BlockParty
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int weeks = Integer.parseInt(scan.nextLine());
		ArrayList<Integer> addresses = new ArrayList<Integer>();
		
		for (int week = 0; week < weeks; week++)
		{
			addresses.add(Integer.parseInt(scan.nextLine()));
			Collections.sort(addresses);
			int half = 0;
			if (addresses.size() % 2 == 0)
			{
				half = addresses.size() / 2;
			}
			else
			{
				half = (addresses.size() / 2) + 1;
			}
			System.out.println(addresses.get(half-1));
		}	
	}
}