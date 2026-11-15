package day1.assignment4;
//Java Program Vowel Or Consonant

import java.util.Scanner;
public class ass420 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character:");
        char ch=sc.next().charAt(0);
        if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("entered character is vowel!");
        }else{
            System.out.println("entered character is consonant!");
        }
        sc.close();
    }
}
