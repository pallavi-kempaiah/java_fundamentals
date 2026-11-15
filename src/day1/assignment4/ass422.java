package day1.assignment4;
//Check Leap Year Or Not

import java.util.Scanner;
public class ass422 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year:");
        int year=sc.nextInt();
        if(String.valueOf(Math.abs(year)).length()<4){
            System.out.println("enter the 4 digits year!:");
            year=sc.nextInt();
        }
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year + " is a leap year ");
        }else{
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}
