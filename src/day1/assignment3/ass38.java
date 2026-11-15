package day1.assignment3;
/*Input a number and print all the factors of that number */
import java.util.Scanner;
public class ass38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find its factor:");
        int num=sc.nextInt();
        String numm="";
        for(int i=1;i<=num ;i++){
            if(num%i==0){
               if(numm.isEmpty()){
                   numm+=i;
               }else{
                   numm+=","+i;
               }
            }
        }
        System.out.println("factor of " +num+ "is:" +numm);
    }
}
