import java.util.*;
import java.io.*;

class Kompici
{
	public static void main(String[] args) throws IOException
	{
		// ArrayList<Set> numberSets = new ArrayList<Set>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numCases = Integer.parseInt(br.readLine());
		int pals = 0;
		int[] numSet = new int[1024];

		for (int i = 0; i < numCases; i++)
		{	
			Set<Integer> number = new HashSet<Integer>();
			while (true)
			{
				char c = (char)br.read();
				if (c == '\n')
					break;
				number.add(Character.getNumericValue(c));
				System.out.println("Adding " + c + " to temp set.");
			}
			// numberSets.add(number);
			int index = 0;
			for (Integer num : number)
			{
				index += Math.pow(2, num);
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

				pals = numSet[i] * (numSet[i] -1) / 2;
			}
		}
		





		// for (int i = 0; i < numberSets.size(); i++)	
		// 	for (int j = i + 1; j < numberSets.size(); j++)
		// 	{
		// 		Set<Character> intersection = new HashSet<Character>(numberSets.get(i));

		// 		intersection.retainAll(numberSets.get(j));
		// 		if (!intersection.isEmpty())
		// 		{
		// 			pals++;
		// 		}
		// 	}

		System.out.println(pals);
	}

}