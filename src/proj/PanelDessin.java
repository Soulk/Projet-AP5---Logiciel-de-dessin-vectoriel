package proj;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelDessin extends JPanel{
	View v;
	Border loweredbevel = BorderFactory.createLoweredBevelBorder();
	public PanelDessin(View v) {
		this.v=v;
		setBorder(loweredbevel);
	}
	public void paint(Graphics g) {
		if (!v.forme.equals("")) {
			int p1X = (int) v.p1.getX();
			int p1Y = (int) v.p1.getY();
			int p2X = (int) v.p2.getX();
			int p2Y = (int) v.p2.getY();
			g.setColor(v.c.getCouleur());
			if(v.forme.equals("Rectangle")) g.fillRect(p1X, p1Y, Math.abs(p1X - p2X), Math.abs(p1Y - p2Y));
			if(v.forme.equals("Carre")) g.fillRect(p1X,p1Y,Math.abs(p1X - p2X),Math.abs(p1X - p2X));
			if(v.forme.equals("Rond")) g.fillOval(p1X,p1Y,Math.abs(p1X - p2X),Math.abs(p1X - p2X));
			if(v.forme.equals("Oval")) g.fillOval(p1X, p1Y, Math.abs(p1X - p2X), Math.abs(p1Y - p2Y));
		}
	}
}
