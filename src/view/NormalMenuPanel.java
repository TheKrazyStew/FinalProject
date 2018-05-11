package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class NormalMenuPanel extends JPanel implements Database{

	private PanelChangeListener listener;
	
	/**
	 * Create the panel.
	 */
	public NormalMenuPanel(PanelChangeListener listener) {
		setBackground(Color.BLUE);
		setLayout(null);
		
		JLabel lblIntroText = new JLabel("Select an action.");
		lblIntroText.setBounds(180, 25, 150, 20);
		lblIntroText.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblIntroText);
		
		JButton buttonM1Move = new JButton(pMech1.getName() + " - MOVE ");
		buttonM1Move.setBounds(6, 75, 125, 30);
		add(buttonM1Move);
		
		JButton buttonM2Move = new JButton(pMech2.getName() + " - MOVE ");
		buttonM2Move.setBounds(126, 75, 125, 30);
		add(buttonM2Move);
		
		JButton buttonM3Move = new JButton(pMech3.getName() + " - MOVE ");
		buttonM3Move.setBounds(246, 75, 125, 30);
		add(buttonM3Move);
		
		JButton buttonM4Move = new JButton(pMech4.getName() + " - MOVE ");
		buttonM4Move.setBounds(370, 75, 125, 30);
		add(buttonM4Move);
		
		JButton buttonM1Atk = new JButton(pMech1.getName() + " - ATK");
		buttonM1Atk.setBounds(6, 100, 125, 30);
		add(buttonM1Atk);
		
		JButton buttonM2Atk = new JButton(pMech2.getName() + " - ATK");
		buttonM2Atk.setBounds(126, 100, 125, 30);
		add(buttonM2Atk);
		
		JButton buttonM3Atk = new JButton(pMech3.getName() + " - ATK");
		buttonM3Atk.setBounds(246, 100, 125, 30);
		add(buttonM3Atk);
		
		JButton buttonM4Atk = new JButton(pMech4.getName() + " - ATK");
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
