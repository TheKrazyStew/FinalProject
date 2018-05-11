package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuFrame extends JFrame implements PanelChangeListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFrame frame = new MenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 150, 150);
		contentPane = new NormalMenuPanel(this);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	@Override
	public void changePanel(String panelName) {
		
		setBounds(900, 100, 150, 150);
		
		JPanel newPanel = null;

		switch(panelName){

		case("BlueMechSelected"):
			newPanel = new MechMenuPanel(this);
		break;
		
		case("BlueMechDeselected"):
			newPanel = new NormalMenuPanel(this);
		break;
		
		case("RedMechSelected"):
			newPanel = new EnemyMechMenuPanel(this);
		break;
		
		case("RedMechDeselected"):
			newPanel = new EnemyNormalMenuPanel(this);
		break;
		}
		if (newPanel!= null) {

			setContentPane(newPanel);
			validate();

		}
	}
}
