package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity;
	private int defaultPasswordLenght = 10;
	private String alternateEmail;
	private String companySuffix = "nycompony.com";
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email: " + this.firstName + " " + this.lastName);
		
		this.department = setDepartment();
		
		this.password = randomPassword(defaultPasswordLenght);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix; 
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("Department Code\n1 for sales\n2 for development\n3 for accounting\n0 for none\n\nEnter department code: ");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		switch(depChoice) {
			case 1: return "sales";
			case 2: return "dev";
			case 3: return "acct";
			default: return "";
		}
	}
	
	// Generate a random password
	
	private String randomPassword(int lenght) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+~`{[}]|\\:;\"'<,>.?/";
		char[] password = new char[lenght];
		
		for(int i = 0; i < lenght; i++) {
			int rand = (int) Math.random() * passwordSet.length();
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	// Set the alternative email
	
	public void setAlternativeEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change pass
	public void changePassword(String password) {
		this.password = password;
	}
}
