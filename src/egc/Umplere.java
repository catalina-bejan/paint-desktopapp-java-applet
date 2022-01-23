package egc;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class Umplere extends Applet {
    
    Shape dreptunghi = new Rectangle2D.Float(20, 20, 80, 60);
    Stroke still = new BasicStroke(3);
    Paint gradient1 = new GradientPaint(20, 20, Color.black, 100, 800, Color.white);
    Paint gradient2 = new GradientPaint(20, 20, Color.black, 47, 40, Color.white, true);
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(new Rectangle2D.Float(5, 5, 360, 100));
        g2d.setStroke(still);
        g2d.setPaint(Color.lightGray);
        g2d.fill(dreptunghi);
        g2d.setPaint(Color.black);
        g2d.draw(dreptunghi);
        g2d.translate(120, 0);
        g2d.setPaint(gradient1);
        g2d.fill(dreptunghi);
        g2d.setColor(Color.black);
        g2d.draw(dreptunghi);
        g2d.translate(120, 0);
        g2d.setPaint(gradient2);
        g2d.fill(dreptunghi);
        g2d.setColor(Color.black);
        g2d.draw(dreptunghi);
    }
}
