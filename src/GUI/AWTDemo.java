/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
 * Object -- > Component
 * Component --> Button, Label, Textfield
 * Component --> Container
 * Container --> Window -- Frame
 * Container --> Panel --> Applet
 */
package GUI;
import java.awt.*;

/**
 *
 * @author My Pc
 */
public class AWTDemo extends Frame
{
    Button btn;
    Label lbl;
    TextField txt;
    
    public AWTDemo(String title)
    {
        super(title);
         btn = new Button("Click Here");
         lbl = new Label("Hi I Am Here To Help You");
         txt= new TextField(50);
     
     //Flow Layout
        
       setLayout(null);
        
       // this.setSize(1000,1000);
        btn.setBounds(20, 50, 100, 30);
        txt.setBounds(140,50, 100, 30);
        lbl.setBounds(250,50, 150, 30);
        add(btn);
        add(txt);
        add(lbl);
    }
    public static void main(String [] args)
    {
        AWTDemo tle=new AWTDemo("Hamara Frame");
        tle.setSize(1000,1000);
        tle.setVisible(true);
    }
}
