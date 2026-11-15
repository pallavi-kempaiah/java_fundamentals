package Selection;
//Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.


import java.util.Scanner;
public class prgrm1 {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the first number:");
	  int n1=sc.nextInt();
	  System.out.println("enter the second number:");
	  int n2=sc.nextInt();
	  if(n1==n2) {
		  System.out.println(n1+n2);
	  }else {
		  System.out.println(2*(n1+n2));
	  }
	  sc.close();
  }
}
