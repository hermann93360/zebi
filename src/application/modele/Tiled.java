package application.modele;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;

public class Tiled {
	int [][] tab;
	
	public Tiled() {
		this.tab = new int[50][50];
		
	}
	public int [][] gettab(){
		return this.tab;
	}
	
	public int getValTab(int x, int y) {
		return this.tab[x][y];
	}

	public void LireMap() {
		int i=0;
		int j=0;
		StringTokenizer token; 
	 try {
	List<String> fileData = Files.readAllLines(Paths.get("src/application/ressource/MAP.txt"));
	
	for(String lignes : fileData) {
		token = new StringTokenizer(lignes, ",");
		
		while(token.hasMoreTokens()) {
			tab[i][j]=Integer.parseInt(token.nextToken().trim());
			j++;
		}
		j=0;
		i++;
	}
	
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	
	}
