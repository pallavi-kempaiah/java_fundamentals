package day1.assignment4;
//Reverse A String In Java

import java.util.Scanner;
public class ass416 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String ch=sc.next();
        String orig=ch;
        String rev=" ";
        for(int i=ch.length()-1;i>=0;i--){
            rev+=ch.charAt(i);
        }
        System.out.println("reverse of String " + orig + " is :" +rev);
    }
}
