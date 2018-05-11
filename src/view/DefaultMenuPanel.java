package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DefaultMenuPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public DefaultMenuPanel() {
		setBackground(Color.GRAY);
		setLayout(null);
		
		JLabel lblPleaseSee = new JLabel("Please see the");
		lblPleaseSee.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSee.setBounds(0, 0, 100, 50);
		add(lblPleaseSee);
		
		JLabel lblOtherScreen = new JLabel("other screen.");
		lblOtherScreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtherScreen.setBounds(0, 25, 100, 50);
		add(lblOtherScreen);

	}
}
