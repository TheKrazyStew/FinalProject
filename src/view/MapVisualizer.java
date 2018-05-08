package view;

import javax.swing.*;

import java.awt.*;

public class MapVisualizer extends JPanel implements Database {
	public static int gridPixelSize= 16;
	public static World w1 = new World("Map1",20,grassGenList);
	private static Tile[][] currentMap;

	public MapVisualizer(World w) {
		w.generate();
		currentMap = w.getMap();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Tile[][] currentMap = this.currentMap;
		g.clearRect(0, 0, getWidth(), getHeight());
		int size = getWidth() / currentMap.length;
		for (int i = 0; i < currentMap.length; i++) {
			for (int j = 0; j < currentMap.length; j++) {
				int x = i * size;
				int y = j * size;
				Color terrainColor = currentMap[i][j].getColor();
				g.setColor(terrainColor);
				g.fillRect(x, y, size, size);
			}
		}

	}

	/* public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Game");
				MapVisualizer map = new MapVisualizer(w1);
				frame.getContentPane().add(map);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);

			}
		});


	} */

}