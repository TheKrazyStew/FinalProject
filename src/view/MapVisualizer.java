package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MapVisualizer extends JPanel implements Database {
	
	public static World w1 = new World("Map1",20,grassGenList);
	private static Tile[][] currentMap;
	private MechGarage mechs;

	public MapVisualizer(World w) {
		w.generate();
		currentMap = w.getMap();
		
		Controller.getController().setMapPanel(this);
	/*	addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                super.mouseClicked(me);
                //Find out what we're trying to do here
                for(int i = 0; i < Battlers.length; i++){
                	
                	if(Battlers[i].findMe().contains(me.getPoint())){
                		
                		
                		
                	}
                	
                }
            }
		}); */
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
		
		for(Mech mech : mechs.Battlers){
			
			g.setColor(mech.getTeam());
			g.fillOval(mech.getxPos() * size, mech.getyPos() * size,
					size, size);
			
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