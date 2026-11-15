package day1.assignment4;
//Calculate Average Marks

import java.util.Scanner;
public class ass412 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of subjects:");
        int sub=sc.nextInt();
        int count=0;
        int sum=0;
        for(int i=1;i<=sub;i++){
            System.out.println("enter the marks of " + i + " subject :");
            int marks=sc.nextInt();
            sum+=marks;
            count++;
        }
        double ave=(double)sum/count;
        System.out.println("Average marks is : " +ave);
        sc.close();
    }
}
