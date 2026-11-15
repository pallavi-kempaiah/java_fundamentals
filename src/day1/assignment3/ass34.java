package day1.assignment3;
/*area of isosceles triangle*/
import java.util.Scanner;
public class ass34 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the base of the triangle:");
        double b=sc.nextDouble();
        System.out.println("enter the height of the trianlge:");
        double h=sc.nextDouble();
        sc.close();
        double are=0.5*b*h;
        System.out.println("area of an isosceles triangle is:" +are);
    }
}
