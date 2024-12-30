import java.util.Scanner;
class Fehrenheit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter degree in celsius :");
        double fehrenheit = sc.nextDouble();

        double celsius = (fehrenheit - 32)* 5/9;

        System.out.println(fehrenheit+ " fehrenheit is  " +celsius+ " celsius");
    }
}




