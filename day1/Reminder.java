import java.util.Scanner;

public class Reminder {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num 1 : ");
        int num1= sc.nextInt();
        System.out.print("Enter a num 2 : ");
        int num2= sc.nextInt();
        int ans ;
        if(num1>num2)
        {
            ans = num1%num2;
            System.out.println("Reminder is : "+ans );
        }else{
            System.out.println("num1 is not divide by num2 ");
        }
        
    }
}

