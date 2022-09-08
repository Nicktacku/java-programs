package SrudentDatabaseApp;

import java.util.Scanner;
public class Student {
	private int studentNum;
	private int studentYear;
	private String studentName;
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students? ");
		studentNum = sc.nextInt();
	}
}
