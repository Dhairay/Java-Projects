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
public class ChangePassword extends Frame
{
    Button btn,btn1;
    Label lbl,lbl1,lbl2,lbl3,lbl4;
    TextField txt,txt1,txt2,txt3;
    public ChangePassword(String title)
    {
        super(title);
      lbl= new Label("Change Password");
      lbl1= new Label("Username");
      lbl2= new Label("Old Password");
      lbl3= new Label("New Password");
      lbl4= new Label("Confirm Password");
      btn=new Button("Change");
      btn1=new Button("Reset");
      txt=new TextField(20);
      txt1=new TextField(20);
      txt2=new TextField(20);
      txt3=new TextField(20);
        
        setLayout(null);
        
      lbl.setBounds(40, 50, 120,80);
      lbl1.setBounds(40, 100, 100,80);
      lbl2.setBounds(40, 150, 100,80);
      lbl3.setBounds(40, 200, 100,80);
      lbl4.setBounds(40, 250, 120,80);
      txt.setBounds(200, 130, 80, 20);
      txt1.setBounds(200, 180, 80, 20);
      txt2.setBounds(200, 230, 80, 20);
      txt3.setBounds(200, 280, 80, 20);
      btn.setBounds(200, 320, 80, 20);
      btn1.setBounds(280, 320, 80, 20);
      add(lbl);
      add(lbl1);
      add(lbl2);
      add(lbl3);
      add(lbl4);
      add(txt);
      add(txt1);
      add(txt2);
      add(txt3);
      add(btn);
      add(btn1);
    }
    public static void main(String [] args)
    {
        ChangePassword cngpss = new ChangePassword("Change Password");
        cngpss.setSize(400,400);
        cngpss.setVisible(true);
    }
}
