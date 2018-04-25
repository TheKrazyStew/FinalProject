package view;

public class Mech {

	private String name, typeName;
	private int hp, atk, def, shield, move, speed, xPos, yPos, type, evade;
	private boolean isFlying;

	/* ************* *
	 * Mech Type IDs *
	 * 0 = Light     *
	 * 1 = Heavy     *
	 * 2 = Artillery *
	 * ************* */

	public Mech(String name, int type, int hp, int atk, int def, int shield,
			int move, int speed, int evade, boolean isFlying){

		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.shield = shield;
		this.move = move;
		this.speed = speed;
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
		+ "SPEED: " + speed;

	}

}
