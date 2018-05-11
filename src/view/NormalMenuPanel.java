package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class NormalMenuPanel extends JPanel implements Database {

	private PanelChangeListener listener;
	private JTextField textDirection;
	private JTextField textSpaces;
	
	/**
	 * Create the panel.
	 */
	public NormalMenuPanel(PanelChangeListener listener) {
		setBackground(Color.BLUE);
		setLayout(null);
		
		Controller.getController().setMenuPanel(this);;
		
		JLabel lblIntroText = new JLabel("Select an action.");
		lblIntroText.setBounds(180, 25, 150, 20);
		lblIntroText.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblIntroText);
		
		JButton buttonM1Move = new JButton(MechGarage.pMech1.getName() + " - MOVE ");
		buttonM1Move.setBounds(6, 75, 125, 30);
		buttonM1Move.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int newX = MechGarage.pMech1.getxPos(), newY = MechGarage.pMech1.getyPos();
				
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
				
				MechGarage.pMech1.move(newX, newY);
				Controller.getController().getMapPanel().repaint();
				
			}
			
		});
		add(buttonM1Move);
		
		JButton buttonM2Move = new JButton(MechGarage.pMech2.getName() + " - MOVE ");
		buttonM2Move.setBounds(126, 75, 125, 30);
		buttonM2Move.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int newX = MechGarage.pMech2.getxPos(), newY = MechGarage.pMech2.getyPos();
				
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
				
				MechGarage.pMech2.move(newX, newY);
				Controller.getController().getMapPanel().repaint();
				
				
			}
			
		});
		add(buttonM2Move);
		
		JButton buttonM3Move = new JButton(MechGarage.pMech3.getName() + " - MOVE ");
		buttonM3Move.setBounds(246, 75, 125, 30);
		buttonM3Move.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int newX = MechGarage.pMech3.getxPos(), newY = MechGarage.pMech3.getyPos();
				
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
				
				MechGarage.pMech3.move(newX, newY);
				Controller.getController().getMapPanel().repaint();
				
				
			}
			
		});
		add(buttonM3Move);
		
		JButton buttonM4Move = new JButton(MechGarage.pMech4.getName() + " - MOVE ");
		buttonM4Move.setBounds(370, 75, 125, 30);
		buttonM4Move.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int newX = MechGarage.pMech4.getxPos(), newY = MechGarage.pMech4.getyPos();
				
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
				
				MechGarage.pMech4.move(newX, newY);
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
		
		JButton buttonM1Atk = new JButton(MechGarage.pMech1.getName() + " - ATK");
		buttonM1Atk.setBounds(6, 100, 125, 30);
		add(buttonM1Atk);
		
		JButton buttonM2Atk = new JButton(MechGarage.pMech2.getName() + " - ATK");
		buttonM2Atk.setBounds(126, 100, 125, 30);
		add(buttonM2Atk);
		
		JButton buttonM3Atk = new JButton(MechGarage.pMech3.getName() + " - ATK");
		buttonM3Atk.setBounds(246, 100, 125, 30);
		add(buttonM3Atk);
		
		JButton buttonM4Atk = new JButton(MechGarage.pMech4.getName() + " - ATK");
		buttonM4Atk.setBounds(370, 102, 125, 30);
		add(buttonM4Atk);
		
		JButton btnEndTurn = new JButton("END TURN");
		btnEndTurn.setBounds(200, 150, 117, 29);
		btnEndTurn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				listener.changePanel("RedMechDeselected");
				
			}
			
			
			
		});
		add(btnEndTurn);

	}
}
