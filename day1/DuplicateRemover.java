import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();

        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Remove duplicates
        int[] unique = removeDuplicates(arr, size);

        // Display unique elements
        System.out.println("Unique elements:");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }

        input.close(); // Close scanner
    }

    // Method to remove duplicates
    public static int[] removeDuplicates(int[] arr, int size) {
        int[] temp = new int[size]; // Temporary array to store unique elements
        int j = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            // Check if the element is already in the temp array
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not duplicate, add to temp
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }

        // Copy only unique elements into a new array
        int[] unique = new int[j];
        for (int i = 0; i < j; i++) {
            unique[i] = temp[i];
        }

        return unique; // Return array of unique elements
    }
}

