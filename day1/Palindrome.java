import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
		String str = sc.next();
		String nstr ="";
		for(int i=0 ;i<str.length();i++)
		{
			char ch = str.charAt(i);
			nstr= ch+nstr;

		}	
		System.out.println(nstr.equals(str) ?(str+" palindrome str "): "not palindrome str");
	}
}