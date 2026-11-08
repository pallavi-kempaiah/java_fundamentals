package Selection;
/*You have x number of $5 notes and y number of $1 notes. You want to purchase an item for amount z. The shopkeeper wants you to provide exact change. You want to pay using a minimum number of notes. How many $5 notes and $1 notes will you use?

Implement a program to find out how many $5 notes and $1 notes will be used. If an exact change is not possible, then display -1.*/
import java.util.Scanner;
public class prgrm5 {
public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);

     int x = sc.nextInt();  // Number of $5 notes
     int y = sc.nextInt();  // Number of $1 notes
     int z = sc.nextInt();  // Amount to pay

     int five = Math.min(x, z / 5);

     int one = z - (five * 5);

     if(one <= y) {
         System.out.println(five);
         System.out.println(one);
     }
     else {
         System.out.println(-1);
     }

     sc.close();
}
}
