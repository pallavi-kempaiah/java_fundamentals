package day1.assignment3;

/*fibonnaci series*/
import java.util.Scanner;

public class ass37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        int a = 0; // First term
        int b = 1; // Second term

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            // Calculate the next term and shift values forward
            int next = a + b;
            a = b;
            b = next;
        }

        in.close();
    }
}