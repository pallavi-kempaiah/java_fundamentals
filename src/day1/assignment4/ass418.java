package day1.assignment4;
//Future Investment Value

import java.util.Scanner;
public class ass418 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter he initial amount:");
        double p=sc.nextDouble();
        System.out.println("enter the rate of interest (if have it in percent divide it with 100 and then enter the value)");
        double r=sc.nextDouble();
        System.out.println("enter the how years :");
        double t=sc.nextDouble();
        System.out.println("enter how many times in a year interest is applied:");
        int n=sc.nextInt();
        double fv=p*Math.pow((1+r/n),n*t);
        System.out.println("future investment value is : " +fv);
        sc.close();
    }
}
