// Se cauta fonturile disponibile in mediul grafic
package egc;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        /* 3.2: realizarea unei aplicatii care contine 
        un obiect grafic pentru selectia unui font, a unui 
        stil a unei dimensiuni si vizualizarea acestuia 
        (pentru orice font din cele instalate in sistem) */
        JFrame frame_3_2 = new JFrame("Exercitiul 3.2");
        Exercitiul_3_2 ex_3_2 = new Exercitiul_3_2();
        frame_3_2.setSize(500, 500);
        frame_3_2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame_3_2.add(ex_3_2);
        frame_3_2.setVisible(true);

        /* 3.3: realizarea unei aplicatii care traseaza 
        axele de coordonate si graficele a 4 functii trigonometrice 
        (sin, cos, tangent, cotangent) in intervalul [0, 2*PI] 
        cu diferite culori */
        JFrame frame_3_3 = new JFrame("Exercitiul 3.3");
        Exercitiul_3_3 ex_3_3 = new Exercitiul_3_3();
        frame_3_3.setSize(500, 500);
        frame_3_3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame_3_3.add(ex_3_3);
        frame_3_3.setVisible(true);

        /* 3.4: realizarea unei aplicatii Java care permite desenarea 
        folosind metodele clasei Graphics prezentate in cadrul cursului.
        Fiecare primitiva grafica va fi selectata de catre utilizator 
        prin intermediul butoanelor, cate un buton pentru:
            - linie
            - dreptunghi
            - dreptunghi plin, colorat
            - dreptunghi cu colturi rotunjite
            - dreptunghi cu colturi rotunjite plin, colorat
            - oval
            - oval plin
            - arc de elipsa
            - sector de elipsa
            - linie franta (linie poligonala deschisa)
            - poligon
            - poligon plin
            - inserarea unei imagini (se selecteaza fisierul de pe disc)
            - afisarea unui sir de caractere (se selecteaza fontul, stilul, dimensiunea)
        Pentru toate primitivele trebuie sa se poata selecta si culoarea.
         */
        JFrame frame_3_4 = new JFrame("Exercitiul 3.4");
        Exercitiul_3_4 ex_3_4 = new Exercitiul_3_4();
        frame_3_4.setSize(1280, 720);
        frame_3_4.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame_3_4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_3_4.add(ex_3_4);
        frame_3_4.setVisible(true);
    }
}
