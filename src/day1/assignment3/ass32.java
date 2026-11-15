package day1.assignment3;

import java.util.Scanner;
public class ass32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the breadth of the triangle:");
        double b=sc.nextDouble();
        System.out.println("enter the height of the triangle:");
        double h=sc.nextDouble();
        sc.close();
        double area=0.5*b*h;
        System.out.println("Area of triangle is:" +area);
    }
}
