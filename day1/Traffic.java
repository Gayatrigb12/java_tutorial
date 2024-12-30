import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = scanner.nextLine().toLowerCase(); 

        System.out.print("Is there an obstacle? (true/false): ");
        boolean obstacle = scanner.nextBoolean();
        if (obstacle) {
            System.out.println("Stop! There's an obstacle.");
        } else if (lightColor.equals("green")) {
            System.out.println("Go!");
        } else if (lightColor.equals("yellow")) {
            System.out.println("Slow Down!");
        } else if (lightColor.equals("red")) {
            System.out.println("Stop!");
        } else {
            System.out.println("Invalid input! Please enter Green, Yellow, or Red.");
        }
    }
}

