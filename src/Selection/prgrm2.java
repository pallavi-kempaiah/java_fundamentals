package Selection;
/*Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.

Find the discriminant value using the formula given below.

discriminant = b2 - 4ac

If the discriminant is 0, the values of both the roots will be same. Display the value of the root.

If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.

If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"

Use the formula given below to find the roots of a quadratic equation.

x = (-b ± discriminant)/2a*/
import java.util.Scanner;
public class prgrm2 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number a:");
	double a=sc.nextDouble();
	System.out.println("enter the number b:");
	double b=sc.nextDouble();
	System.out.println("enter the number c:");
	double c=sc.nextDouble();
	double d=(b*b) - 4*a*c;
	if(d==0) {
		double root=(-b)/(2*a);
		System.out.println("Root:"+root);
	}else if(d>0) {
		double root1=(-b +Math.sqrt(d))/(2*a);
		double root2=(-b - Math.sqrt(d))/(2*a);
		System.out.println("Root1:"+root1);
		System.out.println("Root2:"+root2);
	}else {
		System.out.println("the equation has no real roots");
	}
	sc.close();
}
}
