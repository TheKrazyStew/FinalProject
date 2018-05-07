package view;

import java.awt.Color;

public class Mech {

	private String name;
	private int hp, atk, def, shield, move, xPos, yPos, evade, atkRange;
	private boolean isFlying;
	private Color team;

	public Mech(String name, int hp, int atk, int def, int move, int evade,
			boolean isFlying, int xPos, int yPos, Color team){

		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.move = move;
		this.isFlying = isFlying;
		this.evade = evade;
		this.xPos = xPos;
		this.yPos = yPos;
		this.team = team;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getEvade() {
		return evade;
	}

	public void setEvade(int evade) {
		this.evade = evade;
	}

	public int getAtkRange() {
		return atkRange;
	}

	public void setAtkRange(int atkRange) {
		this.atkRange = atkRange;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}

	public String toString(){

		String fly;
		if(isFlying) {

			fly = "YES";

		} else {

			fly = "NO";

		}

		return "UNIT STATS:\n"
		+ "NAME: " + name + "\n"
		+ "FLYING: " + fly + "\n"
		+ "HP: " + hp + "\n"
		+ "ATTACK: " + atk + "\n"
		+ "ARMOR: " + def + "\n"
		+ "SHIELD: " + shield + "\n"
		+ "MOVEMENT: " + move + "\n"
		+ "RANGE: " + atkRange;

	}

	public int giveDamage(Mech o){

		int dmg = 0;

		if(this.getAtk() - o.getDef() > dmg){

			dmg = this.getAtk() - o.getDef();

		}

		return dmg;

	}
	
	public void move(int newX, int newY){
		
		xPos = newX;
		yPos = newY;
		
	}
	
}