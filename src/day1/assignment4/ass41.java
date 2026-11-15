package day1.assignment4;
//Factorial Program In Java

import java.util.Scanner;
public class ass41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to findits factorial");
        int num=sc.nextInt();
        int mul=1;
        for(int i=1;i<=num;i++){
            mul*=i;
        }
        System.out.println("factorial of a number is:" +mul);
    }
}
