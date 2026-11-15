package day1.assignment3;
/*area of parallelogram*/
import java.util.Scanner;
public class ass35 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter base ;");
        double b=sc.nextDouble();
        System.out.println("enter the height:");
        double h=sc.nextDouble();
        sc.close();
        double area=b*h;
        System.out.println("area of parallelogram:" +area);
    }
}
