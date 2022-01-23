package egc;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class Inclinare extends Applet {
    
    GeneralPath forma = new GeneralPath();
    Stroke stilLinie = new BasicStroke(2);
    
    @Override
    public void init() {
        forma.append(new Rectangle2D.Float(20, 20, 80, 60), false);
        forma.append(new Rectangle2D.Float(30, 30, 20, 20), false);
        forma.append(new Rectangle2D.Float(65, 50, 20, 20), false);
    }
    
	@Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(new Rectangle(8, 8, 300, 100));
        g2d.setStroke(stilLinie);
        g2d.draw(forma);
        g2d.translate(100, 0);
        g2d.shear(0.4, 0.1);
        g2d.draw(forma);
    }
}
