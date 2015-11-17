package praktikum1;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * JÃ¤nese joonistamise nÃ¤ide
 * @author Mikk Mangus
 */
@SuppressWarnings("serial")
public class Janes extends Applet {
    
    private Graphics2D g;
	
    public void paint(Graphics g) {
        this.g = (Graphics2D) g;
        // Antialias teeb servad vÃ¤hem karvaseks
        this.g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        joonistaTaust();
        joonistaJanes();
    }
    
    /**
     * Katab tausta valgega
     */
    public void joonistaTaust() {
        int w = getWidth();
        int h = getHeight();
       
        for (int y = 0; y < h; y++) {
        	
//        	double zeroToOne = (double) y / h;
        	int tone = (int)((double) y / h * 255);
//        	System.out.println(zeroToOne);
        	
        	g.setColor(new Color(tone, tone, tone));
        	g.drawLine(0, y, w, y);
        }
 
    }
	/**Sama asi kasutades gradient painti
	 * 
	 * g.setPaint(new GradientPaint( new Point2D.Double(0, 0), Color.red, new
	 * Point2D.Double(w, h), Color.blue)); g.fillRect(0, 0, w, h);
	 */
    
    /**
     * Joonistab jÃ¤nese
     */
    public void joonistaJanes() {
        // pea
        g.setColor(Color.blue);
        g.fillOval(60, 50, 50, 50);
        
        // keha
        g.fillOval(50, 95, 75, 75);
            
        // k6rvad
        g.fillOval(60, 5, 23, 70);
        g.fillOval(88, 5, 23, 70);
        g.setColor(Color.white);
        g.fillOval(64, 10, 15, 45);
        g.fillOval(92, 10, 15, 45);
        
        // silmad
        g.setColor(Color.black);
        g.fillRect(70, 69, 5, 7);
        g.fillRect(95, 69, 5, 7);

        // tekst
        g.drawString("Hipsadi hopsadi!", 70, 190);
    }
	
}