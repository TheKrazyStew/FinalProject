package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MenuPanel extends JPanel implements Database {

	private PanelChangeListener listener;
	private JTextField textDirection;
	private JTextField textSpaces;
	private Mech[] currentArray = MechGarage.BlueBattlers;
	
	/**
	 * Create the panel.
	 */
	public MenuPanel(PanelChangeListener listener) {
		setBackground(Color.BLUE);
		setLayout(null);
		
		Controller.getController().setMenuPanel(this);;
		
		JLabel lblIntroText = new JLabel("Select an action.");
		lblIntroText.setBounds(180, 25, 150, 20);
		lblIntroText.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblIntroText);
		
		JButton buttonM1Move = new JButton(currentArray[0].getName() + " - MOVE ");
		buttonM1Move.setBounds(6, 75, 125, 30);
		buttonM1Move.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int newX = currentArray[0].getxPos(), newY = currentArray[0].getyPos();
				
				switch(textDirection.getText()){
				
				case("N"):
					newY -= Integer.parseInt(textSpaces.getText());
				break;
				case("S"):
					newY += Integer.parseInt(textSpaces.getText());
				break;
				case("W"):
					newX -= Integer.parseInt(textSpaces.getText());
				break;
				case("E"):
					newX += Integer.parseInt(textSpaces.getText());
				break;
				default:
					break;
				
				}
				
				currentArray[0].move(newX, newY);
				Controller.getController().getMapPanel().repaint();
				
			}
			
		});
		add(buttonM1Move);
		
		JButton buttonM2Move = new JButton(currentArray[1].getName() + " - MOVE ");
		buttonM2Move.setBounds(126, 75, 125, 30);
		buttonM2Move.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int newX = currentArray[1].getxPos(), newY = currentArray[1].getyPos();
				
				switch(textDirection.getText()){
				
				case("N"):
					newY -= Integer.parseInt(textSpaces.getText());
				break;
				case("S"):
					newY += Integer.parseInt(textSpaces.getText());
				break;
				case("W"):
					newX -= Integer.parseInt(textSpaces.getText());
				break;
				case("E"):
					newX += Integer.parseInt(textSpaces.getText());
				break;
				default:
					break;
				
				}
				
				currentArray[1].move(newX, newY);
				Controller.getController().getMapPanel().repaint();
				
				
			}
			
		});
		add(buttonM2Move);
		
		JButton buttonM3Move = new JButton(currentArray[2].getName() + " - MOVE ");
		buttonM3Move.setBounds(246, 75, 125, 30);
		buttonM3Move.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int newX = currentArray[2].getxPos(), newY = currentArray[2].getyPos();
				
				switch(textDirection.getText()){
				
				case("N"):
					newY -= Integer.parseInt(textSpaces.getText());
				break;
				case("S"):
					newY += Integer.parseInt(textSpaces.getText());
				break;
				case("W"):
					newX -= Integer.parseInt(textSpaces.getText());
				break;
				case("E"):
					newX += Integer.parseInt(textSpaces.getText());
				break;
				default:
					break;
				
				}
				
				currentArray[2].move(newX, newY);
				Controller.getController().getMapPanel().repaint();
				
				
			}
			
		});
		add(buttonM3Move);
		
		JButton buttonM4Move = new JButton(currentArray[3].getName() + " - MOVE ");
		buttonM4Move.setBounds(370, 75, 125, 30);
		buttonM4Move.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int newX = currentArray[3].getxPos(), newY = currentArray[3].getyPos();
				
				switch(textDirection.getText()){
				
				case("N"):
					newY -= Integer.parseInt(textSpaces.getText());
				break;
				case("S"):
					newY += Integer.parseInt(textSpaces.getText());
				break;
				case("W"):
					newX -= Integer.parseInt(textSpaces.getText());
				break;
				case("E"):
					newX += Integer.parseInt(textSpaces.getText());
				break;
				default:
					break;
				
				}
				
				currentArray[3].move(newX, newY);
				listener.changePanel("MapVisualizerGrass");
				Controller.getController().getMapPanel().repaint();
				
				
			}
			
		});
		add(buttonM4Move);
		
		textDirection = new JTextField();
		textDirection.setText("Direction to Face (N,S,E,W)");
		textDirection.setBounds(6, 6, 130, 26);
		add(textDirection);
		textDirection.setColumns(10);
		
		textSpaces = new JTextField();
		textSpaces.setText("Distance to Move");
		textSpaces.setColumns(10);
		textSpaces.setBounds(370, 6, 130, 26);
		add(textSpaces);
		
		JButton buttonM1Atk = new JButton(currentArray[0].getName() + " - ATK");
		buttonM1Atk.setBounds(6, 100, 125, 30);
		add(buttonM1Atk);
		
		JButton buttonM2Atk = new JButton(currentArray[1].getName() + " - ATK");
		buttonM2Atk.setBounds(126, 100, 125, 30);
		add(buttonM2Atk);
		
		JButton buttonM3Atk = new JButton(currentArray[2].getName() + " - ATK");
		buttonM3Atk.setBounds(246, 100, 125, 30);
		add(buttonM3Atk);
		
		JButton buttonM4Atk = new JButton(currentArray[3].getName() + " - ATK");
		buttonM4Atk.setBounds(370, 102, 125, 30);
		add(buttonM4Atk);
		
		JButton btnEndTurn = new JButton("END TURN");
		btnEndTurn.setBounds(200, 150, 117, 29);
		btnEndTurn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(currentArray.equals(MechGarage.BlueBattlers)){
					
				currentArray = MechGarage.RedBattlers;
				setBackground(Color.RED);
				buttonM1Move.setText(currentArray[0].getName() + " - MOVE ");
				buttonM2Move.setText(currentArray[1].getName() + " - MOVE ");
				buttonM3Move.setText(currentArray[2].getName() + " - MOVE ");
				buttonM4Move.setText(currentArray[3].getName() + " - MOVE ");
				
				buttonM1Atk.setText(currentArray[0].getName() + " - ATK");
				buttonM2Atk.setText(currentArray[1].getName() + " - ATK");
				buttonM3Atk.setText(currentArray[2].getName() + " - ATK");
				buttonM4Atk.setText(currentArray[3].getName() + " - ATK");
				
				
				} else {
					
					currentArray = MechGarage.BlueBattlers;
					setBackground(Color.BLUE);
					
					buttonM1Move.setText(currentArray[0].getName() + " - MOVE ");
					buttonM2Move.setText(currentArray[1].getName() + " - MOVE ");
					buttonM3Move.setText(currentArray[2].getName() + " - MOVE ");
					buttonM4Move.setText(currentArray[3].getName() + " - MOVE ");
					
					buttonM1Atk.setText(currentArray[0].getName() + " - ATK");
					buttonM2Atk.setText(currentArray[1].getName() + " - ATK");
					buttonM3Atk.setText(currentArray[2].getName() + " - ATK");
					buttonM4Atk.setText(currentArray[3].getName() + " - ATK");
					
				}
				
			}
			
			
			
		});
		add(btnEndTurn);

	}
}
