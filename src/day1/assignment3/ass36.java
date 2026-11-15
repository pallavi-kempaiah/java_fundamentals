package day1.assignment3;
/*area of rhombus*/
import java.util.Scanner;
public class ass36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght of the first diagnol:");
        double d1=sc.nextDouble();
        System.out.println("enter the length of the second diagonal:");
        double d2=sc.nextDouble();
        sc.close();
        double area=0.5*d1*d2;
        System.out.println("area of rhombus:"+area);
    }
}
