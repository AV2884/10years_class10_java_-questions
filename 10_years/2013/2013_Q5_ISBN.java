// 2013 Q5
import java.io.IOException;
import java.util.*;

class ISBN {
    public static void main(String args[])throws IOException
    {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[10];
            int i;
            
            for(i=0;i<10;i++)
            {
                System.out.print("Enter number "+(i+1)+" :");
                arr[i] = sc.nextInt();
            }
            int sum=0;
            int t;
            for(i=0;i<10;i++)
            {
                t = arr[i] * (i+1);
                sum += t;
            }
            if(sum%11==0)
            {
                System.out.println("ISBN legal");
            }
            else
            {
                System.out.println("ISBN Illegal");
            }
        }

    }
}
