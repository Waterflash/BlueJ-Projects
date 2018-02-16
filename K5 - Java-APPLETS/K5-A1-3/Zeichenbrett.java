import java.awt.*;
import javax.swing.*;
/**

 * Dieses Programm zeichnet ein 10x10 Raster von Kreisen mit dem Pixel-Umfang von 40. Zwischen jedem
 * Kreis ist ein Pixel Abstandt

 *

 * @author David L. Reimer [EF]

 * @version 1.9
 * @since 25.01.2018, 13:40 Uhr

 */

public class Zeichenbrett extends JApplet {
    int x = 50;
    int y = 50;
    int count = 0;
    int row = 0;
	
    public void paint(Graphics g) {
		
        while (count<100) {
            while (row<10){
			g.drawOval(x,y,40,40);
			x += 42;
			row++;
			count++;
			}
			row = 0;
			x = 50;
			y += 42;
		}
	
	}
    
}