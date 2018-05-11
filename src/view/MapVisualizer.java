package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MapVisualizer extends JPanel implements Database {
	
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
	
	public static World w1 = new World("Map1",20,grassGenList);
	private static Tile[][] currentMap;

	public MapVisualizer(World w) {
		w.generate();
		currentMap = w.getMap();
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
		
		for(Mech mech : Battlers){
			
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