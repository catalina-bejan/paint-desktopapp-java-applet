package egc;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercitiul_3_3 extends JPanel {

    public int dim = 360;
    public double[] xSin = new double[dim],
            ySin = new double[dim],
            xCos = new double[dim],
            yCos = new double[dim],
            xTan = new double[dim],
            yTan = new double[dim],
            xCotan = new double[dim],
            yCotan = new double[dim];
    int[] xSinP = new int[dim],
            ySinP = new int[dim],
            xCosP = new int[dim],
            yCosP = new int[dim],
            xTanP = new int[dim],
            yTanP = new int[dim],
            xCotanP = new int[dim],
            yCotanP = new int[dim];

    public void function(int size) {
        double u = 0;

        for (int i = 0; i < dim; i++) {
            xSin[i] = u;
            ySin[i] = Math.sin(u);

            xSinP[i] = (int) ((int) size * xSin[i]);
            ySinP[i] = (int) ((int) -size * ySin[i]);

            xCos[i] = u;
            yCos[i] = Math.cos(u);

            xCosP[i] = (int) ((int) size * xCos[i]);
            yCosP[i] = (int) ((int) -size * yCos[i]);

            xTan[i] = u;
            yTan[i] = Math.tan(u);

            xTanP[i] = (int) ((int) size * xTan[i]);
            yTanP[i] = (int) ((int) -size * yTan[i]);

            xCotan[i] = u;
            yCotan[i] = 1 / Math.tan(u);

            xCotanP[i] = (int) ((int) size * xCotan[i]);
            yCotanP[i] = (int) ((int) -size * yCotan[i]);
            u += Math.PI / 180;
        }
    }

    @Override
    public void paintComponent(Graphics g
    ) {
        super.paintComponent(g);

        function(50);

        g.translate(25, 25);

        g.drawString("0", -10, 235);
        g.drawString("X", 340, 245);
        g.drawString("Y", -20, 10);

        g.setColor(Color.black);
        g.drawLine(0, 0, 0, 225);
        g.drawLine(0, 225, 350, 225);

        g.translate(0, 225);

        g.setColor(Color.red);
        g.drawPolyline(xSinP, ySinP, 360);

        g.setColor(Color.blue);
        g.drawPolyline(xCosP, yCosP, 360);

        g.setColor(Color.magenta);
        g.drawPolyline(xTanP, yTanP, 360);

        g.setColor(Color.pink);
        g.drawPolyline(xCotanP, yCotanP, 360);

    }

}
