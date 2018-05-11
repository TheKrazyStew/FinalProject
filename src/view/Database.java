package view;

import java.awt.Color;

public interface Database {

	//All the different tiles

	public static Tile
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

	public static  Tile[] grassGenList =  {grass,grass,grass,grass,hills,hills,hills,valley,woods,woods,forest,forest,forest,forest,marsh};
	public static  Tile[] sandGenList = {sand,sand,sand,sand,dunes,dunes,quicksand,sValley};

	//The generate-able worlds

	public static  World
	grassLand = new World("Grassland", 20, grassGenList),
	sandLand = new World("Desert", 50, sandGenList);

	//The generated Mechs and the "garage" (Mech[]) they live in

	public static Mech
	pMech1 = new Mech("SC-WD",35,12,4,6,10,false,0,0,Color.BLUE),
	pMech2 = new Mech("SC-LV",30,9,2,5,12,false,0,1,Color.BLUE),
	pMech3 = new Mech("SC-AT",15,10,3,10,10,false,1,1,Color.BLUE),
	pMech4 = new Mech("SC-UF",20,8,3,12,20,true,1,0,Color.BLUE),

	eMech1 = new Mech("SC-LT",35,12,4,6,10,false,18,18,Color.RED),
	eMech2 = new Mech("SC-HV",30,9,2,5,12,false,19,18,Color.RED),
	eMech3 = new Mech("SC-AT",15,10,3,10,10,false,19,19,Color.RED),
	eMech4 = new Mech("SC-FO",20,8,3,12,20,true,18,19,Color.RED);

	public static Mech[] Battlers =
		{pMech1, pMech2, pMech3, pMech4, eMech1, eMech2, eMech3, eMech4}; 

	//public static boolean anySelected = false;
	//public static boolean currentTurnBlue = true;

	//From MapGUI

	public static final int NUM_ROWS = 50, NUM_COLS = 50,PREFERRED_GRID_SIZE_PIXELS = 10;

	//From MapVisualizer

	public static final int gridPixelSize = 16;

}
