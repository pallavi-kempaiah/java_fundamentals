package day1.assignment1;

import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number to find there multiples:");
        int a=in.nextInt();
        for(int i=1;i<=10;i++){
            int b=a*i;
            System.out.println(a+ "x" +i+ "=" +b);
        }
    }
}
