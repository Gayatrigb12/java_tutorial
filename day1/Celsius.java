import java.util.Scanner;
class Celsius
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter degree in celsius :");
        double celsius = sc.nextDouble();

        double fehrenheit = (9.0/5) * celsius + 32;

        System.out.println(celsius + "  celsius is  " +fehrenheit+ "  fehrenheit");
    }
}

// op --->
// Enter degree in celsius :43
// 43.0  celsius is  109.4  fehrenheit