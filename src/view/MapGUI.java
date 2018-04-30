package view;

import javax.swing.*;
import java.awt.*;
import java.math.*;

@SuppressWarnings("unused")
public class MapGUI extends JPanel implements Tilesets{


	public static final int NUM_ROWS = 50, NUM_COLS = 50,PREFERRED_GRID_SIZE_PIXELS = 10;
	public static final Tile[] 
			TERRAIN = {grassland,grassland,grassland,grassland,hills,hills,hills,valley,woods,woods,forest,forest,forest,forest,marsh},
			TERRAIN2 = {sand,sand,sand,sand,dunes,dunes,quicksand,sValley};

	public static final Tile[][] WORLDGENERATORS = {TERRAIN,TERRAIN2};

	private Tile[][] terrainGrid;

	public MapGUI(){
		
		this.terrainGrid = new Tile[NUM_ROWS][NUM_COLS];
		int r = (int)(Math.random()*(WORLDGENERATORS.length));
		Tile[] selected = WORLDGENERATORS[r];
		for (int i = 0; i < NUM_ROWS; i++) {

			for (int j = 0; j < NUM_COLS; j++) {
				int randomTerrainIndex = (int)(selected.length * Math.random());
				Tile randomTile = selected[randomTerrainIndex];
				this.terrainGrid[i][j] = randomTile; 
			}

		}
		
		this.terrainGrid = verticalRiverGenerator(terrainGrid);
		this.terrainGrid = verticalRoadGenerator(terrainGrid);
		this.terrainGrid = horizontalRoadGenerator(terrainGrid);
		this.terrainGrid = horizontalRiverGenerator(terrainGrid);

		int preferredWidth = NUM_COLS * PREFERRED_GRID_SIZE_PIXELS;
		int preferredHeight = NUM_ROWS * PREFERRED_GRID_SIZE_PIXELS;
		setPreferredSize(new Dimension(preferredWidth, preferredHeight));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.clearRect(0, 0, getWidth(), getHeight());

		int rectWidth = getWidth() / NUM_COLS;
		int rectHeight = getHeight() / NUM_ROWS;

		for (int i = 0; i < NUM_ROWS; i++) {
			for (int j = 0; j < NUM_COLS; j++) {
				int x = i * rectWidth;
				int y = j * rectHeight;
				Color terrainColor = terrainGrid[i][j].getColor();
				g.setColor(terrainColor);
				g.fillRect(x, y, rectWidth, rectHeight);
			}
		}
	}

	private static Tile[][] horizontalRiverGenerator(Tile[][] terrainGrid){

		int max = (int)(Math.random()*5) +3, min = (int)(Math.random()*-5)-3; 
		int n = 1, row = (int)(Math.random()*terrainGrid[0].length);

		boolean toggle=true;

		for(int i =0; i < terrainGrid.length; i++){


			if(row+n == row+max && toggle && row+n >= 0 && row+n < terrainGrid[i].length){
				toggle = false;
				row+=n;
				n=0;

			}else if(row+n == row+min && !toggle && row+n >= 0 && row+n < terrainGrid[i].length){
				toggle = true;
				row+=n;
				n=0;

			}else if(row + n <= row + max && toggle){
				n++;

			}else if(row + n >= row + min && !toggle){
				n--;
			}

			if( row+n > 0 && row+n < terrainGrid[i].length-1 ){
				if(terrainGrid[i][row+n].equals(road)){
					terrainGrid[i][row+n] = bridge;
				}else{
					terrainGrid[i][row+n] = water;
				}
			}else if(row+n == 0 || row+n == terrainGrid[i].length-1){
				if(terrainGrid[i][row+n].equals(road)){
					terrainGrid[i][row+n] = bridge;
				}else{
					terrainGrid[i][row+n] = water;
				}
				if(toggle){
					toggle=false;
					row+=n;
					n=0;
				}else{
					toggle=true;
					row+=n;
					n=0;
				}

			}else if(row+n < 0 || row+n > terrainGrid[i].length ){
				if(toggle){
					toggle=false;
				}else{
					toggle=true;
				}
			}
		}

		return terrainGrid;

	}

