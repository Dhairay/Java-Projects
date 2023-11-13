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
public class LoginForm extends Frame 
{
    Button btn;
    Label lbl,lbl1,lbl2;
    TextField txt,txt1;
    
    public LoginForm(String title)
    {
        super(title);
        lbl = new Label("Login Form");
        lbl1 = new Label("Username");
        lbl2 = new Label("Password");
        btn = new Button("Login");
        txt = new TextField(50);
        txt1 = new TextField(50);
        //Flow Layout
        setLayout(null);
        // this.setSize(1000,1000);
        lbl.setBounds(40,50,100,30);
        lbl1.setBounds(40,100,100,30);
        lbl2.setBounds(40,150,100,30);
        txt.setBounds(140,155, 100, 20);
        txt1.setBounds(140,105, 100, 20);
        btn.setBounds(140,200, 100, 30);
        add(lbl);
        add(lbl1);
        add(lbl2);
        add(txt);
        add(txt1);
        add(btn);
    }
    public static void main(String [] args)
    {
        LoginForm lgn=new LoginForm("Add User");
        lgn.setSize(400,400);
        lgn.setVisible(true);
    }
}
