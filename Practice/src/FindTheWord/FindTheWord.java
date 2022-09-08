package FindTheWord;

import java.util.Scanner;

public class FindTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the sentence: ");
		String sentence = sc.nextLine();
		
		int place = -1;
		
		String[] words = sentence.split(" ");
		
		while(place < 0 || place > words.length) {
			System.out.print("Enter the place of the word to be retrieved: ");
			place = sc.nextInt();
		}
		
		System.out.println("Relieved word: " + words[place]);
	}

}
