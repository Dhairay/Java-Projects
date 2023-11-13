/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
/**
 *
 * @author My Pc
 */
public class RemoveUser extends Frame
{
    Button btn,btn1;
    Label lbl,lbl1,lbl2,lbl3;
    TextField txt,txt1,txt2;
    public RemoveUser(String title)
    {
        super(title);
        lbl = new Label("Remove User");
        lbl1 = new Label("Username");
        lbl2 = new Label("Password");
        lbl3 = new Label("Confirm Password");
        btn = new Button("Remove");
        btn1 = new Button("Reset");
        txt = new TextField(30);
        txt1 = new TextField(30);
        txt2 = new TextField(30);
        setLayout(null);
        
        lbl.setBounds(40, 50, 100, 30);
        lbl1.setBounds(40, 100, 100, 30);
        lbl2.setBounds(40, 150, 100, 30);
        lbl3.setBounds(40, 200, 120, 30);
        txt.setBounds(170, 105, 80, 20);
        txt1.setBounds(170, 155, 80, 20);
        txt2.setBounds(170, 205, 80, 20);
        btn.setBounds(170, 250, 80, 20);
        btn1.setBounds(250, 250, 80, 20);
        add(lbl);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(txt);
        add(txt1);
        add(txt2);
        add(btn);
        add(btn1);
    }
    public static void main(String [] args)
    {
        RemoveUser rmusr= new RemoveUser ("Remove User");
        rmusr.setSize(400,400);
        rmusr.setVisible(true);
    }
}
