import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ModExp
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numCases = Integer.parseInt(br.readLine());

		for (int i = 1; i <= numCases; i++)
		{
			String line = br.readLine();
			String[] lineArr = line.split(" ");

			BigInteger b = new BigInteger(lineArr[0]);
			BigInteger e = new BigInteger(lineArr[1]);
			BigInteger m = new BigInteger(lineArr[2]);

			System.out.println(i + ". " + b.modPow(e, m));
		}
	}
}