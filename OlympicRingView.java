import java.awt.Container;
import java.awt.*;
import javax.swing.JFrame;
public class OlympicRingView {
	public static void main(String[] args)
	   {
	      JFrame frame = new JFrame();
	      
	      final int FRAME_WIDTH = 200;
	      final int FRAME_HEIGHT = 150;

	      frame.setSize(200, 150);
	      frame.setTitle("OlympicRingViewer");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      P1egeoffroyOlympicRings component = new P1egeoffroyOlympicRings();
	      frame.add(component);

	      frame.setVisible(true);
	  }
}
