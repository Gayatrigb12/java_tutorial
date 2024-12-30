import java.util.*;

public class AvgArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("enter length of an array : ");
            int n = sc.nextInt();
            System.out.print("enter elements of array : ");
            int[] arr = new int[n];
            int sum = 0;
            int avg = 0;
            for(int i=0 ;i<n ; i++)
            {
                arr[i] = sc.nextInt();
            }

            
            for(int i=0 ; i<n ; i++)
            {
                sum+= arr[i];
            }
            System.out.println("Sum : "+sum);

            avg = sum/(n-1);
            System.out.print("Avg : "+avg);
        }
}
