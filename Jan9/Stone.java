import java.util.Scanner;

class Stone
{	
	static final int MAX = 1000009;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		Point[] points = new Point[MAX];

		int numCases = Integer.parseInt(scan.nextLine());

		for (int index = 0; index < numCases; index++)
		{
			int numPoints = Integer.parseInt(scan.nextLine());

			for (int i = 0; i < numPoints; i++)
			{	
				points[i] = new Point();

				String pointString = scan.nextLine();

				String[] point = pointString.split(" ");

				points[i].x = Double.parseDouble(point[0]);
				points[i].y = Double.parseDouble(point[1]);
			}

			points[numPoints] = points[0];

			double cx = 0.0f;
			double cy = 0.0f;
			double a = 0.0f;
			double d = 0.0f;

			for (int i = 0; i < numPoints; i++)
			{
				d = (points[i].x * points[i+1].y) - (points[i+1].x * points[i].y);
				a += d;
				cx += (points[i].x + points[i+1].x) * d;
				cy += (points[i].y + points[i+1].y) * d;
			}

			cx /= (3.0 * a);
			cy /= (3.0 * a);

			System.out.format("%.2f %.2f\n", cx, cy);
		}

	}

	static class Point
	{
		public double x;
		public double y;

		public Point()
		{
			x = 0.0d;
			y = 0.0d;
		}


		public String toString()
		{
			return "[" + x + ", " + y + "]";
		}


	}
}