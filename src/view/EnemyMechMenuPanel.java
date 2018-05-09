package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EnemyMechMenuPanel extends JPanel {
	
	private PanelChangeListener listener;

	/**
	 * Create the panel.
	 */
	public EnemyMechMenuPanel(PanelChangeListener listener) {
		setBackground(Color.RED);
		setLayout(null);
		
		JLabel lblIntroText = new JLabel("UNIT SELECTED");
		lblIntroText.setBounds(0, 25, 150, 20);
		lblIntroText.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblIntroText);
		
		JButton btnAttack = new JButton("ATTACK");
		btnAttack.setBounds(25, 50, 100, 30);
		add(btnAttack);
		
		JButton btnMove = new JButton("MOVE");
		btnMove.setBounds(25, 75, 100, 30);
		add(btnMove);
		
		JButton btnStop = new JButton("STOP");
		btnStop.setBounds(25, 100, 100, 30);
		add(btnStop);

	}

}
