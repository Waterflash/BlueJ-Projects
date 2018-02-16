import java.awt.*;
import javax.swing.*;
/**

 * Dieses Beispielprogramm wurde nach den Anweisungen der Aufgabenstellung von K1-A5-1(1) (u-helmich.de)
 * erstellt.

 * Es soll die paint-Methode benutzen um den String "Hallo Welt" 20 mal untereinander in dem Applet
 * linksbündig mit einem Randabstand von 50 Pixeln anzuzeigen. Dabei ist es wichtig zu bedenken dass
 * der Quelltext so kurz wie möglich sein sollte

 *

 * @author David L. R. & David K.

 * @version 1.1
 * @since 25.01.2018, 14:05 Uhr

 */

public class Zeichenbrett extends JApplet {
    int x = 0;
    public void paint(Graphics g) {
        /**
         * Da "Hallo Welt" 20 mal ausgegeben werden sollte und man ca. 15 pixel vertikalen Abstand
         * braucht, habe ich beides mit einer Variable ausgeübt, indem ich den verlangten Wert (20)
         * und die Schrittgröße (15) miteinander multiplizierte und das Produkt als neuen
         * Verlang-Wert (300) verwendet.
         */
		while (x<300) {        //15*20 = 300
			    x += 15;
			    g.drawString("Hallo Welt",50,x);
        }
    }

}