package Selection;
/*Problem Statement
Implement a program that displays a message for a given number based on the below conditions.

If the number is a multiple of 3, display "Zip".

If the number is a multiple of 5, display "Zap".

If the number is a multiple of both 3 and 5, display "Zoom",

For all other cases, display "Invalid".*/
import java.util.Scanner;
public class prgrm7 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=sc.nextInt();
	if(num%3==0 && num % 5==0) {
		System.out.println("Zoom");
	}else if(num%3==0) {
		System.out.println("zip");
	}else if(num % 5 ==0) {
		System.out.println("zap");
	}else {
		System.out.println("Invalid");
	}
	sc.close();
}
}
