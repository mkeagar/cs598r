import java.util.*;
import java.io.*;

class Kompici2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long numCases = Integer.parseInt(br.readLine());
		long pals = 0;
		long[] numSet = new long[1024];

		for (int i = 0; i < numCases; i++)
		{	
			char[] number = br.readLine().toCharArray();
			boolean[] digits = new boolean[10];
			int index = 0;

			for (char c : number)
			{
				int digit = Character.getNumericValue(c);

				if (!digits[digit])
				{
					index += 1 << digit;
					digits[digit] = true;
				}
			}

			numSet[index]++;
		}


		for (int i = 0; i < numSet.length; i++)
		{
			if (numSet[i] == 0) continue;
			else
			{
				for (int j = i + 1; j < numSet.length; j++)
				{
					if (numSet[j] == 0) continue;
					else if ((i & j) != 0)
						pals += numSet[i] * numSet[j];
				}

				pals += (numSet[i] * (numSet[i] -1)) >> 1;
			}
		}

		System.out.println(pals);
	}

}