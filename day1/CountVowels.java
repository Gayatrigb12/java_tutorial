import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        int vCount=0;
        int aCount=0;
        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.toLowerCase().charAt(i);
            if(ch=='a' ||ch=='e'|| ch=='i' || ch=='o' || ch=='u' )
            {
                vCount++;
            }else{
                aCount++;
            }
        }
        System.out.println("Vowel count is : "+vCount);
        System.out.println("Alphabet count is : "+aCount);
        
    }
}
