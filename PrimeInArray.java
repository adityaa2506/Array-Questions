import java.util.Scanner;

public class PrimeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        // Input array elements
        for (int i = 0; i < len; i++) {
            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
        }

        // Check for prime numbers
        for (int i = 0; i < len; i++) {
            boolean isPrime = true; // Assume number is prime initially

            // Handle special cases
            if (arr[i] <= 1) {
                isPrime = false;
            } else {
                // Check for divisibility up to square root of number
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Print result for each number
            if (isPrime) {
                System.out.println(arr[i] + " is a prime number.");
            } else {
                System.out.println(arr[i] + " is not a prime number.");
            }
        }

        sc.close();
    }
}