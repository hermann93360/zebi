package application.vue;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class PersonnageVue {
	private ArrayList<Image> imageLink = new ArrayList<>();
	private ImageView imageActuelle;

	public abstract void setImageActuelle(int direction, int changement);
	
	public ArrayList<Image> getImageTab(){
		return this.imageLink;
	}
	
	public ImageView getImageActuelle() {
		return this.imageActuelle;
	}

}