package CharGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CharGame {
  public static void main(String[] args){
	  JFrame win = new JFrame();
	  win.setSize(400, 600);
	  win.setTitle("字符游戏");
	  win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  CharPane c = new CharPane();
	  win.add(c);
	  win.addKeyListener(c);
	  win.setVisible(true);
	  c.run();//不合理
  }
}

class CharPane extends JPanel implements Runnable ,KeyListener{
	int[] xx ;//保存十个字符的行坐标
	int[] yy;//保存十个字符的纵坐标
	char[] cc;//保存十个随机的字符
	int score;//游戏的分数
	Random r = new Random();
	public CharPane(){
		xx= new int[10]; yy =new int[10]; cc= new char[10];
		score= 0;
		for(int i=0;i<10;i++){
			xx[i]= r.nextInt(350)+20;
			yy[i]= r.nextInt(100)+30;
			cc[i]=(char)(r.nextInt(26)+97);
		}
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Font font = g.getFont();//字体
		font	= new Font( font.getName(), Font.BOLD,26   );
		g.setFont(font);
		g.drawString("SCORE:"+score, 10, 25);
		for(int i=0;i<10;i++){
			g.drawString(""+cc[i], xx[i], yy[i]);
		}
		g.setColor(Color.RED);
		g.drawLine(0, 500, 400, 500);
	}
	
	public void run() {
		while(true){
			for(int i=0;i<10;i++){
				yy[i] = yy[i]+ r.nextInt(5);
				
				if(yy[i]>=500){//超过红线以后
					score = score -100;
					xx[i]= r.nextInt(350)+20;
					yy[i]= r.nextInt(100)+30;
					cc[i]=(char)(r.nextInt(26)+97);
				}
			}
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//毫秒
			repaint();	
		}
	}
	
	public void keyPressed(KeyEvent e) {
		char c = e.getKeyChar();
	
		for(int i=0;i<10;i++){
			if(c==cc[i]){
				score = score +100;
				xx[i]= r.nextInt(350)+20;
				yy[i]= r.nextInt(100)+30;
				cc[i]=(char)(r.nextInt(26)+97);
				break;
			}
		}
	}//可以不实现 ，放在这
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}                         
	
	
	
	
	
}
