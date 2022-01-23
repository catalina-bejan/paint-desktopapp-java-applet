package egc;

import java.awt.*;
import java.applet.*;

public class Exemplu3 extends Applet {
    
    int[]   xStea = new int[5], 
            yStea = new int[5], 
            xSin = new int[61], 
            ySin = new int[61];
    
    Image imagine;
    
    public void init() {
        imagine = getImage(getCodeBase(), "./javalogo52x88.gif");
        // Generarea varfurilor stelei
        double u = 2 * Math.PI / 5;
        for (int i = 0; i < 5; i++) {
            xStea[i] = (int) (30 * Math.sin(2 * i * u));
            yStea[i] = (int) (30 * Math.cos(2 * i * u));
        }

        //Generarea graficului functiei Math.sin(x)
        double dx = 2 * Math.PI / 60;
        for (int i = 0; i < 61; i++) {
            xSin[i] = i;
            ySin[i] = (int) (30 * (1 - Math.sin(i * dx)));
            
        }
    }
    
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRect(5, 5, 260, 150);
        g.translate(40, 40);
        g.drawPolygon(xStea, yStea, 5);
        g.translate(70, 0);
        g.fillPolygon(xStea, yStea, 5);
        g.drawImage(imagine, 80, -20, this);
        g.fillPolygon(xSin, ySin, 61);
        g.translate(-100, 40);
        g.drawPolygon(xSin, ySin, 61);
        g.translate(70, 0);
        g.fillPolygon(xSin, ySin, 61);
    }
}
