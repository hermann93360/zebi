package application.modele;

import application.vue.BrigandVue;
import application.vue.LinkVue;
import application.vue.PersonnageVue;
import javafx.scene.image.ImageView;

public abstract class Ennemis extends LesActeurs {

	public Ennemis(int x, int y, int v, Environnement env) {
		super(x, y, v, env);
		
	}

	@Override
	public void seDeplacer(int changement) {
		
		
	}

	@Override
	public ImageView getImageActuelle() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public abstract PersonnageVue getVue();

}
