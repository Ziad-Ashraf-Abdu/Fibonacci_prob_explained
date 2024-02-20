// Importing required classes
import java.util.Scanner;

// Defining the class FibonacciSequence
public class FibonacciSequence0 {
    // The main method which is the entry point of the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        // Reading the input number from the user
        int num = scanner.nextInt();

        // Generating the Fibonacci sequence up to the entered number
        long[] fibonacci = generateFibonacci(num);

        // Printing the Fibonacci sequence
        System.out.println("Fibonacci sequence: ");
        // Looping through each term in the Fibonacci sequence
        for (long term : fibonacci) {
            // Printing each term
            System.out.print(term + " ");
        }
    }

    // Creating another method to generate the Fibonacci sequence up to a given number
    public static long[] generateFibonacci(int num) {
        // The size of the array is num+1 (e.g. the number 9 has 10 elements in the series, and 10 has 11 and so on.)
        int n = num+1;
        // Creating an array to store the Fibonacci sequence
        long[] fibonacci = new long[n];

        // If the number is greater than or equal to 1, the first term is 0
        if (num >= 1) {
            fibonacci[0] = 0;
        }
        // If the number is greater than or equal to 2, the second term is 1
        if (num >= 2) {
            fibonacci[1] = 1;
        }

        // Looping from the third term to the nth term
        for (int i = 2; i < n; i++) {
            // Each term is the sum of the two preceding ones (that is the fibonacci law, you can search it.)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Returning the Fibonacci sequence
        return fibonacci;
    }
}
