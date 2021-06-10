package application.vue;

import javafx.scene.control.Label;

public class InformationVue {
	private Label display;
	
	public InformationVue(Label display) {
		
		this.display = display;
		
	}
	
	public void setArmeVue(String arme) {
		this.display.setText("Arme : " + arme);
	}
}
