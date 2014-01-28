import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

class Plonk
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// Scanner scan = new Scanner(System.in);
		
		int numCases = Integer.parseInt(reader.readLine());
		
		for (int caseNum = 0; caseNum < numCases; caseNum++)
		{
			int numFriends = Integer.parseInt(reader.readLine());
			
			int[] x = new int[numFriends];
			int[] sortedX = new int[numFriends];
			int[] y = new int[numFriends];
			int[] sortedY = new int[numFriends];
			
			for (int friend = 0; friend < numFriends; friend++)
			{
				String line = reader.readLine();
				String[] lineArr = line.split(" ");
				x[friend] = Integer.parseInt(lineArr[0]);
				y[friend] = Integer.parseInt(lineArr[1]);
				sortedX[friend] = x[friend];
				sortedY[friend] = y[friend];
			}
			
			Arrays.sort(sortedX);
			Arrays.sort(sortedY);
			
			double medianX = median(sortedX);
			double medianY = median(sortedY);
			int closestX = 10000;
			int closestY = 10000;
			double walkDist = 10000;
			for (int friend = 0; friend < numFriends; friend++)
			{	
				double newWalkDist = Math.abs((double)x[friend] - medianX) + Math.abs((double)y[friend] - medianY);
				if (newWalkDist < walkDist)
				{
					walkDist = newWalkDist;
					closestX = x[friend];
					closestY = y[friend];
				}
			}
			int totDist = 0;
			for (int friend = 0; friend < numFriends; friend++)
			{
				totDist+=(Math.abs(x[friend]-closestX) + Math.abs(y[friend]-closestY));
			}
			
			System.out.println(totDist);
		}
	}
	
	private static double median(int[] sortedArray)
	{
		double median = 0.0;
		
		if (sortedArray.length % 2 == 0)
		{
			int half = sortedArray.length / 2;
			median = (sortedArray[half-1] + sortedArray[half+1])/2.0;
		}
		else
		{
			int half = sortedArray.length / 2;
			median = sortedArray[half + 1];
		}
		return median;
	}
}