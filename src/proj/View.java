package proj;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JPanel implements Observer {
	Model m;
	JFrame f1;
	JComboBox<String> jc;
	PanelDessin jp;
	ArrayList liste;
	Couleur c;
	String forme;
	Point p1, p2;

	public View(Model m) {
		this.m = m;
		this.c = null;
		this.forme = "";
		this.p1 = null;
		this.p2 = null;
		setPreferredSize(new Dimension(500, 450));
		// setLayout(new GridLayout(2,1));
		liste = new ArrayList<JComboBox<String>>();
		jp = new PanelDessin(this);
		jp.addMouseListener(new DessinAreaListener(this));
		jp.setPreferredSize(new Dimension(500, 400));
		add(jp);

		jc = new JComboBox<String>();
		jc.addItem("-choisir couleur-");
		jc.addItem("Bleu");
		jc.addItem("Rouge");
		jc.addItem("Rose");
		jc.addItem("Noir");
		jc.addItem("Vert");
		jc.addItem("Jaune");
		liste.add(jc); // indice 0 jcombobox couleur
		add(jc);

		jc = new JComboBox<String>();
		jc.addItem("-choisir forme-");
		jc.addItem("Rectangle");
		jc.addItem("Rond");
		jc.addItem("Carre");
		jc.addItem("Oval");
		jc.addItem("Ligne");
		liste.add(jc); // indice 1 jcombobox forme
		add(jc);

		liste.add(jp);// indice 2 jpanel ou s'affiche les formes
		

		this.f1 = new JFrame("View");
		f1.setContentPane(this);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.pack();
		// f1.setPreferredSize(new Dimension(900,900));
		f1.setVisible(true);
	}

	public ArrayList getList() {
		return liste;
	}

	public void setFormeCouleurPoint(String forme, Couleur c, Point p1, Point p2) {
		this.forme = forme;
		this.c = c;
		this.p1 = p1;
		this.p2 = p2;
	}

	public void update(Observable arg0, Object arg1) {

	}

	public static void main(String args[]) {
		View v = new View(null);
	}

}
