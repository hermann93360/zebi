package application.modele;

import java.util.ArrayList;

import application.vue.BrigandVue;
import application.vue.LinkVue;
import application.vue.PersonnageVue;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Brigands extends Ennemis {
    private ArrayList<Image> imageTab = new ArrayList<>();
     private ImageView imageActuelle;
     private int x;
     private int y;
     private PersonnageVue bv;

    public Brigands(int x, int y, int v, Environnement env) {
        super(x, y, v, env);

		   this.bv = new BrigandVue();


    }

    public void seDeplacer(int changement) {
		  

		int verifDeplacement;
		        switch (getMvx()) {
		        
		        case 1: verifDeplacement = getX()-getV();
		       this.bv.setImageActuelle(1, changement);
		       
		                if(this.getEnv().verifPlacement(verifDeplacement, getY())==false) {		              
		                	if(!this.getEnv().estObstacle(verifDeplacement, getY()))
		                		setX(verifDeplacement);
		                }
		                break;

		        case 2: verifDeplacement = getY()+getV();
		        this.bv.setImageActuelle(2, changement);
		        
		                if(this.getEnv().verifPlacement(getX(), verifDeplacement)==false) {
		                	if(!this.getEnv().estObstacle(getX(), verifDeplacement))		             
		                		setY(verifDeplacement);
		                }
		                break;
		                
		        case 3: verifDeplacement = getX()+getV();
		        this.bv.setImageActuelle(3, changement);
		                if(this.getEnv().verifPlacement(verifDeplacement, getY())==false) {
		                     if(this.getEnv().estObstacle(verifDeplacement, getY())==false) {
		                		setX(verifDeplacement);
		                     }
		                	
		                }
		                break; 

		        case 4: verifDeplacement = getY()-getV();
		        this.bv.setImageActuelle(4, changement);
		        
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
    
    public PersonnageVue getVue() {
    	return bv;
    }
    
 
    
}
