import java.util.*;
public class OrderArray {
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
           System.out.print("Ascending : ");
           for(int i= 0 ; i<n ; i++)
           {
            System.out.print(+arr[i]+" , ");
           }
           System.out.println();
           System.out.print("Descending : ");
           for(int i= n-1 ; i>=0 ; i--)
           {
            System.out.print(+arr[i]+" , ");
           }
        }
    } 

