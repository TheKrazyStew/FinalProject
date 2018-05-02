package view;

import java.awt.Color;

public interface Tilesets {
	
	public static final Tile
			grass = new Tile("grassland", new Color(41, 163, 41)), 
			hills = new Tile("hills", new Color(31, 122, 31)),
			woods = new Tile("woods", new Color(0, 153, 51)),
			forest = new Tile("forest", new Color(0, 102, 34)),
			valley = new Tile("valley", new Color(120, 120, 60)),
			marsh = new Tile("marsh", new Color(119, 179, 0)),
			sand = new Tile("desert", new Color(255, 255, 204)), //Grass
			dunes = new Tile("dunes", new Color(224, 163, 61)), //Hills
			quicksand = new Tile("quicksand", new Color(224, 224, 160)), //Marsh
			sValley = new Tile("valley", new Color(120, 120, 60)), //Valley
			water = new Tile("river", new Color(51, 51, 204)),
			road = new Tile("road", new Color(49, 52, 56)),
			bridge = new Tile("bridge", new Color(98, 104, 102)),
			city = new Tile("city", new Color(80, 80, 80));
	public static final Tile[] grassGenList =  {grass,grass,grass,grass,hills,hills,hills,valley,woods,woods,forest,forest,forest,forest,marsh};
	public static final Tile[] sandGenList = {sand,sand,sand,sand,dunes,dunes,quicksand,sValley};
	
}
