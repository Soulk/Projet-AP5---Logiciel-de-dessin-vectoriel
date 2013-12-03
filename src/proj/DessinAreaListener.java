package proj;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		this.pDepart = new Point(a.getLocationOnScreen());
	}

	public void mouseReleased(MouseEvent a) {
		this.pArrive = new Point(a.getLocationOnScreen());
		if (!view.getList().get(0).getSelectedItem()
				.equals("-choisir couleur-")
				&& !view.getList().get(1).getSelectedItem()
						.equals("-choisir forme-")) {
			Couleur c = new Couleur((String) view.getList().get(0).getSelectedItem());
		}
	}

}
