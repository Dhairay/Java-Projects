/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalulatorMain;
import Calculator.*;
import java.util.Scanner;
/**
 *
 * @author My Pc
 */
public class Calculate
{
    public static void main(String [] args)
    {
     int ch,a,b;
     Scanner sc=new Scanner(System.in);
     do
     {
        System.out.println("Enter 2 Numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter 1 for Add --> ");
        System.out.println("Enter 2 for Sub --> ");
        System.out.println("Enter 3 for Multi --> ");
        System.out.println("Enter 4 for Div -->");
        System.out.println("Enter 5 for Exit -->");
        
       
        ch=sc.nextInt();
     
     switch(ch)
     {
         case 1:
            Addition Add = new Addition(a,b);
            System.out.print(Add.calculate()+"\n");
            break;
        case 2:
            Substraction Sub = new Substraction(a,b);
            System.out.print(Sub.calculate()+"\n");
            break;
        case 3:
            Multipliction Multi = new Multipliction(a,b);
            System.out.print(Multi.calculate()+"\n");
            break;
        case 4:
            Division Div = new Division(a,b);
            System.out.print(Div.calculate()+"\n");
            break;
        case 5:
            System.out.println("Bss bhai bahar ajja");
            break;
        default:
            System.out.println("Wrong choice");
     }
     }
     while(ch!=5);
    }
}
