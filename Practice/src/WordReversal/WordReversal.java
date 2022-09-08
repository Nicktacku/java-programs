package WordReversal;

import java.util.Scanner;

public class WordReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter sentence: ");
		String sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");
		String[] reverse = new String[words.length];
		
		for(int i = words.length - 1, j = 0; i >= 0; i--, j++) {
			reverse[j] = words[i];
		}
		
		for(String word: reverse) {
			System.out.print(word + " ");
		}
		
	}

}
