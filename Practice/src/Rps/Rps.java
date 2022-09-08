package Rps;

import java.util.Random;
import java.util.Scanner;

public class Rps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		String[] opponent = new String[3];
		opponent[0] = "Rock";
		opponent[1] = "Paper";
		opponent[2] = "Scissor";
		
		// Player
		System.out.print("Enter move (Rock, paper, scissor): ");
		String pChoice = sc.next().toLowerCase();
		
		// opponent
		int oChoice = rand.nextInt(3) + 1;
		System.out.println("Opponent plays " + opponent[oChoice - 1]);
		
		if((pChoice.equals("rock") && oChoice == 3) || (pChoice.equals("paper") && oChoice == 1) || (pChoice.equals("scissor") && oChoice == 2)){
			
			System.out.println("You Win!");
		} else if ((pChoice.equals("rock") && oChoice == 2) || (pChoice.equals("paper") && oChoice == 3) || (pChoice.equals("scissor") && oChoice == 1)) {
			System.out.println("You Lose!");
		} else {
			
			System.out.println("It's a tie!");
		}

	}

}
