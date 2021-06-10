package application.modele;

public class Arme {
	
	private int attaque;
	private int defense;
	public static int ids = 0;
	private int id;
	
	public Arme(int a, int d) {
		ids++;
		id = ids;
		attaque = a;
		defense= d;
		System.out.println(id);
		}
 
	public int getPointAttaque() {
		return attaque;
		}
		
	public int getPointDefense() {
		return defense;
		}
	
	public int getId() {
		return this.id;
	}
	
	

}
