package day1.assignment2;

import java.util.Scanner;
public class six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter indian rupee:");
        int rup=in.nextInt();
        float usd_1=94.7167f;
        float usd=rup/usd_1;
        System.out.println(rup+ " in usd is " +usd);
    }
}
