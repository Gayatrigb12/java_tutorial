import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxArray {
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter length of an array : ");
        int n = sc.nextInt();
        System.out.print("enter elements of array : ");
        int[] arr = new int[n];

        for(int i=0 ;i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
       Arrays.sort(arr);
       System.out.println("Second Max is : "+arr[n-2]);
       
    }
    
}
