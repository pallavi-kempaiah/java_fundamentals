package day1.assignment1;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers to add. Type 'x' to end the program:");
        int sum=0;
        while (true) {
            System.out.print("Enter: ");
            String input = in.next();

            // Check for exit condition first
            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                System.out.println("Total sum of the numbers is: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'x' to exit.");
            }
        }

        System.out.println("Program ended. Final sum is: " + sum);
    }
}