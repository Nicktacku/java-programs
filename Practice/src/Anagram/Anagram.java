package Anagram;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first word: ");
		String word1 = sc.next().toLowerCase();
		
		System.out.print("Enter second word: ");
		String word2 = sc.next().toLowerCase();
		
		boolean anagram = true;
		
		if(word1.length() != word2.length()) {
			anagram = false;
		} else {
			char[] letters1 = word1.toCharArray();
			char[] letters2 = word2.toCharArray();
			
			Arrays.sort(letters1);
			Arrays.sort(letters2);
			
			for(int i = 0; i < letters1.length; i++) {
				if(letters1[i] != letters2[i]) {
					anagram = false;
				}
			}
		}
		
		if(anagram) {
			System.out.println("\nThey are an anagram");
		} else {
			System.out.println("\nThey are not an anagram");
		}
		
		
	}
}
