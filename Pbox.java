import java.util.*;

public class Pbox {

    public static int[] straightPBox(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

    public static int[] compressedPBox(int[] input) {
        int[] output = new int[3];
        output[0] = input[0];
        output[1] = input[2];
        output[2] = input[4];
        return output;
    }

    public static int[] expandedPBox(int[] input) {
        int[] output = new int[7];
        output[0] = input[0];
        output[1] = input[1];
        output[2] = input[2];
        output[3] = input[2];
        output[4] = input[3];
        output[5] = input[4];
        output[6] = input[0];
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputNumbers = new int[5];
        System.out.println("Enter 5 numbers for P-Box:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            inputNumbers[i] = sc.nextInt();
        }

        boolean running = true;

        while (running) {
            System.out.println("\nChoose P-Box type:");
            System.out.println("1. Straight P-Box");
            System.out.println("2. Compressed P-Box");
            System.out.println("3. Expanded P-Box");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            int choice = sc.nextInt();

            int[] result;

            switch (choice) {
                case 1:
                    result = straightPBox(inputNumbers);
                    System.out.println("\nStraight P-Box Output: " + Arrays.toString(result));
                    break;
                case 2:
                    result = compressedPBox(inputNumbers);
                    System.out.println("\nCompressed P-Box Output: " + Arrays.toString(result));
                    break;
                case 3:
                    result = expandedPBox(inputNumbers);
                    System.out.println("\nExpanded P-Box Output: " + Arrays.toString(result));
                    break;
                case 4:
                    System.out.println("\nExiting program. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}