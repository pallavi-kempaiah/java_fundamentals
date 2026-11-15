package day1.assignment4;
//Find if a number is palindrome or not

import java.util.Scanner;
public class ass417 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(String.valueOf(num).length()<2){
            System.out.println("enter number which has more than one digit:");
            num=sc.nextInt();
        }
        int orig=num;
        int rev=0;
        while (num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==orig){
            System.out.println(orig + " is palindrome ");
        }else{
            System.out.println(orig + "  is not a palindrome");
        }
        sc.close();
    }
}
