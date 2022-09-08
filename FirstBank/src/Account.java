import java.util.Scanner;


public class Account {
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	Account(String cname, String cid){
		this.customerName = cname;
		this.customerID = cid;
	}
	
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance -= amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposit: " + previousTransaction);
		} else if(previousTransaction < 0) {
			System.out.println("Withdraw: " + Math.abs(balance));
		} else {
			System.out.println("No transaction occured");
		}
	}
	
	void calculateInterest(int years) {
		final double interestRate = 0.0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is: " + interestRate * 100);
		System.out.println("After " + years + " years, your balance will be: " + newBalance);
	}
	
	void showMenu() {
		char option = '\0';
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome " + customerName + "!");
		System.out.println("Your id is: " + customerID);
		System.out.println();
		System.out.println("What would you like me to do");
		System.out.println();
		System.out.println("a) check your balance");
		System.out.println("b) make a deposit");
		System.out.println("c) make a withdrawal");
		System.out.println("d) view previous transaction");
		System.out.println("e) calculate interest");
		System.out.println("f) close");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = input.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			case 'A':
				System.out.println("========================");
				System.out.println("Balance = $" + balance);
				System.out.println("========================");
				System.out.println();
				break;
				
			case 'B':
				System.out.println("Enter amount to deposit: ");
				int amount = input.nextInt();
				deposit(amount);
				System.out.println();
				break;
				
			case 'C':
				System.out.println("Enter amount to withdraw: ");
				int amount2 = input.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
				
			case 'D':
				System.out.println("========================");
				getPreviousTransaction();
				System.out.println("========================");
				System.out.println();
				break;
				
			case 'E':
				System.out.println("Enter how many years of accrued expense: ");
				int years = input.nextInt();
				calculateInterest(years);
				break;
				
			case 'F':
				System.out.println("========================");
				break;
				
			default:
				System.out.println("Error: Please enter a letter from a-f only.");
				
			}
				
		} while(option != 'F');
		
		System.out.println("Thank you for banking with us");
	}
}
