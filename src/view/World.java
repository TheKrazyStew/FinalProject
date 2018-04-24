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

	public Tile[][] generate(ArrayList<Tile> genList){
		Tile[][] genMap = new Tile[size][size];
		for(int i = 0; i < genList.size(); i++){
			
		}
		return genMap;

	}

	public String toString(){
		return String.format("%s [&d x %d]",name, size, size);
	}
}