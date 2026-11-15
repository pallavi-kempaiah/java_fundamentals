package day1.assignment4;
//Perfect Number In Java

import java.util.Scanner;
public class ass421 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num && num>0){
            System.out.println(num + " it is a perfect number ! ");
        }else{
            System.out.println(num + " it is not a perfect number !");
        }
        sc.close();
    }
}
