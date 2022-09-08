package autoFight;

public class Paladin extends Character{
	
	Paladin(int hp, int dmg, double def){
		super(hp, dmg, def);
	}
	
	public void special(int ctr) {
		if(ctr < 4) setDef(getDef() - .10);
	}
}
