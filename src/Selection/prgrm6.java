package Selection;
/*Implement a program to generate and display the next date of a given date.

The date will be provided as day, month and year as shown in the below table.

The output should be displayed in the format: day-month-year.

Assumption: The input will always be a valid date.

 */
import java.util.Scanner;
public class prgrm6 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the date:");
	int date=sc.nextInt();
	System.out.println("enter the month:");
	int month=sc.nextInt();
	System.out.println("enter the year:");
	int year=sc.nextInt();
	if(year<100) {
		year=2000+year;
	}
	int maxdays;
	if(month==1 || month==3 || month==5 || month == 7 || month ==8 ||month ==10||month==12) {
		maxdays=31;
	}else if(month==4||month==6||month==9||month==11) {
		maxdays=30;
	}else {
		if(year%400==0 || year%4==0&&year%100!=0) {
			maxdays=29;
		}else {
			maxdays=28;
		}
	}
	if(date<maxdays) {
		date++;
	}else {
		date=1;
		month++;
	}
	if(month>12) {
		month =1;
		year++;
	}
	System.out.println(date+ "-" +month+ "-" +year);
	sc.close();
}
}
