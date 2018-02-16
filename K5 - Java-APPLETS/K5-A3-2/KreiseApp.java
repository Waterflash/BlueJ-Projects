
import java.awt.*;
import javax.swing.*;

/**
 * Dieses Programm erzeugt 3 verschiedenfarbige Kreise mit Glanzpunkten.
 * Dabei wird bedacht, dass die Glanzpunkte sich an die Größe und die Position der Kreise anpasst. 
 * 
 * @author David K. & David R.
 * @version 1.1
 */
public class KreiseApp extends JApplet
{
    public void paint(Graphics g)
  {
         //  Der erste Kreis
     zeichneKreis(g,60,60,100,
        new Color(220,110,160), 
        new Color(255,127,191));
        
        //  Der zweite Kreis
     zeichneKreis(g,260,260,100,
        new Color(110,220,160), 
        new Color(127,255,191));
        
        //  Der dritte Kreis
     zeichneKreis(g,160,160,100,
        new Color(160,220,110), 
        new Color(191,255,127));
  }
  
  public void zeichneKreis
   (Graphics g, int x, int y, int w, Color c, Color d)
  {
      g.setColor(Color.BLACK);
      g.fillOval(x,y,w,w);  //schwarzer Kreis wird gezeichnet
      g.setColor(c);
      g.fillOval(x+4,y+4,w-8,w-8);  //farbiger Kreis wird gezeichnet, w ist dabei 8 pixel kleiner, um einen schwarzen Rand zu erzeugen
      g.setColor(d);
      g.fillOval(x+w/5,y+w/5,w/5,w/5);  //Glanzpunkt wird gezeichnet, der x- und y-Wert wird um w/5 erhöht, um proportional zur Weite der beiden anderen Kreise zu steigen 
      //und damt der Glanzpunkt verhältnismäßig immer an der gleichen Stelle bleibt
      //
  }  
}
