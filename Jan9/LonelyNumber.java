import java.util.*;

class LonelyNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int numLines = scan.nextInt();
		Map<Integer, Set<Integer>> numbers = new HashMap<Integer, Set<Integer>>();
		numbers.put(1, new HashSet<Integer>());
		numbers.put(2, new HashSet<Integer>());
		
		for(int i = 0; i < numLines; i++)
		{
			int curNum = scan.nextInt();
			
			if(numbers.get(1).contains((Integer) curNum))
			{
				numbers.get(1).remove((Integer) curNum);
				numbers.get(2).add((Integer) curNum);
			}
			else
			{
				numbers.get(1).add((Integer) curNum);
			}
		}
		
		System.out.println(numbers.get(1).toArray()[0]);
	}
}
