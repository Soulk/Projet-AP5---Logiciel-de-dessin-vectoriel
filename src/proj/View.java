package proj;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JPanel implements Observer{
	Model m;
	JFrame f1;
	JComboBox jc;
	JPanel jp;
	ArrayList<JComboBox> liste;
	public View(Model m) {
		this.m=m;
		setPreferredSize(new Dimension(500,450));
		//setLayout(new GridLayout(2,1));
		liste = new ArrayList();
		jp = new JPanel();
		jp.addMouseListener(new DessinAreaListener(this));
		jp.setPreferredSize(new Dimension(500,400));
		jp.add(new JButton("blabla"));
		
		jc = new JComboBox();
		jc.addItem("-choisir couleur-");
		jc.addItem("Bleu");
		jc.addItem("Rouge");
		liste.add(jc); // indice 0 jcombobox couleur
		add(jc);
		
		jc = new JComboBox();
		jc.addItem("-choisir forme-");
		jc.addItem("Carre");
		jc.addItem("Rond");
		liste.add(jc); //indice 1 jcombobox forme
		add(jc);
		add(jp);
		
		this.f1 = new JFrame("View");
		f1.setContentPane(this);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.pack();
		//f1.setPreferredSize(new Dimension(900,900));
		f1.setVisible(true);
	}
	
	public void update(Observable arg0, Object arg1) {
		
	}
	
	public static void main(String args[]) {
		View v = new View(null);
	}

	public ArrayList<JComboBox> getList() {
		return liste;
	}
}
