package view;

import javax.swing.*;

import java.awt.*;

public class MapVisualizer extends JPanel {
	public static  int size = 50, gridPixelSize= 10;
	public static World w1 = new World("Map1");
	
	public MapVisualizer() {
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.clearRect(0, 0, getWidth(), getHeight());
		int sideLength = getWidth() / size;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int x = i * sideLength;
				int y = j * sideLength;
				Color terrainColor = w1.getMap()[i][j].getColor();
				g.setColor(terrainColor);
				g.fillRect(x, y, sideLength, sideLength);
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
