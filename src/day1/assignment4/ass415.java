package day1.assignment4;
//find npr ncr

import java.util.Scanner;
public class ass415 {
    public static long factorial(int num){
        long fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        System.out.println("enter the value of r : ");
        int r = sc.nextInt();
        if (n<0||r<0||n<r){
            System.out.println("invalid inputs!");
        }else {

            long npr = factorial(n) / factorial(n - r);
            long ncr = factorial(n) / (factorial(r) * factorial(n - r));
            System.out.println("permutation P(" + n + " , " + r + " ) = " +npr);
            System.out.println("combination C(" + n + " , " + r + " ) = " +ncr);
        }
    }
}
