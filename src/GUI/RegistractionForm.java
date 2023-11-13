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
public class RegistractionForm extends Frame
{
   Label unlbl,pwlbl,cpwlbl,genlbl,addlbl,hoblbl,citlbl,qulbl;
   TextField untxt,pwtxt,cpwtxt;
   Checkbox mlchk,fmchk,rdchk,wrchk,plchk;
   CheckboxGroup cbg;
   Choice citch;
   TextArea addtxt;
   List qlst;
   Button sbtn,rbtn;
   
   public RegistractionForm(String title)
   {
       super(title);
       
       //Label
       
       unlbl=new Label("Username");
       pwlbl=new Label("Password");
       cpwlbl=new Label("Confirm Password");
       genlbl=new Label("Gender");
       hoblbl=new Label("Hobbies");
       citlbl=new Label("City");
       addlbl=new Label("Address");
       qulbl=new Label("Qualification");
       
       //Text Field
       
       untxt=new TextField();
       pwtxt=new TextField();
       pwtxt.setEchoChar('*');
       cpwtxt=new TextField();
       cpwtxt.setEchoChar('*');
       
       //TExt Area
       
       addtxt=new TextArea();
       
      //Check Box Group 
       
       cbg=new CheckboxGroup();
       mlchk=new Checkbox("Male", cbg, true);
       fmchk=new Checkbox("Female", cbg, true);
       
       //Check Box
       
       rdchk=new Checkbox("Reading");
       wrchk=new Checkbox("Writing");
       plchk=new Checkbox("Playing");
       
       //Clith - Choice Based
       
       citch=new Choice();
       citch.add("Karnal");
       citch.add("Ambala");
       citch.add("Nilokheri");
       citch.add("Ludhiana");
       citch.add("Jalandhar");
       citch.add("Nabha");
       citch.add("kurukshetra");
       
       //Qualification List
       
       qlst = new List();
       qlst.add("10");
       qlst.add("12");
       qlst.add("14");
       qlst.add("15");
       qlst.add("16");
       qlst.add("18");
       qlst.add("20");
       
       //Buttom
       
       sbtn=new Button("Save");
       rbtn=new Button("Reset");
       
       //Demntion Setup For Regidstration Form
       
       setLayout(null);
       
       unlbl.setBounds(50, 50, 100, 30);
       untxt.setBounds(200, 50, 80, 20);
       pwlbl.setBounds(50, 100, 100, 30);
       pwtxt.setBounds(200, 100, 80, 20);
       cpwlbl.setBounds(50, 150, 120, 30);
       cpwtxt.setBounds(200, 150, 80, 20);
       genlbl.setBounds(50, 200, 100, 30);
       mlchk.setBounds(200, 200, 100, 30);
       fmchk.setBounds(300, 200, 100, 30);
       hoblbl.setBounds(50, 250, 100, 30);
       rdchk.setBounds(200, 250, 100, 30);
       wrchk.setBounds(300, 250, 100, 30);
       plchk.setBounds(400, 250, 100, 30);
       citlbl.setBounds(50, 300, 100, 30);
       citch.setBounds(200, 300, 100, 30);
       addlbl.setBounds(50, 350, 100, 30);
       addtxt.setBounds(200,350 ,200, 40);
       qulbl.setBounds(50, 450, 100, 30);
       qlst.setBounds(200, 450, 100, 20);
       sbtn.setBounds(200, 500, 80, 20);
       rbtn.setBounds(300, 500, 80, 20);
       
       //Adding Items To the Form
       
       add(unlbl);
       add(untxt);
       add(pwlbl);
       add(pwtxt);
       add(cpwlbl);
       add(cpwtxt);
       add(genlbl);
       add(hoblbl);
       add(citlbl);
       add(addlbl);
       add(mlchk);
       add(fmchk);
       add(rdchk);
       add(wrchk);
       add(plchk);
       add(citch);
       add(addtxt);
       add(qulbl);
       add(qlst);
       add(sbtn);
       add(rbtn);
   }
   public static void main(String [] args) 
   {
       RegistractionForm rgfm=new RegistractionForm(null);
       rgfm.setSize(800, 800);
       rgfm.setVisible(true);
   }
}
