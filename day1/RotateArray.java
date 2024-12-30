import java.util.Scanner;
public class RotateArray {
    
        // Method to rotate the array by n positions
        static void rotateArray(int[] arr, int n) {
            int len = arr.length;
            // Ensure n is within bounds
            n = n % len;
    
            // Rotate the array using simple loops
            for (int i = 0; i < n; i++) {
                int first = arr[0];
                for (int j = 0; j < len - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[len - 1] = first;
            }
        }
        static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    
        // Main method
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
    
            System.out.print("Enter the number of positions to rotate: ");
            int n = scanner.nextInt();
    
            System.out.println("Original Array:");
            printArray(arr);
    
            rotateArray(arr, n);
    
            System.out.println("Rotated Array:");
            printArray(arr);
    
            scanner.close();
        }
    }
    