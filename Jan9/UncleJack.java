import java.util.*;
import java.math.BigInteger;

class UncleJack
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			BigInteger nephews = new BigInteger(scan.next());
			int cds = scan.nextInt();
			
			if(nephews.equals(BigInteger.ZERO) && cds == 0)
				break;
			System.out.println(nephews.pow(cds));
		}
	}
}
