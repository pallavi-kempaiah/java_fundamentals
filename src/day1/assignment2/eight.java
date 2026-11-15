package day1.assignment2;



import java.util.Scanner;
public class eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=in.nextInt();
        System.out.println("enter the second number:");
        int num2=in.nextInt();
        int original1=num1;
        int original2=num2;
        int rev1=0;
        int rev2=0;
        while(num1>0){
            int digit=num1%10;
            rev1+=digit*digit*digit;
            num1=num1/10;
        }
        while(num2>0){
            int digit=num2%10;
            rev2+=digit*digit*digit;
            num2=num2/10;
        }
        if(original1==rev1 && original2==rev2){
            System.out.println("both are armstrong");
        }else if(original1==rev1){
            System.out.println(original1+ "is armstrong");
        }
        else if(original2==rev2){
            System.out.println(original2+ "is armstorng");
        }
        else{
            System.out.println("neithr one is armstrong");
        }
    }
}
