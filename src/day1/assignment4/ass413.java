package day1.assignment4;
//Sum Of N Numbers

import java.util.Scanner;
public class ass413 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sum=0;
        while(true){
            System.out.println("enter the number (type 0 to stop ):");
            double num=sc.nextDouble();
            if(num==0){
                System.out.println("end of program");
                break;
            }
            sum+=num;
        }
        System.out.println("sum of numbers is :" +sum);
        sc.close();
    }
}
