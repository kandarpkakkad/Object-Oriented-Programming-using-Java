import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class lab11a extends Applet implements MouseListener {
	int x = 0;
	int y = 0;
	public void init(){
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me){
		x = me.getX();
		y = me.getY();
		repaint();
	}
	public void paint(Graphics g){
		g.fillOval(x-50,y-50,100,100);
	}
	public void mousePressed(MouseEvent e){
		throw new UnsupportedOperationException("Not supported yet.");
	}
	public void mouseReleased(MouseEvent e) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	public void mouseEntered(MouseEvent e) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	public void mouseExited(MouseEvent e) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
