import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.*;
import java.util.concurrent.*;

public class P1egeoffroyOlympicRings extends JComponent {
	//Prepare: Declare integers R, G, B. 
	//Input: no input
	//Process: Assign random integers to R, G, and B. Redefine R, G, and B for every new ring and for the title. Assign R, G, and B to new randomColor.  
	//Output: print out the five Olympic Rings, which change colors every time the program runs, and a title. 
	
	
	public void paintComponent(Graphics g)
	   {
	     Graphics2D g2 = (Graphics2D) g;
	     
	     int R, G, B;
	     
		 R = (int)(Math.random()*256);
		 G = (int)(Math.random()*256);
		 B = (int)(Math.random()*256);
		 Color randomColor = new Color(R, G, B); 
		 g.setColor(randomColor);
		 g.drawOval (1,0,50,50);	
	 
		 R = (int)(Math.random()*256);
		 G = (int)(Math.random()*256);
		 B = (int)(Math.random()*256);
		 Color randomColor1 = new Color(R, G, B); 
		 g.setColor(randomColor1);
		 g.drawOval (25,30,50,50); 
		 
		 R = (int)(Math.random()*256);
		 G = (int)(Math.random()*256);
		 B = (int)(Math.random()*256);
		 Color randomColor2 = new Color(R, G, B); 
		 g.setColor(randomColor2);
		 g.drawOval (51,0,50,50);
		 
		 R = (int)(Math.random()*256);
		 G = (int)(Math.random()*256);
		 B = (int)(Math.random()*256);
		 Color randomColor3 = new Color(R, G, B); 
		 g.setColor(randomColor3);
		 g.drawOval (75,30,50,50);
		 
		 R = (int)(Math.random()*256);
		 G = (int)(Math.random()*256);
		 B = (int)(Math.random()*256);
		 Color randomColor4 = new Color(R, G, B); 
		 g.setColor(randomColor4);
		 g.drawOval (101,0,50,50);
		 
		 R = (int)(Math.random()*256);
		 G = (int)(Math.random()*256);
		 B = (int)(Math.random()*256); 
		 Color randomColor5 = new Color(R, G, B); 
		 g.setColor(randomColor5);
		g.drawString("2018 OLYMPIC WINTER GAMES:", 0, 100); 
		g.drawString("PyeongChang", 45, 110);
		
		
	   }
	
	
}
