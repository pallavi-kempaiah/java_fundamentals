package Selection;
/*The Metro Bank provides various types of loans such as car loans, business loans and house loans to its account holders, i.e., customers.

Implement a program to determine the eligible loan amount and the EMI that the bank can provide to its customers based on their salary and the loan type they expect to avail.

The values required for determining the eligible loan amount and the EMI are:

account number of the customer

account balance of the customer

salary of the customer

loan type 

expected loan amount

expected no. of EMIs

The following validations should be performed:

The account number should be of 4 digits and its first digit should be 1

The customer should have a minimum balance of $1000 in the account

Display appropriate error messages if the validations fail.

If the validations pass, determine whether the bank would provide the loan or not. 

The bank would provide the loan, only if the loan amount and the number of EMIs expected by the customer is less than or equal to the loan amount and the number of EMIs decided by the bank respectively. The bank decides the eligible loan amount and the number of EMIs based on the below table.
salary  type      eligible  emi
>25000 car         500000  36
>50000 house       6000000 60
>75000 buissness   7500000 84


Display the account number, eligible and requested loan amount and the number of EMIs if the bank provides the loan.

Display an appropriate message if the bank does not provide the loan.

 

Sample Input and Output
account number:10001          | eligible loan amount=500000
salary:40000                  |eligible emis = 36
account balance:250000
loan type:car
loan amount expected:300000
emis expected 30
*/
import java.util.Scanner;
public class prgem5 {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the account number(starts with 1):");
	String account_number=sc.next();
	while(!account_number.matches("1[0-9]{3}")) {
		System.out.println("enter a valid account number!");
		System.out.println("enter the account number(starts with 1):");
		account_number=sc.next();
	}
	System.out.println("enter the account balance:");
	int balance=sc.nextInt();
	while(balance < 1000) {
	    System.out.println("Insufficient balance! Enter balance again:");
	    balance = sc.nextInt();
	}
	System.out.println("enter the salary:");
	int salary=sc.nextInt();
	System.out.println("enter the loan type:");
	String loan_type=sc.next();
	System.out.println("enter the expected loan amount:");
	int loanamount=sc.nextInt();
	System.out.println("enter the expected no.of emis:");
	int emis=sc.nextInt();
	int eligibleLoanAmount=0;
	int emii=0;
	if(salary > 25000 && loan_type.equals("car")) {
	    eligibleLoanAmount = 500000;
	    emii = 36;
	}
	else if(salary > 50000 && loan_type.equals("house")) {
	    eligibleLoanAmount = 6000000;
	    emii = 60;
	}
	else if(salary > 75000 && loan_type.equals("business")) {
	    eligibleLoanAmount = 7500000;
	    emii = 84;
	}else {
	    System.out.println("Eligibility criteria not satisfied!");
	    return;
	}

	if(loanamount <= eligibleLoanAmount && emis <= emii) {
	    System.out.println("eligibleLoanAmount=" + eligibleLoanAmount);
	    System.out.println("eligibleEmis=" + emii);
	}
	else {
	    System.out.println("Loan eligibility conditions not satisfied!");
	}
	sc.close();
}
}
