import java.util.*;

public class SearchArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
            System.out.println("Enter length of an array : ");
            int n = sc.nextInt();
            System.out.println("Enter elements of array : ");
            String[] arr = new String[n];
            System.out.println("Enter element to search :");
            String x = sc.next();
            for(int i=0 ;i<n ; i++)
            {
                arr[i] = sc.next();
            }
            for(int i=0 ; i<n ; i++)
            {
                if(arr[i].equals(x))
                {
                    System.out.println(arr[i]+" : "+i);
                }
            }
        }
    
}
