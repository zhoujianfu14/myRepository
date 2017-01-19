package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;

class gamepanel extends Panel implements Runnable,KeyListener{
	Toolkit tk=Toolkit.getDefaultToolkit();
	Image bj=tk.createImage(getClass().getResource("bg.png"));
	Image fj=tk.createImage(getClass().getResource("plane.png"));
	Image zd=tk.createImage(getClass().getResource("bullet.png"));
	int fx=120;
	int fy=180;
	int nums =15;
	Random r=new Random();
	int up,left,down,right;
	double[] cos=new double[nums];
	double[] sin=new double[nums];
	int[] zx =new int[nums]; 
	int[] zy =new int[nums];
	int alive=1;
	long start;
	long end;
	int hp=100;
	
	
	public  gamepanel(){
		for(int i=0;i<nums;i++){
			init(i);
		}	
	}
	
	public void init(int i){
		int fx=r.nextInt(4);
		if(fx==0){
			zx[i]=r.nextInt(240);
			zy[i]=0;
		}
		else if(fx==1){
			zx[i]=0;
			zy[i]=r.nextInt(320);
		}
		else if(fx==2){
			zx[i]=r.nextInt(240);
			zy[i]=320;
		}
		else if(fx==3){
			zx[i]=240;
			zy[i]=r.nextInt(320);
		}
		int dx=fx-zx[i];
		int dy=fy-zy[i];
		double dline=Math.sqrt(dx*dx+dy*dy);
		cos[i]=dx/dline;
		sin[i]=dy/dline;
	}
	
	public void run(){
		start=System.currentTimeMillis();
		while(alive==1){
			fjmove();
			zdmove();
			pengzhuang();
			end=System.currentTimeMillis();
			repaint();
			try{
				Thread.sleep(40);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void pengzhuang(){
		for(int i=0;i<nums;i++){
			if(zx[i]+5>fx&&fx+15>zx[i]&&zy[i]+5>fy&&fy+15>zy[i]){
				hp=hp-20;
				init(i);
				if(hp<0){
				alive=0;
				}
			}
		}
	}
	
	public void fjmove(){
		if(up==1){
			fy=fy-5;
			if(fy<0){
				fy=0;
			}
		}
		if(left==1){
			fx=fx-5;
			if(fx<0){
				fx=0;
			}
		}
		if(down==1){
			fy=fy+5;
			if(fy>260){
				fy=260;
			}
		}
		if(right==1){
			fx=fx+5;
			if(fx>205){
				fx=205;
			}
		}
	}
	
	public void zdmove(){
		for(int i=0;i<nums;i++){
			zx[i]=(int)(zx[i]+5*cos[i]);
			zy[i]=(int)(zy[i]+5*sin[i]);
			if(zx[i]<0||zx[i]>240||zy[i]<0||zy[i]>320){
				init(i);
			}
		}	
	}
	
	public void paint(Graphics g){
		Image tmp=createImage(240,320);
		Graphics g1=tmp.getGraphics();
		g1.drawImage(bj, 0, 0, this);
		if(alive==1)
			g1.drawImage(fj, fx, fy, fx+15, fy+15, 0, 0, 15, 15, this);
		else
			g1.drawImage(fj, fx, fy, fx+15, fy+15, 15, 0, 30, 15, this);
		for(int i=0;i<nums;i++){
			g1.drawImage(zd, zx[i], zy[i], this);
		}
		if(alive==0){
			g1.drawString("GAME OVER", 80, 60);
		}
		g1.setColor(Color.white);
		g1.drawString((end-start)/1000.0+"", 160, 20);
		g1.setColor(Color.yellow);
		g1.fillRect(-1, 15, hp, 15);
		g1.setColor(Color.green);
		g1.drawRect(-1, 15, 100, 15);
		g.drawImage(tmp, 0, 0, this);
	}
	
	public void keyPressed(KeyEvent e) {
		int a=e.getKeyCode();
		if(a==KeyEvent.VK_UP){
			up=1;
		}
		if(a==KeyEvent.VK_DOWN){
			down=1;
		}
		if(a==KeyEvent.VK_LEFT){
			left=1;
		}
		if(a==KeyEvent.VK_RIGHT){
			right=1;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int a=e.getKeyCode();
		if(a==KeyEvent.VK_UP){
			up=0;
		}
		if(a==KeyEvent.VK_DOWN){
			down=0;	
		}
		if(a==KeyEvent.VK_LEFT){
			left=0;	
		}
		if(a==KeyEvent.VK_RIGHT){
			right=0;
		}
	}
	
	public void keyTyped(KeyEvent e) {
	
	}
}

public class game{
	public static void main(String[] args){
		JFrame win = new JFrame();
		win.setTitle("game");
		win.setSize(240,320);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamepanel s = new gamepanel();
		win.add(s);
		win.addKeyListener(s);
		win.setVisible(true);
		new Thread(s).start();
	}
}



