import java.awt.*;
import javax.swing.*;
/**

 * Dieses Programm zeichnet 3 verschiedene 3x3 Blöcke, mit jeweils verschiedenen farbig gefüllten
 * Kreisen.
 
 * Hierbei wird im oberen Block der Farbwert von Blau auf 0, im mittleren Block auf 127 und
 * im letzten Block auf 254 gesetzt.

 * @author David Lukas R. & David K. [EF]

 * @version 1.7
 * @since 08.02.2018, 11:25 Uhr

 */

public class Zeichenbrett extends JApplet {
    int x = 50;	//x-Koordinate
    int y = 50; //y- Koordinate
    int block = 0; //stellt die Anzahl der 3x3-Blöcke dar
    int line = 0; // Zähler für die y-Reihe
    int row = 0; // Zähler für die x-Reihe
    int rd = 0;  //rotwert
    int grn = 0;  //grünwert
    int bl = 0;  //blauwert
    /**
	* Die jeweiligen Blöcke werden hier mithilfe 3 ineinander liegenden "while"-Schleifen graphisch
	* dargestellt. 
	
	* Dabei nutzen sie Variablen für die x- & y-Koordinate, als auch 3 Zähler-Variablen,
	* um sich an den Reihen, Spalten und der Block-Anzahl zu orientieren.
	*/
    public void paint(Graphics g){
        while (block<3) {
            while (line<3) {
                while (row<3){
                    g.setColor(new Color(rd,grn,bl));
                    g.fillOval(x,y,40,40); 
                    g.setColor(Color.BLACK); //farbsetzung rand
                    g.drawOval(x,y,40,40);
                    x += 42;    // 40 = Kreisdurchmesser + 2 für Abstand zwischen den Kreisen
                    rd += 127;
                    row++;
                }
                line++;
                row = 0;
                rd = 0;
                grn += 127;
                x -= 126; 
                y += 42;    // 40 = Kreisdurchmesser + 2 für Abstand zwischen den Kreisen
            }
            line = 0;
            block++;
            x += 126;
            grn = 0;
            bl += 127;
        }
    }
}