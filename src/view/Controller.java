package view;

public class Controller {
	
	private static Controller controller;
	private MapVisualizer mapPanel;
	private NormalMenuPanel menuPanel;
	
	private Controller(){
		
	}

	public static Controller getController(){
		if (controller == null){
			controller = new Controller();
		}
		return controller;
	}

	public MapVisualizer getMapPanel() {
		return mapPanel;
	}

	public void setMapPanel(MapVisualizer mapPanel) {
		this.mapPanel = mapPanel;
	}

	public NormalMenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(NormalMenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}
	
	
}
