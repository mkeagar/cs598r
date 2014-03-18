import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Tabs
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tabLevel = 0;
		int count = 0;
		int numLines = Integer.parseInt(br.readLine());
		for (int i = 0; i < numLines; i++)
		{
			int current = Integer.parseInt(br.readLine());
			if (current > tabLevel)
				count += Math.max(0, current - tabLevel);
			tabLevel = count;

		}
		System.out.println(count);
	}

}
