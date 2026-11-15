package day1.assignment4;
//Sum Of A Digits Of Number

import java.util.Scanner;
public class ass423 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        int sum=0;
       while(num>0){
           int digit=num%10;
           sum+=digit;
           num=num/10;
       }
        System.out.println("sum of numbers is :" +sum);
       sc.close();
    }
}
