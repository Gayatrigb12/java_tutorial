import java.util.Scanner;
class ArithmeticOp 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num 1 : ");
        int num1= sc.nextInt();
        System.out.print("Enter a num 2 : ");
        int num2= sc.nextInt();
        System.out.print("Enter a operator : ");
        char op = sc.next().charAt(0);
        int ans ;

        switch (op) {
            case '+': ans = num1+num2;
                     System.out.println("Addition : "+ans);
                     break;
            case '-': ans = num1-num2;
                     System.out.println("Substraction : "+ans);
                     break;
            case '*': ans = num1*num2;
                     System.out.println("Multiplication : "+ans);
                     break;
            case '/': ans = num1/num2;
                     System.out.println("Division : "+ans);
                     break;
        
            default: System.out.println("invalid operator ");
                break;
        }
        
    }
}