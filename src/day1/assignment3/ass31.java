package day1.assignment3;

import java.util.Scanner;
public class ass31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        double radius=sc.nextDouble();
        sc.close();
        double pi=3.14159;
        double area=pi*radius*radius;
        System.out.println("Area of circle is :" +area);
    }
}
