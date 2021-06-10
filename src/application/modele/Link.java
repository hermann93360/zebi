package application.modele;

import java.util.ArrayList;

import application.vue.BrigandVue;
import application.vue.InformationVue;
import application.vue.LinkVue;
import application.vue.PersonnageVue;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Link extends LesActeurs{
	private Environnement env;
	private ArrayList<Image> imageTab = new ArrayList<>();
	private PersonnageVue lv;
	  
	 private ImageView imageActuelle;

		Label affichagesdesarmes;
	
	public Link(int x, int y, int v, Environnement env, Label affichagesdesarmes) {
		super(x, y, v, env);
		
		   lv = new LinkVue();
	       
		   super.armes.add(new Arc());
		   super.armes.add(new Epee());
		   
		   super.arme = super.armes.get(0);	
		
		   super.infovue = new InformationVue(affichagesdesarmes);
		   this.affichagesdesarmes = affichagesdesarmes;
	}
	

	@Override
	public void seDeplacer(int changement) {
		  

		int verifDeplacement;
		        switch (getMvx()) {
		        
		        case 1: verifDeplacement = getX()-getV();
		        this.lv.setImageActuelle(1, changement);
		       
		                if(this.getEnv().verifPlacement(verifDeplacement, getY())==false) {		              
		                	if(!this.getEnv().estObstacle(verifDeplacement, getY()))
		                		setX(verifDeplacement);
		                }
		                break;

		        case 2: verifDeplacement = getY()+getV();
		        this.lv.setImageActuelle(2, changement);
		        
		                if(this.getEnv().verifPlacement(getX(), verifDeplacement)==false) {
		                	if(!this.getEnv().estObstacle(getX(), verifDeplacement))		             
		                		setY(verifDeplacement);
		                }
		                break;
		                
		        case 3: verifDeplacement = getX()+getV();
		        this.lv.setImageActuelle(3, changement);
		        
		                if(this.getEnv().verifPlacement(verifDeplacement, getY())==false) {
		                     if(this.getEnv().estObstacle(verifDeplacement, getY())==false) {
		                		setX(verifDeplacement);
		                     }
		                	
		                }
		                break; 

		        case 4: verifDeplacement = getY()-getV();
		        this.lv.setImageActuelle(4, changement);
		        
		                if(this.getEnv().verifPlacement(getX(), verifDeplacement)==false) {
		                	if(!this.getEnv().estObstacle(getX(), verifDeplacement))
		                		setY(verifDeplacement);
		                }
		                break;
		        }
		        
		    }
	
	public ImageView getImageActuelle() {
		return this.imageActuelle;
	}



	@Override
	public PersonnageVue getVue() {
		System.out.println("ziegfiuqzefbhozq");
		return lv;
	}
}