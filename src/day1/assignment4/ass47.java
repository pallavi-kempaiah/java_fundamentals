package day1.assignment4;
//Power In Java

import java.util.Scanner;
public class ass47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //first method
        System.out.println("enter the base:");
        int base1=sc.nextInt();
        System.out.println("enter the exponent:");
        int expo1=sc.nextInt();
        double power1=Math.pow(base1,expo1);
        System.out.println("the value of " + base1 + " to the power " + expo1 + " is :" +power1) ;

        //second method
        double result=1;
        for(int i=1;i<=expo1;i++){
             result*=base1;
        }
        System.out.println("the value of " + base1 + " to the power of " + expo1 + " is :" +result);
        sc.close();
    }
}
