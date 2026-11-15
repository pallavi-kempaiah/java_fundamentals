package day1.assignment2;


import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the principal:");
        int p=in.nextInt();
        System.out.println("enter the time:");
        int t=in.nextInt();
        System.out.println("enter the rate:");
        int r=in.nextInt();
        int si=(p*r*t)/100;
        System.out.println("simple interest is: " +si);
    }
}
