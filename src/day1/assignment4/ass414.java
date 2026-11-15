package day1.assignment4;
//Armstrong Number In Java

import java.util.Scanner;
public class ass414 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int orig=num;
        int neww=0;
        while(num>0){
            int digit=num%10;
            neww+=digit*digit*digit;
            num=num/10;
        }
        if(neww==orig){
            System.out.println(orig + " is armstrong number");
        }else{
            System.out.println(orig + " is not an armstrong number ");
        }
        sc.close();
    }
}