	private static Tile[][] verticalRiverGenerator(Tile[][] terrainGrid){

		int max = (int)(Math.random()*5) +3, min = (int)(Math.random()*-5)-3;
		int n = 1, col = (int)(Math.random()*terrainGrid.length);
		boolean toggle=true;



		for(int j = 0; j < terrainGrid[col].length; j++){
			

			if(col+n == col+max && toggle && col+n >= 0 && col+n < terrainGrid.length){
				toggle = false;
				col+=n;
				n=0;

			}else if(col+n == col+min && !toggle && col+n >= 0 && col+n < terrainGrid.length){
				toggle = true;
				col+=n;
				n=0;

			}else if(col + n <= col + max && toggle){
				n++;

			}else if(col + n >= col + min && !toggle){
				n--;

			}else{

			}

			if( col+n > 0 && col+n < terrainGrid.length-1 ){
				if(terrainGrid[col+n][j].equals(road)){
					terrainGrid[col+n][col+n] = bridge;
				}else{
					terrainGrid[col+n][j] = water;
				}
			}else if(col+n == 0 || col+n == terrainGrid.length-1){
				if(terrainGrid[col+n][j].equals(road)){
					terrainGrid[col+n][j] = bridge;
				}else{
					terrainGrid[col+n][j] = water;
				}
				if(toggle){
					toggle=false;
					col+=n;
					n=0;
				}else{
					toggle=true;
					col+=n;
					n=0;
				}

			}else if(col+n < 0 || col+n > terrainGrid.length ){
				if(toggle){
					toggle=false;
				}else{
					toggle=true;
				}
			}

		}
		return terrainGrid;
	}

	private static Tile[][] verticalRoadGenerator(Tile[][] terrainGrid){

		int max = (int)(Math.random()*3) +1, min = (int)(Math.random()*-3)-1; 
		int n = 1,w = 0, col = (int)(Math.random()*terrainGrid.length);
		boolean toggle=true;



		for(int j = 0; j < terrainGrid[col].length; j++){
			int ran = (int)(Math.random()*4) +3;

			if(w != 0){
				w+=1;
				if(w==ran){
					w=0;
				}

			}else if(col+n == col+max && toggle && col+n >= 0 && col+n < terrainGrid.length){
				toggle = false;
				col+=n;
				n=0;

			}else if(col+n == col+min && !toggle && col+n >= 0 && col+n < terrainGrid.length){
				toggle = true;
				col+=n;
				n=0;

			}else if(col + n <= col + max && toggle){
				n++;

			}else if(col + n >= col + min && !toggle){
				n--;

			}else{

			}

			if( col+n > 0 && col+n < terrainGrid.length-1 ){
				if(terrainGrid[col+n][j].equals(water)){
					terrainGrid[col+n][col+n] = bridge;
				}else{
					terrainGrid[col+n][j] = road;
				}
			}else if(col+n == 0 || col+n == terrainGrid.length-1){
				if(terrainGrid[col+n][j].equals(water)){
					terrainGrid[col+n][j] = bridge;
				}else{
					terrainGrid[col+n][j] = road;
				}
				if(toggle){
					toggle=false;
					col+=n;
					n=0;
				}else{
					toggle=true;
					col+=n;
					n=0;
				}

			}else if(col+n < 0 || col+n > terrainGrid.length ){
				if(toggle){
					toggle=false;
				}else{
					toggle=true;
				}
			}

		}
		return terrainGrid;
	}

	private static Tile[][] horizontalRoadGenerator(Tile[][] terrainGrid){

		int max = (int)(Math.random()*3) +1, min = (int)(Math.random()*-3)-1; 
		int n = 1,w = 0, row = (int)(Math.random()*terrainGrid[0].length);

		boolean toggle=true;

		for(int i =0; i < terrainGrid.length; i++){
			int ran = (int)(Math.random()*4) +3;

			if(w != 0){
				w+=1;
				if(w==ran){
					w=0;
				}
			}else if(row+n == row+max && toggle && row+n >= 0 && row+n < terrainGrid[i].length){
				toggle = false;
				row+=n;
				n=0;

			}else if(row+n == row+min && !toggle && row+n >= 0 && row+n < terrainGrid[i].length){
				toggle = true;
				row+=n;
				n=0;

			}else if(row + n <= row + max && toggle){
				n++;

			}else if(row + n >= row + min && !toggle){
				n--;

			}else{

			}

			if( row+n > 0 && row+n < terrainGrid[i].length-1 ){
				if(terrainGrid[i][row+n].equals(water)){
					terrainGrid[i][row+n] = bridge;
				}else{
					terrainGrid[i][row+n] = road;
				}
			}else if(row+n == 0 || row+n == terrainGrid[i].length-1){
				if(terrainGrid[i][row+n].equals(water)){
					terrainGrid[i][row+n] = bridge;
				}else{
					terrainGrid[i][row+n] = road;
				}
				if(toggle){
					toggle=false;
					row+=n;
					n=0;
				}else{
					toggle=true;
					row+=n;
					n=0;
				}

			}else if(row+n < 0 || row+n > terrainGrid[i].length ){
				if(toggle){
					toggle=false;
				}else{
					toggle=true;
				}
			}
		}

		return terrainGrid;
	}

	public Tile[][] getTerrainGrid(){
		return terrainGrid;
	}
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Game");
				MapGUI map = new MapGUI();
				frame.add(map);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
			
			}
		});


	}

}