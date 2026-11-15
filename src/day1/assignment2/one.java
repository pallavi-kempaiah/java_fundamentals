package day1.assignment2;


import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number");
        int num=in.nextInt();
        if(num % 2 ==0){
            System.out.println(+num+ " is an even number");
        }
        else{
            System.out.println(+num+ " is an odd number");
        }
    }
}
