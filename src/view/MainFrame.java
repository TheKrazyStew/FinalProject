package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame implements PanelChangeListener, Database{

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new MapMenu(this);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	@Override
	public void changePanel(String panelName) {

		JPanel newPanel = null;

		if(panelName.equals("MapVisualizerGrass")){

			newPanel = new MapVisualizer(grassLand);
			setBounds(100, 100, 200, 200);

		} else if(panelName.equals("MapVisualizerSand")){

			newPanel = new MapVisualizer(sandLand);
			setBounds(100, 100, 500, 500);

		}

		if (newPanel!= null) {

			setContentPane(newPanel);
			validate();

		}

	}

}
