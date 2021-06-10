package application.vue;


import application.controleur.Controleur;
import application.modele.Brigands;
import application.modele.Environnement;
import application.modele.LesActeurs;
import application.modele.Link;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GenererDeplacement {
	
  
	public static void MouvementSprite(LesActeurs ac, Pane pn) {
		
    
        EventHandler<KeyEvent> bougerRec = new EventHandler<KeyEvent>() {
        	int changement=1;
            public void handle(KeyEvent event) {
            	
               
            	switch (event.getCode()) {
                
                case LEFT:
                	
                	if(ac.getId() != 0) {
                		ac.setMvx((int)(Math.random()*(5-1))+1);
                	}
                	
                	if(ac.getId() == 0)
                		ac.setMvx(1);
                	
                	if (changement== 1) 
                		changement=0;
                	else 
                		changement = 1;
                	
                    ac.seDeplacer(changement);
                    break;
                
                case DOWN: 
                	if(ac.getId() != 0) {
                		ac.setMvx((int)(Math.random()*(5-1))+1);
                	}
                	if(ac.getId() == 0)
                		ac.setMvx(2);
                	if (changement== 1) 
                		changement=0;
                	else 
                		changement = 1;
                    ac.seDeplacer(changement);
                    break;
                        
                case RIGHT:
                	if(ac.getId() != 0) {
                		ac.setMvx((int)(Math.random()*(5-1))+1);
                	}
                	
                	if(ac.getId() == 0)
                		ac.setMvx(3);
                	
                	if (changement== 1) 
                		changement=0;
                	else 
                		changement = 1;
                	
                	ac.seDeplacer(changement);
                	break; 
                
                case UP:
                	if(ac.getId() != 0) {
                		ac.setMvx((int)(Math.random()*(5-1))+1);
                	}
                	if(ac.getId() == 0)
                		ac.setMvx(4);
                	
                	if (changement== 1) 
                		changement=0;
                	else 
                		changement = 1;
                	
                    ac.seDeplacer(changement);
                    break;
                         
                case A:
                	if(ac.getId() == 0) {
                		ac.attaquer();
                	}
                	break;
                case C:
                	if(ac.getId() == 0) {
                		ac.changerArme();
                	}
                	break;
                	
                        
                default:
                        break;
                }
            }
        };
        pn.addEventFilter(KeyEvent.KEY_PRESSED, bougerRec);
    }
}  