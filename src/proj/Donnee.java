package proj;

public class Donnee {
	String forme;
	Couleur couleur;
	int p1x, p1y, p2x, p2y;
	public Donnee(String forme, Couleur couleur,int p1x,int p1y,int p2x, int p2y) {
		this.forme=forme;
		this.p1x=p1x;
		this.p1y=p1y;
		this.p2x=p2x;
		this.p2y=p2y;
		this.couleur = couleur;
	}
}
