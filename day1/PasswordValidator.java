import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        if (password.length() >= 8 && hasLetter(password) && hasDigit(password)) 
        {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
    public static boolean hasLetter(String password) {
        for (int i = 0; i < password.length(); i++) 
        { 
            if (Character.isLetter(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean hasDigit(String password) 
    {
        for (int i = 0; i < password.length(); i++)
         { 
            if (Character.isDigit(password.charAt(i))) 
            {
                return true;
            }
        }
        return false;
    }
}
