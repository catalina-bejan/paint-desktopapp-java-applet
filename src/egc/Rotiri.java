package egc;

import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;

public class Rotiri extends Applet{
    GeneralPath forma=new GeneralPath();
    double unghi=Math.PI/3.0;
    Paint gradient=new GradientPaint(0,0,Color.black,45,20,Color.white);
    
    @Override
    public void init() {
        forma.moveTo(0,0);
        forma.lineTo(40,0);
        forma.lineTo(45,20);
        forma.lineTo(30,8);
        forma.closePath();
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d=(Graphics2D)g;
        g2d.draw(new Rectangle(8,8,120,120));
        g2d.translate(66,66);
        g2d.setStroke(new BasicStroke(3));
        for(int i=0; i<6; i++) {
            g2d.rotate(unghi);
            g2d.setPaint(gradient);
            g2d.fill(forma);
            g2d.setPaint(Color.black);
            g2d.draw(forma);
            }
        }
    }
