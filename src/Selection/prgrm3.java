package Selection;
/*Problem Statement
Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7.*/
import java.util.Scanner;
public class prgrm3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int n1=sc.nextInt();
		System.out.println("enter the second number:");
		int n2=sc.nextInt();
		System.out.println("enter the third number:");
		int n3=sc.nextInt();
		if(n3==7) {
			int result=-1;
			System.out.println(result);
		}else if(n1==7) {
			System.out.println(n2*n3);
		}else if(n2==7) {
			System.out.println(n3);
		}else {
			System.out.println(n1*n2*n3);
		}
		sc.close();
	}

}
