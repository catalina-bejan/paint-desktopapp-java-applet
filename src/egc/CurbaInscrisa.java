package egc;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class CurbaInscrisa extends Applet {
    
    float[] ppx = {10.0f, 30.0f, 80.0f, 100.0f, 10.0f},
            ppy = {60.0f, 10.0f, 10.0f, 80.0f, 60.0f},
            pcx = new float[4],
            pcy = new float[4];
    GeneralPath patrulater = new GeneralPath(),
            curbaInscrisa = new GeneralPath(),
            figuraCompusa;
    
    @Override
    public void init() {
        // Se calculeaza coordonatele capetelor arcelor
        for (int i = 0; i < 4; i++) {
            pcx[i] = (ppx[i] + ppx[i + 1]) / 2;
            pcy[i] = (ppy[i] + ppy[i + 1]) / 2;
        }
        // Se construiesc figurile
        patrulater.moveTo(ppx[0], ppy[0]);
        for (int i = 1; i < 5; i++) {
            patrulater.lineTo(ppx[i], ppy[i]);
            curbaInscrisa.moveTo(pcx[3], pcy[3]);
        }
        for (int i = 0; i < 4; i++) {
            curbaInscrisa.quadTo(ppx[i], ppy[i], pcx[i], pcy[i]);
        }
        figuraCompusa = new GeneralPath(patrulater);
        figuraCompusa.append(curbaInscrisa, false);
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(new Rectangle2D.Float(2, 2, 360, 180));
        g2d.draw(patrulater);
        g2d.translate(120, 0);
        g2d.draw(curbaInscrisa);
        g2d.translate(120, 0);
        figuraCompusa.setWindingRule(GeneralPath.WIND_EVEN_ODD);
        
        g2d.draw(figuraCompusa);
        g2d.translate(-240, 90);
        g2d.draw(patrulater);
        g2d.fill(curbaInscrisa);
        g2d.translate(120, 0);
        g2d.setXORMode(Color.white);
        g2d.fill(patrulater);
        g2d.draw(curbaInscrisa);
        g2d.translate(120, 0);
        g2d.setPaintMode();
        g2d.fill(figuraCompusa);
    }
}
