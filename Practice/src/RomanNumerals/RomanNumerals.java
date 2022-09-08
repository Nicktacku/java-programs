package RomanNumerals;

import java.util.ArrayList;
import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Roman Numeral: ");
		char[] romanNumerals = sc.nextLine().toLowerCase().toCharArray();
		int[] equivalents = new int[romanNumerals.length];
		
		for(int i = 0; i < romanNumerals.length; i++) {
			switch(romanNumerals[i]) {
				case 'i': 
					equivalents[i] = 1;
					break;
				case 'v':
					equivalents[i] = 5;
					break;
				case 'x':
					equivalents[i] = 10;
					break;
				case 'l':
					equivalents[i] = 50;
					break;
				case 'c':
					equivalents[i] = 100;
					break;
				case 'd':
					equivalents[i] = 500;
					break;
				case 'm':
					equivalents[i] = 1000;
					break;
			}
		}

		int decimal = 0;
		
		if(equivalents.length != 1) {
			for(int i = 0, j = i + 1; j < equivalents.length; i++, j++) {
				
				if(equivalents[i] < equivalents[j]) {
					equivalents[j] = equivalents[j] - equivalents[i];
					equivalents[i] = 0;
				} 
				
			}
				
			for(int equivalent: equivalents) {
				decimal += equivalent;
			}
		
		} else {
			decimal = equivalents[0];
		}
		
		System.out.println("decimal value: " + decimal);
		
	}
}