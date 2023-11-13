/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;

/**
 *
 * @author My Pc
 */
public class SwingDemoRgForm extends JFrame
{

    JLabel unlbl, pwlbl, cpwlbl, genlbl, addlbl, hoblbl, citlbl, qulbl;
    JTextField untxt;
    JPasswordField pwtxt, cpwtxt;
    JCheckBox rdchk, wrchk, plchk;
    JRadioButton mlchk, fmchk;
    ButtonGroup cbg;
    JComboBox ch;
    JTextArea addtxt;
    JList qlst;
    JButton sbtn, rbtn;

    public SwingDemoRgForm(String title) 
    {
        super(title);
       
        //Label

        unlbl = new JLabel("Username");
        pwlbl = new JLabel("Password");
        cpwlbl = new JLabel("Confirm Password");
        genlbl = new JLabel("Gender");
        hoblbl = new JLabel("Hobbies");
        citlbl = new JLabel("City");
        addlbl = new JLabel("Address");
        qulbl = new JLabel("Qualification");

        //Text Field And PasswordField
       
        untxt = new JTextField();
        pwtxt = new JPasswordField();
        cpwtxt = new JPasswordField();

        //Text Area
        
        addtxt = new JTextArea();

        //Check Box Group 
        
        cbg = new ButtonGroup();
        mlchk = new JRadioButton("Male");
        fmchk = new JRadioButton("Female");
        cbg.add(mlchk);
        cbg.add(fmchk);

        //Check Box
        
        rdchk = new JCheckBox("Reading");
        wrchk = new JCheckBox("Writing");
        plchk = new JCheckBox("Playing");

        //Clith - Choice Based
        
        ch = new JComboBox();
        ch.addItem("Karnal");
        ch.addItem("Ambala");
        ch.addItem("Nilokheri");
        ch.addItem("Ludhiana");
        ch.addItem("Jalandhar");
        ch.addItem("Nabha");
        ch.addItem("kurukshetra");

        //Qualification List
        
        DefaultListModel Imodel = new DefaultListModel();
        
        Imodel.addElement("10");
        Imodel.addElement("12");
        Imodel.addElement("14");
        Imodel.addElement("15");
        Imodel.addElement("16");
        Imodel.addElement("18");
        Imodel.addElement("20");
        qlst = new JList(Imodel);         

        //Buttom
        
        sbtn = new JButton("Save");
        rbtn = new JButton("Reset");

        /*Demntion Setup For Regidstration Form
        
                         AND
        
             Adding Colors To Form */
       
        Container cp= getContentPane();
        cp.setLayout(null);
        //cp.setBackground(Color.);
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
        ch.setBounds(200, 300, 100, 30);
        addlbl.setBounds(50, 350, 100, 30);
        addtxt.setBounds(200, 350, 200, 40);
        qulbl.setBounds(50, 430, 100, 60);
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
        add(ch);
        add(addtxt);
        add(qulbl);
        add(qlst);
        add(sbtn);
        add(rbtn);
    }

        public static void main(String[] args)
    
    {
        SwingDemoRgForm swrgfm = new SwingDemoRgForm("Swing Registraction Form");
        swrgfm.setSize(700, 700);
        swrgfm.setVisible(true);
    }
}
