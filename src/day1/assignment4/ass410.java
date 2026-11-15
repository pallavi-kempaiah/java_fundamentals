package day1.assignment4;
//Calculate CGPA Java Program

import java.util.Scanner;
public class ass410 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of subjects:");
        int sub=sc.nextInt();
        double totalQualityPoints=0;
        double totalcredits=0;
        for(int i=1;i<=sub;i++){
            System.out.println("enter the subject " + i + " grade scored :");
            double grade=sc.nextDouble();
            System.out.println("enter the subject " + i + "credits:");
            double credits=sc.nextDouble();
            totalcredits+=credits;
            totalQualityPoints+=(grade*credits);
        }
        double CGPA = totalQualityPoints/totalcredits;
        System.out.println("CGPA :" +CGPA);
        sc.close();
    }
}
