package BlackJack;


import java.util.Random;
import java.util.Scanner;

public class JackBlack {
	public static void main(String[] args) {
		String[] suits = {" of club", " of spade", " of heart", " of diamond"};
		String[] replacements = {"10", "J", "Q", "K"};
		Random rand = new Random();
		
		// player
		int pFHand = rand.nextInt(10) + 1;
		int pSHand = rand.nextInt(10) + 1;
		int pHandValue = pFHand + pSHand;
		String pHand1;
		String pHand2;
		
		if(pFHand == 10) {
			pHand1 = replacements[rand.nextInt(4)];
		} else {
			pHand1 = String.valueOf(pFHand);
		}
		
		if(pSHand == 10) {
			pHand2 = replacements[rand.nextInt(4)];
		} else {
			pHand2 = String.valueOf(pSHand);
		}
		
		System.out.println("Your cards are " + pHand1 + suits[rand.nextInt(4)] + " and " + pHand2 + suits[rand.nextInt(4)]);
		System.out.println("Total value is: " + pHandValue);
		
		//banker
		int oFHand = rand.nextInt(10) + 1;
		int oSHand = rand.nextInt(10) + 1;
		int oHandValue = oFHand + oSHand;
		String oHand1;
		String oHand2;
		
		if(oFHand == 10) {
			oHand1 = replacements[rand.nextInt(4)];
		} else {
			oHand1 = String.valueOf(oFHand);
		}
		
		if(oSHand == 10) {
			oHand2 = replacements[rand.nextInt(4)];
		} else {
			oHand2 = String.valueOf(oSHand);
		}
		
		System.out.println("\nEnemy cards are " + oHand1 + suits[rand.nextInt(4)] + " and " + oHand2 + suits[rand.nextInt(4)]);
		System.out.println("Total value is: " + oHandValue);
		
		//game
		Scanner sc = new Scanner(System.in);
		String pChoice = "";
		boolean pPass = false;
		boolean oPass = false;
		
		// player third card
		while(!pChoice.equals("hit") && !pChoice.equals("stay")) {
			System.out.print("\nDo you want to hit or stay? ");
			pChoice = sc.next().toLowerCase();
		}
		
		if(pChoice.equals("hit")) {
			int pTHand = rand.nextInt(10) + 1;
			pHandValue += pTHand;
			String pHand3;
			
			if(pFHand == 10) {
				pHand3 = replacements[rand.nextInt(4)];
			} else {
				pHand3 = String.valueOf(pTHand);
			}
			
			System.out.println("\nYour new card is " + pHand3 + suits[rand.nextInt(4)]);
			System.out.println("Total value is: " + pHandValue);
		} else {
			pPass = true;
		}
		
		if(pHandValue > 21) {
			pHandValue = 0;
			pPass = true;
			oPass = true;
		}
		
		// opponent third draw
		if(oHandValue <=15) {
			int oTHand = rand.nextInt(10) + 1;
			oHandValue += oTHand;
			String oHand3;
			
			if(oFHand == 10) {
				oHand3 = replacements[rand.nextInt(4)];
			} else {
				oHand3 = String.valueOf(oTHand);
			}
			
			System.out.println("\nOpponent new card is " + oHand3 + suits[rand.nextInt(4)]);
			System.out.println("Total value is: " + oHandValue);
		} else {
			oPass = true;
			System.out.println("\nOpponent passed");
		}
		
		if(oHandValue > 21) {
			oHandValue = 0;
			oPass = true;
			pPass = true;
		}
		
		// player last card
		pChoice = "";
		
		if(!pPass) {
			while(!pChoice.equals("hit") && !pChoice.equals("stay")) {
				System.out.print("\nDo you want to hit or stay? ");
				pChoice = sc.next().toLowerCase();
			}
			
			if(pChoice.equals("hit")) {
				int pLHand = rand.nextInt(10) + 1;
				pHandValue += pLHand;
				String pHand4;
				
				if(pLHand == 10) {
					pHand4 = replacements[rand.nextInt(4)];
				} else {
					pHand4 = String.valueOf(pLHand);
				}
				
				System.out.println("\nYour new card is " + pHand4 + suits[rand.nextInt(4)]);
				System.out.println("Total value is: " + pHandValue);
			}
		}
		
		if(pHandValue > 21) {
			pHandValue = 0;
			oPass = true;
		}
		
		// opponent last hand
		if(oHandValue <=15 && !oPass) {
			int oTHand = rand.nextInt(10) + 1;
			oHandValue += oTHand;
			String oHand3;
			
			if(oFHand == 10) {
				oHand3 = replacements[rand.nextInt(4)];
			} else {
				oHand3 = String.valueOf(oTHand);
			}
			
			System.out.println("\nOpponent new card is " + oHand3 + suits[rand.nextInt(4)]);
			System.out.println("Total value is: " + oHandValue);
		} else if (!oPass) {
			System.out.println("Opponent passed");
		}
		
		if(pHandValue > oHandValue) {
			System.out.println("\n\nYou win!");
		} else if (pHandValue == oHandValue) {
			System.out.println("It's a tie");
		} else {
			System.out.println("\n\nYou Lose!");
		}
	}
}
