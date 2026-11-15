package day1.assignment4;
//HCF Of Two Numbers Program
//LCM Of Two Numbers

import java.util.Scanner;
public class ass419 {
    public static int findhcf(int a , int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number :");
        int num1=sc.nextInt();
        System.out.println("enter second number :");
        int num2=sc.nextInt();
        long hcf=findhcf(num1,num2);
        long lcm=((long)num1*num2)/hcf;
        System.out.println("hcf of " + num1 + " and " + num2 + " is : " +hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is : " +lcm);
        sc.close();
    }
}
