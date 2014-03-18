import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Knapsack
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sn = br.readLine();
		String[] sn_arr = sn.spit(" ");
		int s = Integer.parseInt(sn_arr[0]);
		int n = Integer.parseInt(sn_arr[1]);

		int[] B = new Int[n+1][s+1];

		for (int i = 1; i <= n; i++)
		{
			String item = br.readLine();
			String[] item_arr = item.split(" ");
			int weight = Integer.parseInt(item_arr[0]);
			int value = Integer.parseInt(item_arr[1]);
			for (int j = 1; j <= s; j++)
			{
				if (weight > j)
					B[i][j] = B[i-1][j];
				else
				{
					int newValue = value + B[i-1][j-weight];
					B[i][j] = Math.max(B[i-1][j], newValue);
				}
			}
		}
		System.out.println(B[n][s]);
	}
}
