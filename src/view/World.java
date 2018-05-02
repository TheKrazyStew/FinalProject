package view;

import java.util.ArrayList;

public class World {
	private Tile[][] map;
	private int size;
	private String name;

	public World(String name) {
		this.name = name;
		map = new Tile[10][10];
		size = map.length;
	}

	public World(String name, int size) {
		this.name = name;
		this.size = size;
		map = new Tile[size][size];

	}

	public World(String name, Tile[][] map) {
		this.name = name;
		this.map = map;
		size = map.length;
	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tile[][] getMap() {
		return map;
	}

	public Tile[][] generate(ArrayList<Tile> genList){
		Tile[][] genMap = new Tile[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int randomTerrainIndex = (int)(genList.size() * Math.random());
				Tile randomTile = genList.get(randomTerrainIndex);
				genMap[i][j] = randomTile; 
				System.out.println("generate:" + genMap[i][j]);
			}
		}
		return genMap;

	}

	public Tile[][] generate(Tile[] genList){
		Tile[][] genMap = new Tile[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int randomTerrainIndex = (int)(genList.length * Math.random());
				Tile randomTile = genList[randomTerrainIndex];
				genMap[i][j] = randomTile; 
				System.out.println("generate:" + genMap[i][j]);
			}
		}
		map = genMap;
		return genMap;

	}

	public String toString(){
		return String.format("%s [&d x %d]",name, size, size);
	}

}