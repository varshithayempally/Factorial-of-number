import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Variable to store the factorial result
        long factorial = 1;

        // Calculate factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply current value of factorial by i
        }

        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
