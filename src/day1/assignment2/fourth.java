package day1.assignment2;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            // 1. Get First Number Safely
            System.out.println("\nEnter the first number (or type 'x' to exit):");
            String input1 = in.next();

            if (input1.equalsIgnoreCase("x")) {
                break;
            }

            int num1;
            try {
                num1 = Integer.parseInt(input1);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                continue;
            }

            // 2. Get Second Number Safely
            System.out.println("Enter the second number:");
            String input2 = in.next();

            int num2;
            try {
                num2 = Integer.parseInt(input2);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for the second number! Let's start over.");
                continue;
            }

            // 3. Get Operator
            System.out.println("Enter the operator you want to use (+, -, *, /):");
            String op = in.next();

            // 4. Perform Calculation
            try {
                if (op.equals("+")) {
                    System.out.println("Result: " + (num1 + num2));
                } else if (op.equals("-")) {
                    System.out.println("Result: " + (num1 - num2));
                } else if (op.equals("*")) {
                    System.out.println("Result: " + (num1 * num2));
                } else if (op.equals("/")) {
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                } else {
                    System.out.println("Invalid operator! Please use +, -, *, or /.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Math error occurred.");
            }
        }

        System.out.println("End of the program.");
    }
}