package application.controleur;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.modele.Arc;
import application.modele.Brigands;
import application.modele.Environnement;
import application.modele.Epee;
import application.modele.LesActeurs;
import application.modele.Link;
import application.modele.Tiled;
import application.modele.Parametre;
import application.vue.DessinMap;
import application.vue.GenererDeplacement;
import application.vue.LinkVue;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;


public class Controleur implements Initializable {
	
	  @FXML
	    private TilePane tilePane;
	  @FXML
	  	private Pane panneauMap;
	  
	  @FXML
	  private Label displayarme;
	  
	  
  	 	Environnement e1;
	  
  	 	Tiled tl;
  	 	
  	 	Link l1;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tl = new Tiled();
	    e1 = new Environnement(65,65, tl);
	    tl.LireMap();
	        
	    DessinMap.panneauJeu(tilePane, tl);
	    
	    l1 = new Link(12, 12, 1, e1, displayarme);
	    
	    Brigands b1= new Brigands(12,12,1,e1);
	       creerSprite(l1);
	       creerSprite(b1);
	       
	       e1.ajouterActeur(l1);
	       e1.ajouterActeur(b1);
	    GenererDeplacement.MouvementSprite(l1, panneauMap); 
	    GenererDeplacement.MouvementSprite(b1, panneauMap); 
	    
	  
	    
	    
	    
	}
	  
	  
	private void creerSprite(LesActeurs act) {
		//Rectangle rect = new Rectangle(5, 5);
		//rect.setFill(Color.RED);

		act.getVue().getImageActuelle().setTranslateX(0);
		act.getVue().getImageActuelle().setTranslateY(0);
		act.getVue().getImageActuelle().translateXProperty().bind(act.getXP().multiply(Parametre.LinkBindingX));
		act.getVue().getImageActuelle().translateYProperty().bind(act.getYP().multiply(Parametre.LinkBindingY));                          
       
		panneauMap.getChildren().add(act.getVue().getImageActuelle()); 
	}
	
	
}