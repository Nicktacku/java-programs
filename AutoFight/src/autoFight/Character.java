package autoFight;

abstract public class Character {
	private int hp;
	private int dmg;
	private double def;
	
	Character(int hp, int dmg, double def){
		this.hp = hp;
		this.dmg = dmg;
		this.def = def;
	}
	
	public int attack(int ehp) {
		return ehp - this.dmg;
	}
	
	public int attack(int ehp, double edef) {
		return ehp - (int)Math.floor(this.dmg * edef);
	}
	
	// ayusin 
	public boolean block() {
		return true;
	}
	
	public void special() {
		System.out.println("Error");
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getDmg() {
		return this.dmg;
	}
	
	public double getDef() {
		return this.def;	 
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	
	public void setDef(double def) {
		this.def = def;
	}
}
