package MoveBall;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class MoveBall {
	public static void main(String[] args) {
		JFrame win = new JFrame();
		win.setTitle("MoveBall");
		win.setResizable(false);
		win.setSize(800,480);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ball s = new Ball();
		win.addMouseMotionListener(s);
		win.add(s);
		win.setVisible(true);
	}
}
class Ball extends JFrame implements MouseMotionListener{
	int x;
	int y;
	public Ball(){
		x=400;
		y=240;
	}
	public void paint(Graphics g){
		paint(g);
		g.setColor(Color.black);
		g.fillOval(x, y, 20, 20);
	}
	
	public void mouseDragged(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint();
		
	}
	
	public void mouseMoved(MouseEvent e) {	
	
	}
	
}

