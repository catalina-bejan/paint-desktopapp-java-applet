package egc;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class FormeRectang extends Applet {

    Rectangle2D chenar = new Rectangle2D.Double(5, 5, 360, 155),
            dr1 = new Rectangle2D.Double(15, 15, 60, 50);
    RoundRectangle2D dr2 = new RoundRectangle2D.Double(100, 15, 80, 50, 30, 20);
    Ellipse2D elipsa = new Ellipse2D.Double(200, 15, 80, 50);
    Arc2D arc = new Arc2D.Double(260, 15, 80, 50, -20, 120, Arc2D.PIE);

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(chenar);
        /*Desenare formelor sub forma de contur*/
        g2d.draw(dr1);
        g2d.draw(dr2);
        g2d.draw(elipsa);
        g2d.draw(arc);
        /*Translatarea axelor de coordonate si schimbarea culorii*/
        g2d.translate(0, 80);
        g2d.setColor(Color.gray);
        /*Denesarea formelor umplute cu culoarea Color.gray*/
        g2d.fill(dr1);
        g2d.fill(dr2);
        g2d.fill(elipsa);
        g2d.fill(arc);
    }

}
