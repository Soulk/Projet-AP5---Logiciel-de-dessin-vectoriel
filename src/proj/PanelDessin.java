package proj;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelDessin extends JPanel {
	View v;
	ArrayList<Donnee> listeDessin;

	public PanelDessin(View v) {
		this.v = v;
		listeDessin = new ArrayList();
	}

	public void paint(Graphics g) {
		if (!v.forme.equals("")) {
			int p1X = (int) v.p1.getX();
			int p1Y = (int) v.p1.getY();
			int p2X = (int) v.p2.getX();
			int p2Y = (int) v.p2.getY();
			listeDessin.add(new Donnee(v.forme, v.c, p1X, p1Y, p2X, p2Y));
			for (int i = 0; i < listeDessin.size(); i++) {
				g.setColor(listeDessin.get(i).couleur.getCouleur());
				if (listeDessin.get(i).forme.equals("Rectangle"))
					g.fillRect(listeDessin.get(i).p1x, listeDessin.get(i).p1y, Math.abs(listeDessin.get(i).p1x - listeDessin.get(i).p2x),
							Math.abs(listeDessin.get(i).p1y - listeDessin.get(i).p2y));
				if (listeDessin.get(i).forme.equals("Carre"))
					g.fillRect(listeDessin.get(i).p1x, listeDessin.get(i).p1y, Math.abs(listeDessin.get(i).p1x - listeDessin.get(i).p2x),
							Math.abs(listeDessin.get(i).p1x - listeDessin.get(i).p2x));
				if (listeDessin.get(i).forme.equals("Rond"))
					g.fillOval(listeDessin.get(i).p1x, listeDessin.get(i).p1y, Math.abs(listeDessin.get(i).p1x - listeDessin.get(i).p2x),
							Math.abs(listeDessin.get(i).p1x - listeDessin.get(i).p2x));
				if (listeDessin.get(i).forme.equals("Oval"))
					g.fillOval(listeDessin.get(i).p1x, listeDessin.get(i).p1y, Math.abs(listeDessin.get(i).p1x - listeDessin.get(i).p2x),
							Math.abs(listeDessin.get(i).p1y - listeDessin.get(i).p2y));
				if (listeDessin.get(i).forme.equals("Ligne"))
					g.drawLine(listeDessin.get(i).p1x, listeDessin.get(i).p1y,listeDessin.get(i).p2x, listeDessin.get(i).p2y);
			}
		}
	}
}
/*
g.setColor(v.c.getCouleur());
if (v.forme.equals("Rectangle"))
	g.fillRect(p1X, p1Y, Math.abs(p1X - p2X),
			Math.abs(p1Y - p2Y));
if (v.forme.equals("Carre"))
	g.fillRect(p1X, p1Y, Math.abs(p1X - p2X),
			Math.abs(p1X - p2X));
if (v.forme.equals("Rond"))
	g.fillOval(p1X, p1Y, Math.abs(p1X - p2X),
			Math.abs(p1X - p2X));
if (v.forme.equals("Oval"))
	g.fillOval(p1X, p1Y, Math.abs(p1X - p2X),
			Math.abs(p1Y - p2Y));
if (v.forme.equals("Ligne"))
	g.drawLine(p1X, p1Y, p2X, p2Y);*/