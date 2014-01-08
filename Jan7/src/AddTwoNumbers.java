import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class AddTwoNumbers
{
    public static void main(String[] args)
    {
        int one = 0;
        int two = 0;
        int result = 0;
        ArrayList<String> addList = new ArrayList<String>();
        
        Scanner scan = new Scanner(System.in);
        
        one = Integer.parseInt(scan.next());
        two = Integer.parseInt(scan.next());
        scan.close();
        
        String[] oneArr = new String[Math.abs(one)];
        String[] twoArr = new String[Math.abs(two)];
        
        addList.addAll(Arrays.asList(oneArr));
        addList.addAll(Arrays.asList(twoArr));
        result = addList.size();
        
        System.out.println(result);
    }
}