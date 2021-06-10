package application.modele;

public class Arc extends Arme{
	private int fleche;

	public Arc() {
		super(20,20);
		this.fleche=30;
	}
	
	
	public void setFleche() {
		this.fleche--;
	}
	
	public int getFleche() {
		return this.fleche;
	}
	
	public String toString() {
		return "Arc";
	}
	
	

}
