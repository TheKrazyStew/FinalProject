package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MapMenu extends JPanel implements Tilesets {
	
	private World
		grass = new World("Grassland", 20, grassGenList),
		sand = new World("Desert", 50, sandGenList);
	private PanelChangeListener listener;
	
	/**
	 * Create the panel.
	 */
	public MapMenu() {
		setBackground(new Color(128, 0, 0));
		setLayout(null);
		
		JButton btnGrassland = new JButton("GRASSLAND"),
				btnDesert = new JButton("DESERT"),
				btnLand = new JButton("LAND3"),
				btnPlay = new JButton("PLAY");
		
		JLabel lblGrasslandPreview = new JLabel("Grassland Preview");
		lblGrasslandPreview.setBounds(75, 32, 100, 171);
		add(lblGrasslandPreview);

		//Grassland Button
		btnGrassland.setBounds(75, 225, 100, 30);
		btnGrassland.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				new MapVisualizer(grass);
				btnLand.setText("LAND3");
				btnDesert.setText("DESERT");
				btnGrassland.setText("SELECTED");
				
			}
			
			
			
		});
		add(btnGrassland);
		
		JLabel lblDesertPreview = new JLabel("Desert Preview");
		lblDesertPreview.setBounds(200, 32, 100, 171);
		add(lblDesertPreview);
		
		//Desert Button
		btnDesert.setBounds(200, 225, 100, 30);
		btnDesert.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				sand.generate(sandGenList);
				btnLand.setText("LAND3");
				btnDesert.setText("SELECTED");
				btnGrassland.setText("GRASSLAND");
				
			}});
		add(btnDesert);
		
		JLabel lblLandPreview = new JLabel("Land3 Preview");
		lblLandPreview.setBounds(325, 32, 100, 171);
		add(lblLandPreview);
		
		//Land3 Button
		btnLand.setBounds(325, 225, 100, 30);
		btnLand.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnLand.setText("LOCKED");
				btnDesert.setText("DESERT");
				btnGrassland.setText("GRASSLAND");
				
			}});
		add(btnLand);
		
		//Play Button
		btnPlay.setBounds(200, 285, 100, 30);
		btnPlay.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				listener.changePanel("MapVisualizer");
				
			}});
		add(btnPlay);
		
		
		
	}
}
