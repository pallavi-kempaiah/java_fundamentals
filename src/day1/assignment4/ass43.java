package day1.assignment4;
//Calculate Average Of N Numbers

import java.util.Scanner;
public class ass43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n number:");
        int num=sc.nextInt();//how many numbers do u want to enter
        double sum=0;
        for(int i=1;i<=num;i++){
            System.out.println("enter the " + i + " number:");
            double n=sc.nextDouble();
            sum+=n;
        }
        double average=sum/num;
        System.out.println("average of " + num + " number is:"+average);
    }
}
