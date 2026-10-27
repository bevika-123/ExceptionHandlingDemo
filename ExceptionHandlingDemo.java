
import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("===== SIMPLE CALCULATOR =====");

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;

                case 2:
                    System.out.println("Result: " + (a - b));
                    break;

                case 3:
                    System.out.println("Result: " + (a * b));
                    break;

                case 4:
                    System.out.println("Result: " + (a / b));
                    break;

                default:
                    System.out.println("Invalid operation choice!");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter integers only!");

        } finally {
            sc.close();
            System.out.println("\nCalculator program completed.");
        }

        System.out.println("Thank you for using the calculator!");
    }
}
