import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String str = sc.nextLine();
        String newStr ="";
        for(int i=str.length()-1 ; i>=0 ; i--)
        {
            newStr = newStr+str.charAt(i);
        }
        System.out.print("reverse statement : "+newStr);
    }
    
}
