package Poker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.util.Random;

class gamepanel extends Panel{
	int fx,fy;
	Toolkit tk=Toolkit.getDefaultToolkit();
	Image p1=tk.createImage(getClass().getResource("1.gif"));
	Image p2=tk.createImage(getClass().getResource("2.gif"));
	Image p3=tk.createImage(getClass().getResource("3.gif"));	
	Image p4=tk.createImage(getClass().getResource("4.gif"));
	Image p5=tk.createImage(getClass().getResource("5.gif"));	
	Image p6=tk.createImage(getClass().getResource("6.gif"));
	Image p7=tk.createImage(getClass().getResource("7.gif"));
	Image p8=tk.createImage(getClass().getResource("8.gif"));	
	Image p9=tk.createImage(getClass().getResource("9.gif"));
	Image p10=tk.createImage(getClass().getResource("10.gif"));
	Image p11=tk.createImage(getClass().getResource("11.gif"));
	Image p12=tk.createImage(getClass().getResource("12.gif"));
	Image p13=tk.createImage(getClass().getResource("13.gif"));
	Image p14=tk.createImage(getClass().getResource("14.gif"));	
	Image p15=tk.createImage(getClass().getResource("15.gif"));
	Image p16=tk.createImage(getClass().getResource("16.gif"));	
	Image p17=tk.createImage(getClass().getResource("17.gif"));
	Image p18=tk.createImage(getClass().getResource("18.gif"));
	Image p19=tk.createImage(getClass().getResource("19.gif"));	
	Image p20=tk.createImage(getClass().getResource("20.gif"));
	Image p21=tk.createImage(getClass().getResource("21.gif"));
	Image p22=tk.createImage(getClass().getResource("22.gif"));
	Image p23=tk.createImage(getClass().getResource("23.gif"));
	Image p24=tk.createImage(getClass().getResource("24.gif"));
	Image p25=tk.createImage(getClass().getResource("25.gif"));	
	Image p26=tk.createImage(getClass().getResource("26.gif"));
	Image p27=tk.createImage(getClass().getResource("27.gif"));	
	Image p28=tk.createImage(getClass().getResource("28.gif"));
	Image p29=tk.createImage(getClass().getResource("29.gif"));
	Image p30=tk.createImage(getClass().getResource("30.gif"));	
	Image p31=tk.createImage(getClass().getResource("31.gif"));
	Image p32=tk.createImage(getClass().getResource("32.gif"));
	Image p33=tk.createImage(getClass().getResource("33.gif"));
	Image p34=tk.createImage(getClass().getResource("34.gif"));
	Image p35=tk.createImage(getClass().getResource("35.gif"));
	Image p36=tk.createImage(getClass().getResource("36.gif"));
	Image p37=tk.createImage(getClass().getResource("37.gif"));	
	Image p38=tk.createImage(getClass().getResource("38.gif"));
	Image p39=tk.createImage(getClass().getResource("39.gif"));	
	Image p40=tk.createImage(getClass().getResource("40.gif"));
	Image p41=tk.createImage(getClass().getResource("41.gif"));
	Image p42=tk.createImage(getClass().getResource("42.gif"));	
	Image p43=tk.createImage(getClass().getResource("43.gif"));
	Image p44=tk.createImage(getClass().getResource("44.gif"));
	Image p45=tk.createImage(getClass().getResource("45.gif"));
	Image p46=tk.createImage(getClass().getResource("46.gif"));
	Image p47=tk.createImage(getClass().getResource("47.gif"));
	Image p48=tk.createImage(getClass().getResource("48.gif"));	
	Image p49=tk.createImage(getClass().getResource("49.gif"));
	Image p50=tk.createImage(getClass().getResource("50.gif"));	
	Image p51=tk.createImage(getClass().getResource("51.gif"));
	Image p52=tk.createImage(getClass().getResource("52.gif"));
	Image p53=tk.createImage(getClass().getResource("53.gif"));	
	Image p54=tk.createImage(getClass().getResource("54.gif"));
	Image time=tk.createImage(getClass().getResource("timg.jpg"));
	public void postion(){
		Random r=new Random();
		fx=r.nextInt();
		fy=r.nextInt();
	} 
	public void paint(Graphics g){
		Image tmp=createImage(640,480);
		Graphics g1=tmp.getGraphics();
		g.drawImage(tmp, 0, 0, this);
		for(int i=1;i<18;i++){
			g.drawImage(p1, fx, fy, fx+52, fy+70, 0, 0, 104, 141, this);
		}
	}
	
}
public class Poker {
	public static void main(String[] args){
		
	}
}