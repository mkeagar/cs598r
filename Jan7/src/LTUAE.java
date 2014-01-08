import java.util.Scanner;

class LTUAE
{
    
    public static void main(String[] args)
    {
        int current = 0;
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            current = scan.nextInt();
            if (current != 42)
                System.out.println(current);
            else
                break;
        }
        scan.close();
    }
}