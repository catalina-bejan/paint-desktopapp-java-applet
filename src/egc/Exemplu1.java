package egc;

import java.awt.*;
import java.applet.*;

public class Exemplu1 extends Applet {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRect(10, 20, 80, 40);
        g.fillRect(100, 20, 80, 40);
        g.drawRoundRect(190, 20, 80, 40, 15, 10);
        g.drawLine(105, 0, 175, 80);
        g.setXORMode(Color.white);
        g.drawLine(105, 80, 175, 0);
        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("Serif, PLAIN, 20, MOD XOR", 15, 50);
        g.setPaintMode();
        g.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 20));
        g.drawString("Serif, ITALIC BOLD, 20", 15, 100);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("SansSerif, PLAINT, 20", 15, 130);
        g.setFont(new Font("Monospaced", Font.PLAIN, 20));
        g.drawString("Monospaced, PLAIN, 20", 15, 120);
    }
}
