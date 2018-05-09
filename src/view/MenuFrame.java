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
		setBounds(100, 100, 150, 150);
		contentPane = new NormalMenuPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	@Override
	public void changePanel(String panelName) {

		JPanel newPanel = null;

		switch(panelName){

		case("BlueMechSelected"):
			newPanel = new MechMenuPanel();
		break;
		
		case("BlueMechDeselected"):
			newPanel = new NormalMenuPanel();
		break;
		
		case("RedMechSelected"):
			newPanel = new EnemyMechMenuPanel();
		break;
		
		case("RedMechDeselected"):
			newPanel = new EnemyNormalMenuPanel();
		break;
		}
		if (newPanel!= null) {

			setContentPane(newPanel);
			validate();

		}
	}

}
