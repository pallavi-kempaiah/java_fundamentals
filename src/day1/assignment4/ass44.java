package day1.assignment4;
//Calculate Discount Of Product

import java.util.Scanner;
public class ass44 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the price of the product");
        double orig=sc.nextDouble();
        System.out.println("enter the discount percent:");
        double disc=sc.nextDouble();

        double discountamount=(orig*disc)/100;
        double finalprice=orig-discountamount;

        System.out.println("original price:" +orig);
        System.out.println("discount amount:" +discountamount);
        System.out.println("final price :" +finalprice);
        sc.close();
    }
}
