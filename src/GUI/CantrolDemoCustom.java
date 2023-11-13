/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.applet.*;
import java.awt.*;

/**
 *
 * @author My Pc
 */
public class CantrolDemoCustom extends Applet
{
    Button btn;
    Label lbl;
    TextField txt;
    public void init()
    {
     btn = new Button("Click Here");
     lbl = new Label("Hi I Am Here To Help You");
     txt= new TextField(50);
     
     //Flow Layout
     
        setLayout(null);
       // this.setSize(1000,1000);
        btn.setBounds(10, 20, 100, 30);
        txt.setBounds(120,20, 100, 30);
        lbl.setBounds(230,20, 150, 30);
        add(btn);
        add(txt);
        add(lbl);
    }
    public void paint(Graphics g)
    {
        
    }
}
