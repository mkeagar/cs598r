import java.util.*;

class ScavengerHunt
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int numScenarios = scan.nextInt();
		
		for(int i = 0; i < numScenarios; i++)
		{
			int numSteps = scan.nextInt();
			Set<String> sources = new HashSet<String>();
			Set<String> destinations = new HashSet<String>();
			Map<String, String> steps = new HashMap<String, String>();
			
			for(int j = 0; j < numSteps - 1; j++)
			{
				String source = scan.next();
				String destination = scan.next();
				sources.add(source);
				destinations.add(destination);
				steps.put(source, destination);
			}
			
			System.out.println("Scenario #" + (i + 1) + ":");
			
			String start = "", finish = "";
			
			for(Object s : sources.toArray())
				if(!destinations.contains((String) s))
					start = (String) s;
					
			for(Object s : destinations.toArray())
				if(!sources.contains((String) s))
					finish = (String) s;
					
			String current = start;
			
			while(!current.equals(finish))
			{
				System.out.println(current);
				current = steps.get(current);
			}
			
			System.out.println(finish + "\n");
		}
	}
}
