package day1.assignment4;
//Calculate Electricity Bill

import java.util.Scanner;
public class ass42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of units");
        double units=sc.nextDouble();
        double billamount=0;
        if(units<=100){
            billamount=units*1.50;
        }else if(units<=200){
            billamount=(100*1.50)+((units-100)*2.50);
        }else if(units<=300){
            billamount=(100*1.50)+(100*2.50)+((units-200)*4.00);
        }else {
            billamount=(100*1.50)+(100*2.50)+(100*4.00)+((units-300)*6.00);
        }
        System.out.println("total bill amount is :" +billamount);
        sc.close();
    }
}
