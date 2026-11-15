package day1.assignment2;

import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=in.nextInt();
        System.out.println("enter the second number:");
        int num2=in.nextInt();
        if(num1>num2){
            System.out.println(+num1+ " is largest");
        }
        else{
            System.out.println(+num2+ " is largest");
        }
    }
}
