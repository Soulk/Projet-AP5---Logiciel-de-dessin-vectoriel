package proj;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelDessin extends JPanel{
	View v;
	public PanelDessin(View v) {
		this.v=v;
	}
	public void paint(Graphics g) {
		if (!v.forme.equals("")) {
			int p1X = (int) v.p1.getX();
			int p1Y = (int) v.p1.getY();
			int p2X = (int) v.p2.getX();
			int p2Y = (int) v.p2.getY();
			g.setColor(v.c.getCouleur());
			g.fillRect(p1X-8, p1Y-36, Math.abs(p1X - p2X), Math.abs(p1Y - p2Y));
		}
	}
}
