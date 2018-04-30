package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MapMenu extends JPanel implements Tilesets {
	
	World grass = new World("Grassland");
	World sand = new World("Desert");
	
	/**
	 * Create the panel.
	 */
	public MapMenu() {
		setBackground(new Color(128, 0, 0));
		setLayout(null);
		
		JLabel lblGrasslandPreview = new JLabel("Grassland Preview");
		lblGrasslandPreview.setBounds(75, 32, 100, 171);
		add(lblGrasslandPreview);
		
		JButton btnGrassland = new JButton("GRASSLAND");
		btnGrassland.setBounds(75, 225, 100, 30);
		btnGrassland.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
			
			
		});
		add(btnGrassland);
		
		JLabel lblDesertPreview = new JLabel("Desert Preview");
		lblDesertPreview.setBounds(200, 32, 100, 171);
		add(lblDesertPreview);
		
		JButton btnDesertPreview = new JButton("DESERT");
		btnDesertPreview.setBounds(200, 225, 100, 30);
		add(btnDesertPreview);
		
		JLabel lblLandPreview = new JLabel("Land3 Preview");
		lblLandPreview.setBounds(325, 32, 100, 171);
		add(lblLandPreview);
		
		JButton btnLand = new JButton("LAND3");
		btnLand.setBounds(325, 225, 100, 30);
		add(btnLand);
		
		
		
	}
}
