package application.modele;

import java.util.ArrayList;

import application.vue.BrigandVue;
import application.vue.InformationVue;
import application.vue.LinkVue;
import application.vue.PersonnageVue;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public abstract class LesActeurs {
	public static int idStatic = 0;
	public int id;
	private IntegerProperty x,y;
	private int v; // vitesse de deplacement
	private int mvx; // mouvement direction
	private Environnement env;
	private int pv = 150;
	Arme arme;
	InformationVue infovue;
	ArrayList<Arme> armes = new ArrayList<>();


	
	public LesActeurs(int x, int y, int v, Environnement env) {
		this.id = idStatic;
		idStatic++;
		
		this.x= new SimpleIntegerProperty(x);
		this.y = new SimpleIntegerProperty(y);
		this.v = v;
		this.env=env;	
		
	}
	public IntegerProperty getXP() {
		return this.x;
	}
	
	
	public Arme getArmeActuelle() {
		return arme;
	}
	
	public int changerArme() {
		System.out.println("je hanfzef");
		for(Arme a : armes) {
			if(a.getId() != arme.getId()) {
				System.out.println("boucle");
				arme = a;
				infovue.setArmeVue(arme.toString());
				return 0;
			}
			
		}
		return -1;
	}
	
	public void attaquer() {
		
		LesActeurs acteur = this.env.proximité(this);
		System.out.println(arme.getPointAttaque());
		
		if(acteur != null) {
			if(arme instanceof Arc) {
				if(((Arc) arme).getFleche() != 0) {
					((Arc) arme).setFleche();
					acteur.setPv(acteur.getPv() - this.arme.getPointAttaque());
					System.out.println("pv de celui qui attaque : " + this.getPv() + ", pv de celui qui se fait attaquer : " + acteur.getPv());
					System.out.println("Nombre de flèche : " + ((Arc) arme).getFleche());
				}
				else {
					System.out.println("Attaque impossible plus de flèche...");
				}
			}
			else {
				acteur.setPv(acteur.getPv() - this.arme.getPointAttaque());
				System.out.println("pv de celui qui attaque : " + this.getPv() + ", pv de celui qui se fait attaquer : " + acteur.getPv());
			}
		}
		else {
			System.out.println("L'acteur n'a pas d'arme");
		}
		
	}
	
	public IntegerProperty getYP() {
		return this.y;
	}
	
	public int getX() {
		return this.x.get();
	}
	
	public int getY() {
		return this.y.get();
	}
	
	public int getV() {
		return v;
	}
	
	public int getMvx() {
		return mvx;
	}
	
	public Environnement getEnv() {
		return env;
	}

	public int getId() {
		return id;
	}

	public int getPv() {
		return pv;
	}

	public void setV(int v) {
		this.v = v;
	}

	public void setMvx(int mvx) {
		this.mvx = mvx;
	}

	public void setEnv(Environnement env) {
		this.env = env;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}
	
	public void setX(int newX) {
		this.x.setValue(newX);
	}
	
	public void setY(int newY) {
		this.y.setValue(newY);
	}
	public abstract PersonnageVue getVue();

	public abstract void seDeplacer(int changement);
	
	public abstract ImageView getImageActuelle();
	
}
