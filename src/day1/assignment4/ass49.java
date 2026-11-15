package day1.assignment4;
//Calculate Batting Average

import java.util.Scanner;
public class ass49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of runs:");
        int totalRuns=sc.nextInt();
        System.out.println("enter the number of time outs:");
        int timeout=sc.nextInt();
        if(timeout==0){
            System.out.println("Batting average " + totalRuns + "(not out in all matches!");
        }else{
            double BattingAverage=totalRuns/timeout;
            System.out.println("batting average is:" +BattingAverage);
        }
    }
}
