import java.awt.*;
import javax.swing.*;
/**

 * Dieses Beispielprogramm wurde nach den Anweisungen der Aufgabenstellung von K1-A5-1(2) (u-helmich.de)
 * erstellt.

 * Es zeichnet ein Rechtwinkliges dreieck mithilfe dem Applet-Befehls "g.drawline".

 *

 * @author David L. Reimer [EF]

 * @version 1.6
 * @since 25.01.2018, 12:50 Uhr

 */

public class Zeichenbrett extends JApplet {
    int x = 0;
    public void paint(Graphics g) {
		
		g.drawLine(200,50,350,200); //line schräg nach unten rechts
		g.drawLine(50,200,200,50); //line schräg nach oben rechts
		g.drawLine(50,200,350,200); //linie waagerecht nach rechts
    }
	
}