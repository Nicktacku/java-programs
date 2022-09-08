package WordSearch;

import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter sentence: ");
		String sentence = sc.nextLine();
		
		System.out.print("Enter word to count: ");
		String find = sc.next();
		
		String[] words = sentence.split(" ");
		
		int ctr = 0;
		
		for(String word: words) {
			if(word.length() >= find.length()) {
				 if(find.toLowerCase().equals(word.substring(0, find.length()).toLowerCase())) {
					 ctr++;
				 }
			}
		}
		
		System.out.println("\nWords found: " + ctr);
		
		

	}

}
