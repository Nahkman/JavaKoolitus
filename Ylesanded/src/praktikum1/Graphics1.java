package praktikum1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Graphics1 extends Applet{
	
	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillRect(0,0,100,100);
	}

}
