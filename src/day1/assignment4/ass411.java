package day1.assignment4;
//Compound Interest Java Program

import java.util.Scanner;
public class ass411 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal amount(borrowed or investment):");
        int p=sc.nextInt();
        System.out.println("enter the rate of interest per year:");
        int r=sc.nextInt();
        System.out.println("enter the time (in years):");
        int t=sc.nextInt();
        //calculating the amount i.i., the total value of inverstment or the loan after t years
        double A= p*Math.pow((1+r/100.0),t);
        double ci=A-p;
        System.out.println("the compound Interest is:" +ci);
        sc.close();
    }
}
