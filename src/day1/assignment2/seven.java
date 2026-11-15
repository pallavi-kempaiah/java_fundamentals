package day1.assignment2;

import java.util.Scanner;
public class seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string:");
        String str=in.nextLine();
        String original=str;
        String neww="";
        for(int i=str.length()-1;i>=0;i--){
            neww+=str.charAt(i);
        }
        if(original.equals(neww)){
            System.out.println("string is a palindrome");
        }else{
            System.out.println("string is not a palindrome");
        }

    }
}
