package view;
import java.awt.Color;

public class Tile {

	private int defMod, accMod, evdMod;
	private String name;

	private Color color;

	public Tile(String name, Color color){
		defMod = 0;
		accMod = 0;
		evdMod = 0;
		this.color = color;
		this.name = name;
	}
	public Tile(String name, int defMod, int accMod, int evdMod,Color color){
		this.defMod = defMod;
		this.accMod = accMod;
		this.evdMod = evdMod;

		this.color = color;
		this.name=name;
	}
	public Color getColor() {
		return color;
	}
	public String toString(){
		
		return "Tile - " + name;
		
	}
}
