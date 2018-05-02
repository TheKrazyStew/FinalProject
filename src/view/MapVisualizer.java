package view;

import javax.swing.*;

import java.awt.*;

public class MapVisualizer extends JPanel implements Tilesets {
	public static int gridPixelSize= 10;
	public static World w1 = new World("Map1");
	
	
	
	public MapVisualizer() {
		w1.generate(grassGenList);
		Tile[][] currentMap = w1.getMap();
		for(int i = 0; i < currentMap.length; i++){
			for(int j = 0; j < currentMap[i].length; j++){
				System.out.println(currentMap[i][j]);
			}
			System.out.println("\n");
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		World currentMap = w1;
		g.clearRect(0, 0, getWidth(), getHeight());
		int size = getWidth() / currentMap.getSize();
		for (int i = 0; i < currentMap.getSize(); i++) {
			for (int j = 0; j < currentMap.getSize(); j++) {
				int x = i * size;
				int y = j * size;
				Color terrainColor = w1.getMap()[i][j].getColor();
				g.setColor(terrainColor);
				g.fillRect(x, y, size, size);
			}
		}
		
	}

public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Game");
				MapVisualizer map = new MapVisualizer();
				frame.getContentPane().add(map);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
			
			}
		});


	}
}
