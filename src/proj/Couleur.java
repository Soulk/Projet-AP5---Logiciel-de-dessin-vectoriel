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
		return null;
	}
}
