package Selection;
import java.util.Scanner;
public class prgrm5b {
public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);

     int x = sc.nextInt();  // Number of $10 notes
     int y = sc.nextInt();  // Number of $2 notes
     int z = sc.nextInt();  // Amount to pay

     int ten = Math.min(x, z / 10);

     int remaining = z - (ten * 10);

     int two = remaining / 2;

     if(remaining % 2 == 0 && two <= y) {
         System.out.println(ten);
         System.out.println(two);
     }
     else {
         System.out.println(-1);
     }

     sc.close();
}
}
