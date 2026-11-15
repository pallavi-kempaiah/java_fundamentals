package day1.assignment4;
//Calculate Depreciation of Value(eg..,, if i buy a laptop the rate of the laptop gets low each year that is depreciation)

import java.util.Scanner;
public class ass48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the original price :");
        double orig=sc.nextDouble();
        System.out.println("enter the depreciation percentage:");
        double rate=sc.nextDouble();
        System.out.println("enter the time in years ");
        double time=sc.nextDouble();

        double depreciationvalue=orig * Math.pow(1-rate/100,time);
        double totaldepreciationamount=orig-depreciationvalue;

        System.out.println("----depreciation summary---");
        System.out.println("initial value :" +orig);
        System.out.println("depreciation value after " +time+ " years :" +depreciationvalue);
        System.out.println("total loss: " +totaldepreciationamount);
        sc.close();
    }
}
