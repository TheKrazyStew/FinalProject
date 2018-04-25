package view;

public class Mech {

	private String name, typeName;
	private int hp, atk, def, shield, move, xPos, yPos, type, evade, atkRange;
	private boolean isFlying;

	/* ************* *
	 * Mech Type IDs *
	 * 0 = Light     *
	 * 1 = Heavy     *
	 * 2 = Artillery *
	 * ************* */

	public Mech(String name, int type, int hp, int atk, int def, int shield,
			int move, int evade, boolean isFlying){

		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.shield = shield;
		this.move = move;
		this.isFlying = isFlying;
		this.evade = evade;
		xPos = 0;
		yPos = 0;

		switch(type){

		case(0):
			typeName = "LIGHT";
		break;
		case(1):
			typeName = "HEAVY";
		break;
		case(2):
			typeName = "ARTILLERY";
		break;
		default:
			break;

		}

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

	public String getTypeName() {
		return typeName;
	}

	public int getType() {
		return type;
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

			fly = "TRUE";

		} else {

			fly = "FALSE";

		}

		return "UNIT STATS:\n"
		+ "NAME: " + name + "\n"
		+ "TYPE:" + typeName + "\n"
		+ "FLYING: " + fly + "\n"
		+ "HP: " + hp + "\n"
		+ "ATTACK: " + atk + "\n"
		+ "ARMOR: " + def + "\n"
		+ "SHIELD: " + shield + "\n"
		+ "MOVEMENT: " + move + "\n"
		+ "RANGE: " + atkRange;

	}

	public int takeDamageDef(Mech o){

		int dmg = 0;

		if(o.getAtk() - this.getDef() > dmg){

			dmg = o.getAtk() - this.getDef();

		}

		return dmg;

	}

	public int takeDamageShield(Mech o){

		int dmg = 0;

		if(o.getAtk() - this.getDef() > dmg){

			dmg = o.getAtk() - this.getDef();

		}

		return dmg;

	}

}