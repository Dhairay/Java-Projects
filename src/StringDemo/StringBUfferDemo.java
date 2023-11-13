/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringDemo;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class StringBUfferDemo
{
public static void main(String[] args)
{
    StringBuffer sb1,sb2;
    sb1=new StringBuffer("Dhairay");
    sb2=new StringBuffer("Nitish");
    sb1.setLength(20);
        sb1.setCharAt(3, 'z');
        System.out.println(sb1);
        sb1.insert(6, "demo");
        System.out.println(sb1);
        sb1.append(sb2);    //similar to concat     
       Scanner sc = new Scanner(System.in);
       //sb2 = new StringBuffer(sc.nextLine());
       System.out.println(sb1);
}
}
