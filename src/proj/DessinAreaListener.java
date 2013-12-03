package proj;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;

public class DessinAreaListener implements MouseListener {
	View view;
	Point pDepart, pArrive;

	public DessinAreaListener(View v) {
		this.view = v;
	}

	public void mouseClicked(MouseEvent a) {
		// System.out.println(a.getLocationOnScreen().getX() + " " +
		// a.getLocationOnScreen().getY());

	}

	public void mouseEntered(MouseEvent a) {

	}

	public void mouseExited(MouseEvent a) {

	}

	public void mousePressed(MouseEvent a) {
		this.pDepart = new Point(a.getX(),a.getY());
	}

	public void mouseReleased(MouseEvent a) {
		this.pArrive = new Point(a.getX(),a.getY());
		if (!((JComboBox) view.getList().get(0)).getSelectedItem()
				.equals("-choisir couleur-")
				&& !((JComboBox) view.getList().get(1)).getSelectedItem()
						.equals("-choisir forme-")) {
			Couleur c = new Couleur( (String) ((JComboBox) view.getList().get(0)).getSelectedItem());
			controler();
			view.setFormeCouleurPoint((String) ((JComboBox) view.getList().get(1)).getSelectedItem(), c, this.pDepart, this.pArrive);
			view.repaint();
			((Component) view.getList().get(2)).repaint();
		}
	}
	public void controler() {
		int tmp;
		if(pDepart.getY()>pArrive.getY()) {
			tmp=(int) pArrive.getY();
			pArrive.setLocation(pArrive.getX(), pDepart.getY());
			pDepart.setLocation(pDepart.getX(),tmp);
		}
		if(pDepart.getX()>pArrive.getX()) {
			tmp=(int) pArrive.getX();
			pArrive.setLocation(pDepart.getX(), pArrive.getY());
			pDepart.setLocation(tmp,pDepart.getY());
		}
		
 	}

}
