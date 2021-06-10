package application.vue;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class LinkVue extends PersonnageVue{
	  
	private ArrayList<Image> imageLink = new ArrayList<>();
	private ImageView imageActuelle;
	
	public LinkVue() {
		this.imageLink.add(new Image("/application/ressource/linkFace1.png"));
	    this.imageLink.add(new Image("/application/ressource/linkFace2.png"));
	    this.imageLink.add(new Image("/application/ressource/linkDos1.png"));
	    this.imageLink.add(new Image("/application/ressource/linkDos2.png"));
	    this.imageLink.add(new Image("/application/ressource/linkDroite1.png"));
	    this.imageLink.add(new Image("/application/ressource/linkDroite2.png"));
	    this.imageLink.add(new Image("/application/ressource/linkGauche1.png"));
	    this.imageLink.add(new Image("/application/ressource/linkGauche2.png"));
	    imageActuelle = new ImageView(imageLink.get(0));
	}


    
    public void setImageActuelle(int direction, int changement) {
		if(direction == 1) {
			if(changement == 0)
				this.imageActuelle.setImage(this.imageLink.get(6));
			else
				this.imageActuelle.setImage(this.imageLink.get(7));
		}
		else if(direction == 2) {
			if(changement == 0)
				this.imageActuelle.setImage(this.imageLink.get(0));
			else
				this.imageActuelle.setImage(this.imageLink.get(1));
		}
		else if(direction == 3) {
			if(changement == 0)
				this.imageActuelle.setImage(this.imageLink.get(4));
			else
				this.imageActuelle.setImage(this.imageLink.get(5));
		}
		else {
			if(changement == 0)
				this.imageActuelle.setImage(this.imageLink.get(2));
			else
				this.imageActuelle.setImage(this.imageLink.get(3));
		}
	}

    public ArrayList<Image> getImageTab(){
		return this.imageLink;
	}
	
	public ImageView getImageActuelle() {
		return this.imageActuelle;
	}

}

