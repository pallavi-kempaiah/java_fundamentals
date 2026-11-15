package day1.assignment3;
//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;
public class ass310 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest=Integer.MIN_VALUE;
        while(true){
            System.out.println("enter the number (enter 0 to stop):");
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num>largest){
                largest=num;
            }
        }
        if(largest==Integer.MIN_VALUE){
            System.out.println("no numbers where entered");
        }else{
            System.out.println("the largest number among entered number is:" +largest);
        }
    }
}
