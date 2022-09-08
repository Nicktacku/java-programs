package autoFight;

import java.util.Random;

public class Warrior extends Character{
	
	Random rand = new Random();
	
	Warrior(int hp, int dmg, double def){
		super(hp, dmg, def);
	}
	
	@Override
	public void special() {
		setDmg(getDmg() + 1);
	}
	
	
}
