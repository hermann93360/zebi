package application.vue;

import application.modele.Tiled;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

public class DessinMap {
    
    public static void panneauJeu(TilePane tp, Tiled tl) {
        
        Image img;
        for(int i = 0; i < tl.gettab().length; i++) {
        	for(int j = 0; j < tl.gettab()[i].length; j++) {
        		switch(tl.gettab()[i][j]) {

	        	  case 1: img = new Image("/application/ressource/Herbe1.png");
				   			break;
			
				  case 2: img = new Image("/application/ressource/Cathedrale17.png");	
				   			break;
				   			
				  case 3: img = new Image("/application/ressource/Cathedrale18.png");	
							break;
						
				  case 4: img = new Image("/application/ressource/Cathedrale19.png");	
				  			break;
						
				  case 5: img = new Image("/application/ressource/Cathedrale20.png");	
				  			break;
						
				  case 6: img = new Image("/application/ressource/Chateau29.png");	
				  			break;
						
				  case 7: img = new Image("/application/ressource/Chateau30.png");	
							break;
						
				  case 8: img = new Image("/application/ressource/Chateau31.png");	
							break;
						
				  case 9: img = new Image("/application/ressource/Chateau32.png");	
							break;
						
				  case 10: img = new Image("/application/ressource/EauSable.png");	
							break;
						
				  case 11: img = new Image("/application/ressource/Grille.png");	
							break;
								
				  case 12: img = new Image("/application/ressource/Herbe2.png");	
							break;
						
				  case 13: img = new Image("/application/ressource/1Cote1.4.png");	
							break;
						
				  case 14: img = new Image("/application/ressource/1Chemin.png");	
							break;
						
				  case 15: img = new Image("/application/ressource/1Cote1.2.png");	
							break;
						
				  case 16: img = new Image("/application/ressource/1Cote2.4.4.png");	
							break;
						
				  case 17: img = new Image("/application/ressource/1Cote3.4.png");	
							break;
						
				  case 18: img = new Image("/application/ressource/EauHerbeCote4.png");	
							break;
						
				  case 19: img = new Image("/application/ressource/EauPont.png");	
				  			break;
						
				  case 20: img = new Image("/application/ressource/RocheEau1.png");	
				  			break;
						
				  case 21: img = new Image("/application/ressource/EauHerbeBord1.png");	
				  			break;
						
				  case 22: img = new Image("/application/ressource/EauHerbeCoin3.png");	
							break;
						
				  case 23: img = new Image("/application/ressource/2Cote4.png");	
							break;
						
				  //case 24: img = new Image("/application/ressource/2Chemin.png");	
							//break;
						
				  //case 25: img = new Image("/application/ressource/2Bord1.png");	
							//break;
						
				  case 26: img = new Image("/application/ressource/Cathedrale13.png");	
							break;
					
				  case 27: img = new Image("/application/ressource/Cathedrale14.png");	
							break;
						
				  case 28: img = new Image("/application/ressource/Cathedrale15.png");	
							break;
						
				  case 29: img = new Image("/application/ressource/Cathedrale16.png");	
							break;
						
				  case 30: img = new Image("/application/ressource/BarriereHerbe1.png");	
							break;
						
				  case 31: img = new Image("/application/ressource/BarriereTerre.png");	
							break;
					
				  case 32: img = new Image("/application/ressource/BarriereEauHerbe.png");	
							break;
						
				  //case 33: img = new Image("/application/ressource/2Bord1.png");	
							//break;
						
				  case 34: img = new Image("/application/ressource/2Coin1.png");	
				  			break;
						
				  case 35: img = new Image("/application/ressource/PontSimple.png");	
							break;
						
				  case 36: img = new Image("/application/ressource/Cathedrale8.png");	
							break;
						
				  case 37: img = new Image("/application/ressource/Cathedrale9.png");	
							break;
						
				  case 38: img = new Image("/application/ressource/Cathedrale10.png");	
							break;
					
				  case 39: img = new Image("/application/ressource/Cathedrale11.png");	
								break;
					
				  case 40: img = new Image("/application/ressource/Cathedrale12.png");	
							break;
						
				  //case 41: img = new Image("/application/ressource/2Bord1.png");	
							//break;
						
				  case 42: img = new Image("/application/ressource/1Coin1.1.png");	
							break;
								
				  case 43: img = new Image("/application/ressource/1Cote1.1.png");	
							break;
						
				  case 44: img = new Image("/application/ressource/1Bord1.3.png");	
							break;
						
				  case 45: img = new Image("/application/ressource/1Bord1.4.png");	
							break;
						
				  case 46: img = new Image("/application/ressource/1Coin1.2.png");	
							break;
						
				  case 47: img = new Image("/application/ressource/PontHerbe5.png");	
							break;
					
				  case 48: img = new Image("/application/ressource/PontHerbe1.png");	
							break;
						
				  case 49: img = new Image("/application/ressource/PontEnveloppe1.png");	
							break;
						
				  case 50: img = new Image("/application/ressource/EauPontHaut1.png");	
							break;
						
				  case 51: img = new Image("/application/ressource/PontHerbe7.png");	
							break;
						
				  case 52: img = new Image("/application/ressource/Cathedrale3.png");	
							break;
						
				  case 53: img = new Image("/application/ressource/Cathedrale4.png");	
							break;
						
				  case 54: img = new Image("/application/ressource/Cathedrale5.png");	
							break;
						
				  case 55: img = new Image("/application/ressource/Cathedrale6.png");	
							break;
						
				  case 56: img = new Image("/application/ressource/Cathedrale7.png");	
							break;
						
				  case 57: img = new Image("/application/ressource/EauHerbeCote1.png");	
							break;
						
				  case 58: img = new Image("/application/ressource/1Bord1.1.png");	
							break;
						
				  case 59: img = new Image("/application/ressource/1Cote1.3.png");	
							break;
						
				  case 60: img = new Image("/application/ressource/1Coin1.3.png");	
							break;
						
				  case 61: img = new Image("/application/ressource/PontHerbe6.png");	
							break;
						
				  case 62: img = new Image("/application/ressource/2Cote4.png");	
							break;
						
				  case 63: img = new Image("/application/ressource/2Cote4.png");	
							break;
						
				  case 64: img = new Image("/application/ressource/PontEnveloppe2.png");	
							break;
						
				  case 65: img = new Image("/application/ressource/PontHerbe8.png");	
							break;
						
				  case 66: img = new Image("/application/ressource/Cathedrale1.png");	
				  			break;
							
				  case 67: img = new Image("/application/ressource/Cathedrale2.png");	
							break;
					
				  //case 68: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  case 69: img = new Image("/application/ressource/BarriereHerbe2.png");	
							break;
					
				  //case 70: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  case 71: img = new Image("/application/ressource/BarriereHerbe3.png");	
							break;
					
				  case 72: img = new Image("/application/ressource/2Coin4.png");	
							break;
					
				  //case 73: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  //case 74: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  //case 75: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  case 76: img = new Image("/application/ressource/Tour1.png");	
							break;
					
				  case 77: img = new Image("/application/ressource/Tour2.png");	
							break;
					
				  case 78: img = new Image("/application/ressource/Tour3.png");	
							break;
					
				  case 79: img = new Image("/application/ressource/Tour4.png");	
							break;
					
				  case 80: img = new Image("/application/ressource/Mur1.png");	
							break;
					
				  case 81: img = new Image("/application/ressource/Porte.png");	
							break;
					
				  case 82: img = new Image("/application/ressource/Mur2.png");	
							break;
					
				  case 83: img = new Image("/application/ressource/Tour5.png");	
							break;
					
				  case 84: img = new Image("/application/ressource/Tour6.png");	
							break;
					
				  case 85: img = new Image("/application/ressource/1Cote2.4.png");	
							break;
					
				  case 86: img = new Image("/application/ressource/EauHerbeCote3.png");	
							break;
					
				  case 87: img = new Image("/application/ressource/HerbeSable1.png");	
							break;
					
				  case 88: img = new Image("/application/ressource/HerbeSable3.png");	
							break;
					
				  case 89: img = new Image("/application/ressource/HerbeSable2.png");	
							break;
					
				  case 90: img = new Image("/application/ressource/Tour7.png");	
							break;
					
				  case 91: img = new Image("/application/ressource/Tour8.png");	
							break;
					
				  case 92: img = new Image("/application/ressource/EauHerbeCote2.png");	
							break;
					
				  case 93: img = new Image("/application/ressource/2Coin1.png");	
							break;
					
				  case 94: img = new Image("/application/ressource/2Cote1.png");	
							break;
					
				  case 95: img = new Image("/application/ressource/2Coin2.png");	
							break;
							
				  case 96: img = new Image("/application/ressource/BarriereEau.png");	
							break;
					
				  case 97: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							break;
					
				  case 98: img = new Image("/application/ressource/1Cote1.4.png");	
							break;
					
				  case 99: img = new Image("/application/ressource/1Chemin.png");	
							break;
					
				  case 100: img = new Image("/application/ressource/1Cote1.2.png");	
							break;
					
				  //case 101: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  case 102: img = new Image("/application/ressource/1Coin1.4.png");	
							break;
					
				  case 103: img = new Image("/application/ressource/1Bord1.2.png");	
							break;
					
				  case 104: img = new Image("/application/ressource/2Bord3.png");	
				  			break;
					
				  case 105: img = new Image("/application/ressource/2Chemin.png");	
							break;
					
				  case 106: img = new Image("/application/ressource/2Cote2.png");	
							break;
					
				 // case 107: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  case 108: img = new Image("/application/ressource/2Cote1.png");	
							break;
					
				  //case 109: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  case 110: img = new Image("/application/ressource/2Cote4.png");	
							break;
					
				  //case 111: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  //case 112: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  case 113: img = new Image("/application/ressource/2Bord1.png");	
							break;
					
				  case 114: img = new Image("/application/ressource/2Cote3.png");	
							break;
					
				  case 115: img = new Image("/application/ressource/2Coin3.png");	
							break;
					
				 // case 116: img = new Image("/application/ressource/EauHerbeCoin4.png");	
				  			//break;
							
				  case 117: img = new Image("/application/ressource/2Cote3.png");	
							break;
					
				  //case 118: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  case 119: img = new Image("/application/ressource/EauHerbeCoin1.png");	
							break;
					
				  case 120: img = new Image("/application/ressource/EauHerbeCote1.png");	
							break;
					
				  case 121: img = new Image("/application/ressource/EauHerbeCoin2.png");	
							break;
					
				  //case 122: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  //case 123: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  //case 124: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  //case 125: img = new Image("/application/ressource/EauHerbeCoin4.png");	
							//break;
					
				  case 126: img = new Image("/application/ressource/EauHerbeBord4.png");	
							break;
					
				  case 127: img = new Image("/application/ressource/EauHerbeBord3.png");	
							break;
					
				  case 128: img = new Image("/application/ressource/2Coin3.png");	
							break;
					
				  case 129: img = new Image("/application/ressource/1Cote2.1.png");	
							break;
					
				  case 130: img = new Image("/application/ressource/1Coin2.3.png");	
				  			break;
					
				  case 131: img = new Image("/application/ressource/EauHerbeBord2.png");	
							break;
					
				  case 132: img = new Image("/application/ressource/1Cote3.1.png");	
							break;
					
				  case 133: img = new Image("/application/ressource/RocheEau2.png");	
							break;
					
				  case 134: img = new Image("/application/ressource/2Bord4.png");	
							break;
					
				  case 135: img = new Image("/application/ressource/Coquillage.png");	
							break;
					
				  case 136: img = new Image("/application/ressource/EauPontHaut1.png");	
							break;
							
				  //case 137: img = new Image("/application/ressource/2Chemin.png");	
							//break;
					
				  case 138: img = new Image("/application/ressource/Etoile.png");	
							break;
							
				  case 139: img = new Image("/application/ressource/2Coin4.png");	
							break;		
					
				  case 140: img = new Image("/application/ressource/2Bord2.png");	
							break;
					
				  case 141: img = new Image("/application/ressource/EauPontBas1.png");	
							break;
					
				  case 142: img = new Image("/application/ressource/SableCoin1.png");	
							break;
					
				  case 143: img = new Image("/application/ressource/SableCote1.png");	
							break;
					
				  case 144: img = new Image("/application/ressource/SableCoin2.png");	
							break;
					
				  case 145: img = new Image("/application/ressource/Barriere1.png");	
							break;
					
				  case 146: img = new Image("/application/ressource/SableCote4.png");	
							break;
					
				  case 147: img = new Image("/application/ressource/Sable.png");	
							break;
					
				  case 148: img = new Image("/application/ressource/SableBord4.png");	
							break;
					
				  case 149: img = new Image("/application/ressource/RocheEau3.png");	
				  			break;
					
				  case 150: img = new Image("/application/ressource/SableBord3.png");	
							break;
					
				  case 151: img = new Image("/application/ressource/RocherCoin1.png");	
							break;
					
				  case 152: img = new Image("/application/ressource/RocherCote1.png");	
							break;
					
				  case 153: img = new Image("/application/ressource/RocherCoin2.png");	
							break;
					
				  case 154: img = new Image("/application/ressource/RocherCote4.png");	
				  			break;
					
				  case 155: img = new Image("/application/ressource/RocherToit.png");	
							break;
					
				  case 156: img = new Image("/application/ressource/RocherCote2.png");	
							break;
					
				  case 157: img = new Image("/application/ressource/RocherCoin2.1.png");	
							break;
					
				  case 158: img = new Image("/application/ressource/RocherCote2.1.png");	
							break;
					
				  case 159: img = new Image("/application/ressource/RocherCoin2.2.png");	
							break;
					
				  case 160: img = new Image("/application/ressource/RocherCoin4.png");	
							break;
					
				  case 161: img = new Image("/application/ressource/RocherCote3.png");	
							break;
					
				  case 162: img = new Image("/application/ressource/RocherCoin3.png");	
							break;
					
				  case 163: img = new Image("/application/ressource/RocherCote2.4.png");	
							break;
					
				  case 164: img = new Image("/application/ressource/RocherCote2.2.png");	
							break;
					
				  case 165: img = new Image("/application/ressource/RocheSable.png");	
							break;
					
				  case 166: img = new Image("/application/ressource/SableCote2.png");	
							break;
					
				  case 167: img = new Image("/application/ressource/2Coin2.png");	
							break;
					
				  case 168: img = new Image("/application/ressource/EscalierGauche.png");	
							break;
					
				  case 169: img = new Image("/application/ressource/ArbreHaut.png");	
							break;
					
				  case 170: img = new Image("/application/ressource/ArbreBas.png");	
				  			break;
					
				  case 171: img = new Image("/application/ressource/EauCoin1.png");	
							break;
					
				  case 172: img = new Image("/application/ressource/EauCote1.png");	
							break;
					
				  case 173: img = new Image("/application/ressource/EauCoin2.png");	
							break;
					
				  case 174: img = new Image("/application/ressource/RocherCoin2.4.png");	
							break;
					
				  case 175: img = new Image("/application/ressource/RocherCote2.3.png");	
							break;
					
				  case 176: img = new Image("/application/ressource/RocherCoin2.3.png");	
							break;
					
				  case 177: img = new Image("/application/ressource/EauCote4.png");	
							break;
					
				  case 178: img = new Image("/application/ressource/EauSable.png");	
							break;
					
				  case 179: img = new Image("/application/ressource/EauBord4.png");	
				  			break;
					
				  case 180: img = new Image("/application/ressource/EauBord1.png");	
							break;
					
				  case 181: img = new Image("/application/ressource/EauCote3.png");	
							break;
					
				  case 182: img = new Image("/application/ressource/EauCoin3.png");	
							break;
					
				  case 183: img = new Image("/application/ressource/SableBord1.png");	
							break;
					
				  case 184: img = new Image("/application/ressource/SableCoin3.png");	
							break;
					
				  case 185: img = new Image("/application/ressource/ForetCoin1.png");	
							break;
					
				  case 186: img = new Image("/application/ressource/ForetCoin2.png");	
							break;
					
				  case 187: img = new Image("/application/ressource/EauCote2.png");	
							break;
					
				  case 188: img = new Image("/application/ressource/SableCote3.png");	
							break;
					
				  case 189: img = new Image("/application/ressource/SableBord2.png");	
							break;
					
				  case 190: img = new Image("/application/ressource/ForetCote2.4.png");	
							break;
					
				  case 191: img = new Image("/application/ressource/ForetCote2.2.png");	
							break;
					
				  case 192: img = new Image("/application/ressource/SableCoin4.png");	
							break;
					
				  case 193: img = new Image("/application/ressource/ForetCote2.1.png");	
							break;
					
				  case 194: img = new Image("/application/ressource/ForetCote1.1.png");	
							break;
					
				  case 195: img = new Image("/application/ressource/ForetBord3.png");	
							break;
					
				  case 196: img = new Image("/application/ressource/ForetBord4.png");	
							break;
					
				  case 197: img = new Image("/application/ressource/ForetChemin.png");	
							break;
					
				  case 198: img = new Image("/application/ressource/ForetBord1.png");	
							break;
					
				  case 199: img = new Image("/application/ressource/ForetCote1.3.png");	
							break;
					
				  case 200: img = new Image("/application/ressource/ForetBord2.png");	
							break;
					
				  case 201: img = new Image("/application/ressource/ForetCote2.3.png");	
							break;
					
				  case 202: img = new Image("/application/ressource/ForetCoin3.png");	
							break;
							
				  case 203: img = new Image("/application/ressource/Herbe3.png");	
							break;
					
				  case 204: img = new Image("/application/ressource/ForetCote1.2.png");	
							break;
					
				  case 205: img = new Image("/application/ressource/ForetCote1.4.png");	
							break;
					
				  case 206: img = new Image("/application/ressource/ForetCoin1.png");	
							break;
					
				  case 207: img = new Image("/application/ressource/ForetCoin2.png");	
							break;
					
				  case 208: img = new Image("/application/ressource/EauCoin4.png");	
							break;
					
				  case 209: img = new Image("/application/ressource/ForetBord3.png");	
							break;
					
				  case 210: img = new Image("/application/ressource/ForetBord4.png");	
							break;
					
				  case 211: img = new Image("/application/ressource/ForetBord1.png");	
							break;
					
				  case 212: img = new Image("/application/ressource/ForetBord2.png");	
							break;
					
				  case 213: img = new Image("/application/ressource/PontEnveloppe3.png");	
							break;
					
				  case 214: img = new Image("/application/ressource/ForetCoin3.png");	
							break;
					
				  case 215: img = new Image("/application/ressource/ForetCoin4.png");	
							break;
							
				  case 216: img = new Image("/application/ressource/PontHerbe2.png");	
							break;
							
				  case 217: img = new Image("/application/ressource/1Coin3.3.png");	
				  			break;
				  			
				  case 218: img = new Image("/application/ressource/EauBord2.png");	
								break;
								
				  case 219: img = new Image("/application/ressource/Chateau28.png");	
							break;
					
				  case 220: img = new Image("/application/ressource/Chateau27.png");	
							break;
					
				  case 221: img = new Image("/application/ressource/Chateau26.png");	
							break;
					
				  case 222: img = new Image("/application/ressource/Chateau25.png");	
							break;
					
				  case 223: img = new Image("/application/ressource/Chateau24.png");	
							break;
						
				  case 224: img = new Image("/application/ressource/Chateau23.png");	
							break;
					
				  case 225: img = new Image("/application/ressource/Chateau22.png");	
							break;
					
				  case 226: img = new Image("/application/ressource/Chateau21.png");	
							break;
					
				  case 227: img = new Image("/application/ressource/Chateau20.png");	
							break;
					
				  case 228: img = new Image("/application/ressource/Chateau19.png");	
							break;
					
				  case 229: img = new Image("/application/ressource/Chateau18.png");	
							break;
					
				  case 230: img = new Image("/application/ressource/Chateau17.png");	
							break;
					
				  case 231: img = new Image("/application/ressource/Chateau16.png");	
				  			break;
					
				  case 232: img = new Image("/application/ressource/Chateau15.png");	
							break;
					
				  case 233: img = new Image("/application/ressource/Chateau14.png");	
							break;
					
				  case 234: img = new Image("/application/ressource/Chateau13.png");	
							break;
					
				  case 235: img = new Image("/application/ressource/Chateau12.png");	
							break;
					
				  case 236: img = new Image("/application/ressource/Chateau11.png");	
							break;
					
				  case 237: img = new Image("/application/ressource/Chateau10.png");	
							break;
					
				  case 238: img = new Image("/application/ressource/Chateau9.png");	
							break;
					
				  case 239: img = new Image("/application/ressource/Chateau8.png");	
							break;
					
				  case 240: img = new Image("/application/ressource/Chateau7.png");	
							break;
					
				  case 241: img = new Image("/application/ressource/Chateau6.png");	
							break;
					
				  case 242: img = new Image("/application/ressource/Chateau5.png");	
							break;
					
				  case 243: img = new Image("/application/ressource/Chateau4.png");	
							break;
					
				  case 244: img = new Image("/application/ressource/Chateau3.png");	
							break;
					
				  case 245: img = new Image("/application/ressource/Chateau2.png");	
							break;
					
				  case 246: img = new Image("/application/ressource/Chateau1.png");	
							break;
							
				  //FIN CALQUE 1
							
				  case 250: img = new Image("/application/ressource/C2Barriere3.1.png");	
							break;
			
				  case 251: img = new Image("/application/ressource/C2Barriere1.1.png");	
				  			break;
			
				  //case 252: img = new Image("/application/ressource/.png");	
				  		//break;
			
				  case 253: img = new Image("/application/ressource/C2Barriere3.4.png");	
				  			break;
				
				  case 254: img = new Image("/application/ressource/C2Barriere1.4.png");	
							break;
			
				  case 255: img = new Image("/application/ressource/C2Barriere2.4.png");	
							break;
			
				  case 256: img = new Image("/application/ressource/C2Barriere2.1.png");	
				  			break;
			
				//case 257: img = new Image("/application/ressource/.png");	
					//break;
			
				  case 258: img = new Image("/application/ressource/C2Buisson.png");	
				  			break;
			
				  case 259: img = new Image("/application/ressource/C2Barriere2.2.png");	
				  			break;
			
				  case 260: img = new Image("/application/ressource/C2Barriere1.2.png");	
							break;
			
				  case 261: img = new Image("/application/ressource/C2Coffre2.2.png");	
							break;
			
				  case 262: img = new Image("/application/ressource/C2Coffre2.3.png");	
							break;
			
				  case 263: img = new Image("/application/ressource/C2Coffre2.4.png");	
							break;
			
				  case 264: img = new Image("/application/ressource/C2Coffre2.6.png");	
							break;
			
				  case 265: img = new Image("/application/ressource/C2Coffre2.7.png");	
							break;
			
				  case 266: img = new Image("/application/ressource/C2Coffre2.8.png");	
							break;
			
				  case 267: img = new Image("/application/ressource/C2Coffre2.10.png");	
							break;
			
				  case 268: img = new Image("/application/ressource/C2Coffre2.11.png");	
							break;
			
				  case 269: img = new Image("/application/ressource/C2Coffre2.12.png");	
							break;
			
				  case 270: img = new Image("/application/ressource/C2Barriere2.3.png");	
							break;
			
				  case 271: img = new Image("/application/ressource/C2Barriere1.3.png");	
							break;
			
				  case 272: img = new Image("/application/ressource/C2Barriere3.3.png");	
							break;
			
				  case 273: img = new Image("/application/ressource/C2Barriere3.2.png");	
							break;
			
				  case 274: img = new Image("/application/ressource/C2Coffre2.1.png");	
							break;
			
				  case 275: img = new Image("/application/ressource/C2Coffre2.2.png");	
							break;
			
				  case 276: img = new Image("/application/ressource/C2Coffre2.3.png");	
							break;
			
				  case 277: img = new Image("/application/ressource/C2Coffre2.4.png");	
							break;
			
				  case 278: img = new Image("/application/ressource/C2Coffre2.5.png");	
							break;
			
				  case 279: img = new Image("/application/ressource/C2Coffre2.6.png");	
							break;
			
				  case 280: img = new Image("/application/ressource/C2Coffre2.7.png");	
							break;
			
				  case 281: img = new Image("/application/ressource/C2Coffre2.8.png");	
							break;
			
				  case 282: img = new Image("/application/ressource/C2Coffre2.9.png");	
							break;
			
				  case 283: img = new Image("/application/ressource/C2Coffre2.10.png");	
							break;
			
				  case 284: img = new Image("/application/ressource/C2Coffre2.11.png");	
							break;
			
				  case 285: img = new Image("/application/ressource/C2Coffre2.12.png");	
							break;
			
				  case 286: img = new Image("/application/ressource/C2Coffre1.1.png");	
							break;
			
				  case 287: img = new Image("/application/ressource/C2Coffre1.2.png");	
							break;
			
				  case 288: img = new Image("/application/ressource/C2Coffre1.3.png");	
							break;
			
				  case 289: img = new Image("/application/ressource/C2Coffre1.4.png");	
							break;
			
				  case 290: img = new Image("/application/ressource/C2Coffre1.5.png");	
							break;
			
				  case 291: img = new Image("/application/ressource/C2Coffre1.6.png");	
							break;
					
				  case 292: img = new Image("/application/ressource/C2Coffre1.7.png");	
							break;
			
				  case 293: img = new Image("/application/ressource/C2Coffre1.8.png");	
							break;
			
				  case 294: img = new Image("/application/ressource/C2Coffre1.9.png");	
							break;
			
				  case 295: img = new Image("/application/ressource/C2Coffre1.10.png");	
							break;
			
				  case 296: img = new Image("/application/ressource/C2Coffre1.11.png");	
							break;
			
				  case 297: img = new Image("/application/ressource/C2Coffre1.12.png");	
							break;
										
						
				  default : img = new Image("/application/ressource/Herbe1.png");	
				  			break;
					
        		}               
                ImageView v1 = new ImageView(img);
                tp.getChildren().add(v1);
        	}
        }
    }
    
 
}