import java.util.Collections;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class BinarySearch
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String info = br.readLine();
		String[] info_arr = info.split(" ");

		int numElements = Integer.parseInt(info_arr[0]);
		int queries = Integer.parseInt(info_arr[1]);

		String numbers = br.readLine();
		String[] elements = numbers.split(" ");
		ArrayList<String> elementList = new ArrayList<String>();
		for (String s : elements)
		{
			elementList.add(s);
		}

		Collections.sort(elementList);

		for (int i = 0; i < queries; i++)
		{
			String query = br.readLine();

			int index = Collections.binarySearch(elementList, query);
			if (index == -1)
			{
				System.out.println(index);
				continue;
			}	
			index = elementList.subList(0, index + 1).indexOf(query);
			System.out.println(index);
		}

	}

}