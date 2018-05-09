package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EnemyNormalMenuPanel extends JPanel {
	
	private PanelChangeListener listener;
	
	/**
	 * Create the panel.
	 */
	public EnemyNormalMenuPanel(PanelChangeListener listener) {
		setBackground(Color.RED);
		setLayout(null);
		
		JLabel lblIntroText = new JLabel("Select a unit.");
		lblIntroText.setBounds(0, 25, 150, 20);
		lblIntroText.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblIntroText);
		
		JButton btnStop = new JButton("END TURN");
		btnStop.setBounds(10, 75, 125, 30);
		btnStop.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				listener.changePanel("BlueMechDeselected");
				
			}
			
			
			
		});
		add(btnStop);

	}

}
