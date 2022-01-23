package egc;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class Scara extends Applet {

    Shape forma = new Rectangle2D.Float(8, 8, 20, 15);
    Paint gradient = new GradientPaint(28, 23, Color.black, 8, 8, Color.white);
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(new Rectangle(8, 8, 470, 80));
        g2d.draw(new Rectangle(8, 8, 470, 80));
        g2d.translate(-20, 20);
        g2d.setStroke(new BasicStroke(3));
        for (int i = 0; i < 4; i++) {
            g2d.scale(1.5, 1.2);
            g2d.translate(25, 0);
            g2d.setPaint(gradient);
            g2d.fill(forma);
            g2d.setPaint(Color.black);
            g2d.draw(forma);
        }
    }
}
