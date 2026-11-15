package day1.assignment4;
//Calculate Distance Between Two Points

import java.util.Scanner;
public class ass45 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of x1 and y1 of point 1:");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.println("enter the value of x2 and y2 of point 2:");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();

        double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        System.out.println("the distance between two points is :" +distance);
        sc.close();
    }
}
