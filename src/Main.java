import java.util.Scanner;
import models.Calculator;

public class Main {
    public static void main(String[] args) {
        // Initialize a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first operand
        System.out.print("Enter the first value: ");
        double operand1 = sc.nextDouble();

        // Prompt user to enter the second operand
        System.out.print("Enter the second value: ");
        double operand2 = sc.nextDouble();

        // Create a Calculator object with the user-provided operands
        Calculator calculationTool = new Calculator(operand1, operand2);

        // Display available operations to the user
        System.out.println("Select an operation:");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("4. Quotient");

        // Read user's operation choice
        int operationChoice = sc.nextInt();

        // Perform calculation based on user's choice
        if (operationChoice == 1) {
            System.out.println("Sum result: " + calculationTool.add());
        }
        else if (operationChoice == 2) {
            System.out.println("Difference result: " + calculationTool.subtract());
        }
        else if (operationChoice == 3) {
            System.out.println("Product result: " + calculationTool.multiply());
        }
        else if (operationChoice == 4) {
            if (calculationTool.getNum2() == 0) {
                System.out.println("Error: Division by zero is undefined.");
            }
            else {
                System.out.println("Quotient result: " + calculationTool.divide());
            }
        }
        else {
            System.out.println("Invalid selection. Please choose a number between 1 and 4.");
        }

    }
}