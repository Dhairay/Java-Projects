/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalulatorMain;
import Calculator.practicecalc.sub;
import Calculator.practicecalc.add;
import Calculator.practicecalc.multi;
import Calculator.practicecalc.div;
import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class lator 
{
public static void main(String [] args)
{
 
int a,b;    
int ch;
System.out.print("Hey Its Your Own Calc :) \n");
    Scanner sc=new Scanner(System.in);
    do
 {
    System.out.print("Enter your First value --> ");
    a=sc.nextInt();
    System.out.print("Enter your Second Value -> ");
    b=sc.nextInt();
    System.out.println("Enter 1 For Add");
    System.out.println("Enter 2 For Sub");
    System.out.println("Enter 3 For Multi");
    System.out.println("Enter 4 For Div");
    System.out.println("Press 5 If you want to exit");
    ch=sc.nextInt();
    
    switch (ch)
    {
        case 1:
            add a1=new add(a,b);
            System.out.println("your Add is --> "+a1.clac());
            break;
        case 2:
            sub s1=new sub(a,b);
            System.out.println("Your sub is --> "+s1.calc());
            break;
        case 3:
            multi m1=new multi(a,b);
            System.out.println("Your multi is --> "+m1.calc());
            break;
        case 4:
            div d1=new div(a,b);
            System.out.println("Your div is --> "+d1.clac());
            break;
        case 5:
            System.exit(0);
        default:
            System.out.println("Glat h vai");
    }
 }
    while (ch!=5);
 }        
 }


