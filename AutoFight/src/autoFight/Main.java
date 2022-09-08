package autoFight;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Character ben = new Warrior(100, 10, 0.90);
		Character ella = new Paladin(150, 5, 0.50);
		
		Random rand = new Random();
		int choice;
		boolean bIsBlock = false;
		boolean eIsBlock = false;
		int ctr = 0;
		
		while(ben.getHp() > 0 && ella.getHp() > 0) {
			choice = rand.nextInt(3) + 1;
			
			System.out.println("\n\nBen hp: " + ben.getHp());
			System.out.println("\nElla hp: " + ella.getHp());
			
			//Ben choice
			if(choice == 1) {
				if(eIsBlock) {
					ella.setHp(ben.attack(ella.getHp(), ella.getDef()));
					eIsBlock = false;
					System.out.println("\nBen attacked a shielded ella for " + Math.floor(ben.getDmg() * ella.getDef()) + " Damage");
				} else {
					ella.setHp(ben.attack(ella.getHp()));
					System.out.println("\nBen attacked ella for " + ben.getDmg() + " Damage");
				}
			} else if(choice == 2) {
				bIsBlock = ben.block();
				System.out.println("\nBen blocked");
			} else if(choice == 3) {
				ben.special();
				System.out.println("Ben raised attack");
			}
			
			if(ctr < 4) {
				choice = rand.nextInt(3) + 1;
			} else {
				choice = rand.nextInt(2) + 1;
			}
			
			// ella
			if(choice == 1) {
				if(bIsBlock) {
					ben.setHp(ella.attack(ben.getHp(), ben.getDef()));
					bIsBlock = false;
					System.out.println("\nElla attacked a shielded ben for " + Math.floor(ella.getDmg() * ben.getDef()) + " Damage");
				} else {
					ben.setHp(ella.attack(ben.getHp()));
					System.out.println("\nElla attacked ben for " + ella.getDmg() + " Damage");
				}
			} else if(choice == 2) {
				eIsBlock = ella.block();
				System.out.println("\nElla blocked");
			} else if(choice == 3) {
				ella.special();
				System.out.println("raised shield");
				ctr++;
			}
			
		} // while
		
		if(ben.getHp() > ella.getHp()) {
			System.out.println("\n\nBen wins");
		} else {
			System.out.println("\n\nElla wins");
		}
		System.out.println("\nEnd of game");
		
	}
}
