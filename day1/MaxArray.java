import java.util.*;
class MaxArray
{
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
       System.out.println("Max is : "+arr[n-1]);
       System.out.println("Min is : "+arr[0]);
    }
}