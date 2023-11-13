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
public class AddUser extends Frame 
{
    Button btn,btn1;
    Label lbl,lbl1,lbl2,lbl3;
    TextField txt,txt1,txt2;
    
    public AddUser(String title)
    {
        super(title);
        lbl = new Label("Add User");
        lbl1 = new Label("Username");
        lbl2 = new Label("Password");
        lbl3 = new Label("Confirm Password");
        btn = new Button("Add");
        btn1 = new Button("Reset"); 
        txt = new TextField(50);
        txt1 = new TextField(50);
        txt2 = new TextField(50);
       
         //Flow Layout
        
       setLayout(null);
        
       // this.setSize(1000,1000);
        lbl.setBounds(40,50,100,30);
        lbl1.setBounds(40,100,100,30);
        lbl2.setBounds(40,150,100,30);
        lbl3.setBounds(40,200,130,30);
        txt.setBounds(180,155, 100, 20);
        txt1.setBounds(180,105, 100, 20);
        txt2.setBounds(180,205, 100, 20);
        btn.setBounds(180,250, 80, 20);
        btn1.setBounds(280,250, 80, 20);
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
        AddUser lgn=new AddUser("Add User");
        lgn.setSize(400,400);
        lgn.setVisible(true);
    }
}
