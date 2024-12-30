import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double pi=22/7;
        // Calculate the circumference of the circle
        double circumference = 2 * Math.PI * radius;

        // Calculate the area of the circle
        double area = pi * radius * radius;
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

      
    }
}
