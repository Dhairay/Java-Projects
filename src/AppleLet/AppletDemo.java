/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.

 * Applet are small java programs that are compiled but not
 * interpreted. These do not have main method.
 * These are embedded into a HTML doc or
 * Run with appletviewer
 * It is a graphical output of a java program that  represent a Canvas
 *
 *
 */

package AppleLet;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;   //abstract windowing toolkit
import java.awt.Polygon;
/**
 *
 * @author admin
 */
public class AppletDemo extends Applet
{
    public void paint(Graphics g)
    {
        this.setSize(900,600);

        
        g.drawLine(100,100,300,300);
        g.setColor(Color.red);
        g.drawRect(100, 100, 200, 200);
        g.setColor(Color.blue);
        g.fillRect(120,120,160,160);
        g.drawOval(50, 50, 300, 300);
        //g.fillOval(WIDTH, WIDTH, WIDTH, WIDTH);
        g.fillRoundRect(50, 400, 300, 50, 10,10);
        g.drawArc(400, 200, 300, 100, 180,180);
        g.setColor(Color.white);
        g.drawString("Hell O World", 100, 410);
        Polygon p = new Polygon();
        g.setColor(Color.green);
        p.addPoint(450, 20);
        p.addPoint(20, 580);
        p.addPoint(880, 580);
        g.drawPolygon(p);
    }
}