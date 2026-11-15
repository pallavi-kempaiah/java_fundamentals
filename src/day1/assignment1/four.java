package day1.assignment1;

import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=in.nextInt();
        System.out.println("enter the second number:");
        int num2=in.nextInt();
        int originalnum1=num1;
        int originalnum2=num2;
        int hcf=1;
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
            hcf=num1;
        }
        System.out.println("hcf:"+hcf);
        int lcm=(originalnum1*originalnum2)/hcf;
        System.out.println("lcm is:"+lcm);


    }
}
