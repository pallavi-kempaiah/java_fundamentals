package day1.assignment3;

import java.util.Scanner;
public class ass33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the rectangel:");
        double l=sc.nextDouble();
        System.out.println("enter the widht the rectangle:");
        double w=sc.nextDouble();
        sc.close();
        double area=l*w;
        System.out.println("area of rectangle is :" +area);
    }
}
