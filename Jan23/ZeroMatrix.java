import java.util.Scanner;
import java.util.ArrayList;

class ZeroMatrix
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> source = new ArrayList<String>();
		ArrayList<String> target = new ArrayList<String>();
		int cols = -1;
		int[] zeroCols;
		boolean zeroRow = false;
		String result = "";

		while(scan.hasNextLine())
		{
			String line = scan.nextLine();
			source.add(line);
			if (cols == -1)
			{
				cols = line.split(" ").length;
				zeroCols = new int[cols];
			}
		}

		zeroCols = new int[cols];
		for (int i = 0; i < source.size(); i++)
		{
			String line = source.get(i);
			String[] row = line.split(" ");

			for (int j = 0; j < cols; j++)
			{
				if (row[j].equals("0"))
				{
					zeroCols[j] = 1;
					zeroRow = true;
				}
			}
			if (zeroRow)
			{
				for (int j = 0; j < cols; j++)
				{
					
					if (j != cols - 1)
						result += "0 ";
					else
						result += "0";
				}
			}
			else
			{
				for (int j = 0; j < cols; j++)
				{
					if (zeroCols[j] == 1)
						result += "0";
					else
						result += row[j];

					if (j < cols - 1)
						result += " ";
				}
			}

			result += "\n";
			zeroRow = false;
		}
		System.out.println(result);
	}
}