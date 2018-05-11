package view;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Mech implements Database{

	private String name;
	private int hp, atk, def, shield, move, xPos, yPos, evade, atkRange, maxHp,
	xRange, yRange;
	private boolean isFlying, selected, canMove, canAttack;
	private Color team;
	private PanelChangeListener listener;

	public Mech(String name, int hp, int atk, int def, int move, int evade,
			boolean isFlying, int xPos, int yPos, Color team){

		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.atk = atk;
		this.def = def;
		this.move = move;
		this.isFlying = isFlying;
		this.evade = evade;
		this.xPos = xPos;
		this.yPos = yPos;
		xRange = xPos + gridPixelSize;
		yRange = yPos + gridPixelSize;
		this.team = team;
		selected = false;
		canMove = true;
		canAttack = true;

	}

	//The stats & stat editors

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
		xRange = xPos + gridPixelSize;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
		yRange = yPos + gridPixelSize;
	}

	public int getEvade() {
		return evade;
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
		+ "HP: " + hp + " / " + maxHp + "\n"
		+ "ATTACK: " + atk + "\n"
		+ "ARMOR: " + def + "\n"
		+ "SHIELD: " + shield + "\n"
		+ "MOVEMENT: " + move + "\n"
		+ "RANGE: " + atkRange;

	}

	public Color getTeam(){

		return team;

	}

	//The options a mech has

	public void giveDamage(Mech o){

		int dmg = 0;

		if(this.getAtk() - o.getDef() > dmg){

			dmg = this.getAtk() - o.getDef();

		}

		if(Math.random() * 100 < o.getEvade()) {

			dmg = 0;

		}

		o.takeDamage(dmg);

	}

	public void takeDamage(int damage){

		hp -= damage;

		if(hp < 0) {

			hp = 0;

		} if(damage > 10){

			System.out.println("NOW THAT'S A LOTTA DAMAGE!");

		}

		die();

	}

	public void attack(Mech o){

		if(canAttack && hp > 0){

			this.giveDamage(o);
			canAttack = false;

		}

	}

	public void move(int newX, int newY){

		if(canMove && Math.abs(newX - xPos) <= move &&
				Math.abs(newY - yPos) <= move && hp > 0) {
			int tempX = xPos; //For debugging
			int tempY = yPos; //For debugging
			setxPos(newX);
			setyPos(newY);
			canMove = false;
			//Debug: See if the thingy has moved
			/* if(tempX != xPos && tempY != yPos){
				
				System.out.println("Moved.");
				
			} else {
				
				System.out.println("Could not move.");
				System.out.println(xPos + "," + yPos);
				
			} */
		}

	}

	public void select(){

		selected = true;

	}

	public void deselect(){

		selected = false;

	}

	public boolean isSelected(){

		return selected;

	}

	public void startTurn(){

		canMove = true;
		canAttack = true;

	}

	//The Mech's Hitbox
	public Shape findMe(){

		int[] out = {xPos,yPos,xRange,yRange};
		return new Rectangle2D.Double(xPos, yPos, gridPixelSize, gridPixelSize);

	}

	public void die(){

		if(hp <= 0) {

			team = Color.DARK_GRAY;

		}

	}

	public void showResults(){

		listener.changePanel("ShowResults");

	}

}