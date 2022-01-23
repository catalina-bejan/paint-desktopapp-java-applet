package egc;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;

public class Textura extends Applet {

    Rectangle dreptunghi = new Rectangle(20, 20, 100, 80);
    Ellipse2D elipsa = new Ellipse2D.Float(160, 20, 100, 80);
    Paint textura;

    @Override
    public void init() {
        // Se creaza zona tampon pentru imaginea bimg
        BufferedImage bimg = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);

        // Se creaza contextul grafic al zonei tampon bg2d
        Graphics2D bg2d = bimg.createGraphics();

        // Se creaza dreptunghiul suport
        Rectangle suport = new Rectangle(0, 0, 10, 10);

        // Se deseneaza in zona tampon un cerc gri cu contur negru
        Ellipse2D cerc = new Ellipse2D.Float(1, 1, 9, 9);
        bg2d.setColor(Color.white);
        bg2d.fill(suport); // culoarea de fond a suportului
        bg2d.setColor(Color.lightGray);
        bg2d.fill(cerc); // umplerea cercului
        bg2d.setColor(Color.black);
        bg2d.draw(cerc); // desenarea conturului cercului

        // Se creaza textura, proiectand zona tampon bimg pe dreptunghiul suport, care se va repeta ciclic
        textura = new TexturePaint(bimg, suport);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(8, 8, 280, 110);
        g2d.setPaint(textura);
        g2d.fill(dreptunghi);
        g2d.fill(elipsa);
        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(3));
        g2d.draw(dreptunghi);
        g2d.draw(elipsa);
    }
}
