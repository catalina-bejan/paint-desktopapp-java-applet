package egc;

import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

public class StiluriLinii extends Applet {

    float[] intrerupta = {10, 3},
            unPunct = {10, 3, 3, 3},
            douaPuncte = {10, 3, 3, 3, 3};
    BasicStroke liniePlina = new BasicStroke(5),
            linieIntrerupta = new BasicStroke(5,
                    BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_MITER, 5, intrerupta, 0),
            liniePunct = new BasicStroke(5, BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_BEVEL, 5, unPunct, 0);
    GeneralPath linie = new GeneralPath();

    @Override
    public void init() {
        linie.moveTo(20, 20);
        linie.lineTo(180, 20);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(new Rectangle2D.Float(5, 5, 440, 160));
        g2d.draw(linie);
        g2d.drawString("Linie cu stilul implicit", 210, 25);
        g2d.translate(0, 20);
        g2d.setStroke(liniePlina);
        g2d.draw(linie);
        g2d.drawString("Linie plina grosime 5", 210, 25);
        g2d.translate(0, 20);
        g2d.setStroke(linieIntrerupta);
        g2d.draw(linie);
        g2d.drawString("Linie grosime 5, intrerupere {10,3}", 210, 25);
        g2d.translate(0, 20);
        g2d.setStroke(liniePunct);
        g2d.draw(linie);
        g2d.drawString("Linie grosime 5, intrerupere {10,3,3,3}", 210, 25);
        g2d.draw(new Rectangle2D.Float(20, 40, 160, 60));
        g2d.drawString("Dreptunghi trasat cu linie-punct", 210, 55);
    }

}
