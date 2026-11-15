package day1.assignment3;
//Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;
public class ass39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("enter the number to sum them (enter 0 to stop):");
            int num=sc.nextInt();
            if(num==0){
                System.out.println("end of the program");
                break;
            }else{
                sum+=num;
            }
        }
        System.out.println("sum of number is:" +sum);

        sc.close();
    }
}
