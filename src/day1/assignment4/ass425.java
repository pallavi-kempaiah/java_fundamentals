package day1.assignment4;
//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;
public class ass425 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sumeven=0;
        int sumodd=0;
        int sumneg=0;
        while(true){
            System.out.println("enter the number:");
            int num=sc.nextInt();

            if(num==0){
                break;
            }
            if(num>0 && num % 2 ==0){
                sumeven+=num;
            }
            if(num>0 && num%2!=0){
                sumodd+=num;
            }
            if(num<0){
                sumneg+=num;
            }
        }
        System.out.println("sum of even positive number is : " +sumeven);
        System.out.println("sum of odd positive numbers is : " +sumodd );
        System.out.println("sum of negative numbers is : " +sumneg);
        sc.close();
    }
}
