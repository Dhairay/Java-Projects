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
public class CantrolDemo extends Applet
{
Button btn;
Label lbl;
TextField txt;
public void init()
{
btn = new Button("Click Here");
lbl = new Label("Just to Mention I am Here");
txt = new TextField(20);
// flow layout
add(btn);
add(txt);
add(lbl);
}
public void paint(Graphics g)
{}
}
