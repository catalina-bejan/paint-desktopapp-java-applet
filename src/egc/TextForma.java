package egc;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;

public class TextForma extends Applet{
    TextLayout layout;
    Shape text;
    
    public void init(){
        Font font=new Font("SansSerif",Font.BOLD,20);
        FontRenderContext frc=new FontRenderContext(null,true,true);
        layout=new TextLayout("Proba text",font,frc);
        AffineTransform at=new AffineTransform();
        at.translate(0,(float)layout.getBounds().getHeight());
        text=layout.getOutline(at);
    }
    
    public void paint(Graphics g) {
        Graphics2D g2d=(Graphics2D)g;
        g2d.draw(new Rectangle(8,8,330,80));
        g2d.translate(25,20);
        g2d.shear(-0.2,0);
        g2d.scale(2.6,2.6);
        g2d.setPaint(Color.lightGray);
        g2d.fill(text);
        g2d.setPaint(Color.black);
        g2d.draw(text);
    }
    
}
