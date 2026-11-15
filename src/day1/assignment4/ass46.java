package day1.assignment4;
//Calculate Commission Percentage

import java.util.Scanner;
public class ass46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the original price:");
        double orig=sc.nextDouble();
        System.out.println("enter the comission amount:");
        double comission=sc.nextDouble();
        double total=orig+comission;
        double comissionPercent=(comission/total)*100;
        System.out.println("commission percentage is:" +comissionPercent);
        sc.close();
    }
}
