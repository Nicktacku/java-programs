package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revInt(1234);

	}
	
	public static void revInt(int num) {
		int reversed = 0;
		int remainder;
		while(num != 0) {
			remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num /= 10;
		}
		
		System.out.println(reversed);
	}
}
