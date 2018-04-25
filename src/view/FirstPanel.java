package view;

import java.awt.*;
import javax.swing.JPanel;

public class FirstPanel extends JPanel {
	
	public World w1 = new World("Map1");
	
	public FirstPanel() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.clearRect(0, 0, getWidth(), getHeight());

		int rectWidth = getWidth() / 5;
		int rectHeight = getHeight() / 5;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int x = i * rectWidth;
				int y = j * rectHeight;
				Color terrainColor = w1.getMap()[i][j].getColor();
				g.setColor(terrainColor);
				g.fillRect(x, y, rectWidth, rectHeight);
			}
		}
	}

}
