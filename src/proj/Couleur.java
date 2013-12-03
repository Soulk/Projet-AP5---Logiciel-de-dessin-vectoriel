package proj;

import java.awt.Color;

public class Couleur {
	String couleur;
	public Couleur(String couleur) {
		this.couleur = couleur;
	}
	
	public Color getCouleur() {
		if(couleur.equals("Bleu"))return Color.BLUE;
		if(couleur.equals("Rouge")) return Color.RED;
		if(couleur.equals("Jaune")) return Color.YELLOW;
		if(couleur.equals("Noir")) return Color.BLACK;
		if(couleur.equals("Vert")) return Color.GREEN;
		if(couleur.equals("Rose")) return Color.PINK;
		return null;
	}
}
