package egc;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class AriiCompuse extends Applet {

    Shape cerc1 = new Ellipse2D.Float(20, 20, 60, 60),
            cerc2 = new Ellipse2D.Float(50, 20, 60, 60);
    Area arie1 = new Area(cerc1),
            arie2 = new Area(cerc2),
            figComp[] = new Area[4];
    String s[] = {"a", "b", "c", "d"};

    @Override
    public void init() {
        for (int i = 0; i < 4; i++) {
            figComp[i] = (Area) arie1.clone();
        }
        figComp[0].add(arie2);
        figComp[1].subtract(arie2);
        figComp[2].intersect(arie2);
        figComp[3].exclusiveOr(arie2);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.draw(new Rectangle(8, 8, 420, 100));
        for (int i = 0; i < 4; i++) {
            g2d.setBackground(Color.white);
            g2d.setColor(Color.lightGray);
            g2d.fill(figComp[i]);
            g2d.setColor(Color.black);
            g2d.draw(cerc1);
            g2d.draw(cerc2);
            g2d.drawString(s[i], 60, 95);
            g2d.translate(100, 0);
        }
    }
}
