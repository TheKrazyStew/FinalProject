package view;

public class Controller {
	
	private static Controller controller;
	private MapVisualizer mapPanel;
	private MenuPanel menuPanel;
	
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

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}
	
	
}
