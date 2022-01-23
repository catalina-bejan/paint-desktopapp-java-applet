package egc;

import java.awt.*;
import java.applet.*;

public class Exemplu2 extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setFont(new Font("SansSerif", Font.BOLD, 18));
        g.drawString("Un text scris pe fundal", 20, 40);
        g.drawRect(10, 10, 50, 80);
        g.drawRect(70, 10, 50, 80);
        g.drawRect(130, 10, 50, 80);
        g.setColor(new Color(200, 200, 200, 100));
        g.fillRect(10, 10, 50, 80);
        g.setColor(new Color(200, 200, 200, 150));
        g.fillRect(70, 10, 50, 80);
        g.setColor(new Color(200, 200, 200, 200));
        g.fillRect(130, 10, 50, 80);
        g.setColor(Color.black);
        g.drawString("Un text scris deasupra", 20, 70);

    }
}
