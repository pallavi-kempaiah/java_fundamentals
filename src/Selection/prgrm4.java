package Selection;
/*Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:

first km=$0..next 3km = $1 remaining kms=$2
Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer: 

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.*/
import java.util.Scanner;
public class prgrm4 {
    public static void main(String args[]) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("enter the type of food veg or non-veg(V for veg and N for non-veg):");
    	char food_type=sc.next().charAt(0);
    	System.out.println("enter the distance:");
    	double dist=sc.nextDouble();
    	System.out.println("enter the quantity it should be minimum one:");
    	int quant=sc.nextInt();
    	if((food_type!='V'&&food_type!= 'N')|| dist <=0 || quant<1 ) {
    		System.out.println(-1);
    	}else {
    		double dist_cost;
    		if(dist<=1) {
    			dist_cost=0;
    		}else if(dist<=4) {
    			dist_cost=dist-1;
    		}else {
    			dist_cost=3+(dist-4)*2;
    		}
    		double cost;
    		if(food_type=='V') {
    			cost=(12*quant)+dist_cost;
    		}else {
    			cost=(15*quant)+dist_cost;
    		}
    		System.out.println("total cost is:"+cost);
    	}
    	sc.close();
    }
}
