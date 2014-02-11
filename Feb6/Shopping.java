import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Shopping {

	// Global Variables
	public boolean[][] visited;
	public int[][] dist;
	public String[][] prev;
	public List<int[][]> path;
	public PriorityQueue<Integer[]> queue;
	public int height, width;

	public Shopping()
	{
		path = null;
		queue = null;
	}

	public void initialize()
	{

	}

	public findDijkstrasPath()
	{

	}

	public findPath()
	{

	}

	public static void main(String[] args) throws IOException
	{   
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		queue = new PriorityQueue<Integer[]>();


		while (True)
		{
			Shopping shop = new Shopping();
			line = reader.readLine();
			lineArr = line.split(" ");
			shop.width = Integer.parseInt(lineArr[0]);
			shop.height = Integer.parseInt(lineArr[1]);

			shop.queue = new PriorityQueue<Integer[]>();

			store = new



		}







	}



}








 //         public void initialize(Point start)
 //         {
 //             //Initialize variables

 //             visited = new bool[width, height];
 //             dist = new int[width, height];
 //             prev = new Point[width, height];
 //             path = new List<Point>();
 //             queue = new PriorityQueue();

 //             for (int i = 0; i < width; i++)
 //                 for (int j = 0; j < height; j++)
 //                 {
 //                     visited[i, j] = false;
 //                     dist[i, j] = int.MaxValue;
 //                     prev[i, j] = new Point();

 //                     if (i == start.X && j == start.Y)
 //                     {
 //                         dist[i, j] = 0;
 //                         queue.Enqueue(start, dist[i, j]);
 //                     }
 //                 }
 //         }

 //         public void findDijkstrasPath(Point start, Point end)
 //         {
 //             initialize(start);
 //             while (queue.Count > 0)
 //             {
 //                 Point u = (Point)queue.Dequeue();

 //                 if (u.Equals(end))
 //                     break;

 //                 if (dist[u.X, u.Y] == int.MaxValue)
 //                     break;

 //                 List<Point> points = new List<Point>();
 //                 points.Add(new Point(u.X, u.Y - 1));
 //                 points.Add(new Point(u.X + 1, u.Y));
 //                 points.Add(new Point(u.X, u.Y + 1));
 //                 points.Add(new Point(u.X - 1, u.Y));

 //                 for (int i=0; i<points.Count; i++)
 //                     if (!visited[points[i].X, points[i].Y] && points[i].X > 0 && points[i].Y > 0 && points[i].X < Image.Bitmap.Width-1  && points[i].Y < Image.Bitmap.Height-1)
 //                     {
 //                         int alt = dist[u.X,u.Y] + GetPixelWeight(points[i]);
 //                         if (alt < dist[points[i].X, points[i].Y])
 //                         {
 //                             visited[points[i].X, points[i].Y] = true;
 //                             dist[points[i].X, points[i].Y] = alt;
 //                             prev[points[i].X, points[i].Y] = u;
 //                             queue.Enqueue(points[i], -alt);
 //                         }
 //                     }
 //             }
 //             findPath(end, start);
 //         }

 //         public void findPath(Point end, Point start)
 //         {
 //             Point current = end;
 //             while (!current.Equals(start))
 //             {
 //                 path.Add(current);
 //                 current = prev[current.X, current.Y];
 //             }
 //         }
 // 	}
 // }
