/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppleLet;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class AppletSmily extends Applet
    { 
        public void paint(Graphics g)
        {
            this.setSize(500,500);
            g.setColor(Color.red);
            g.drawOval(200, 200, 80,100);
            g.drawOval(230, 240, 20, 10);
            g.drawOval(220, 210, 15, 15);
            g.drawOval(245, 210, 15, 15);
            g.drawOval(200, 200, 10,20);
            g.drawOval(270, 200, 10,20);
            g.drawArc(230,260,20, 20, 180, 180);
            g.setColor(Color.black);
            g.drawOval(225, 218, 8,7);
            g.drawOval(250, 218, 8,7);
            g.setColor(Color.black);
            g.drawString("Smily",230,330);
            g.drawLine(300, 332,200, 332);
            
        }
    }
