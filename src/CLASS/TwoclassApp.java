/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASS;

import java.util.Scanner;

class One
{
    int a;
    float b;
   // double c;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your First Number--> ");
        a=sc.nextInt();
        System.out.print("Enter your Second Number--> ");
        b=sc.nextFloat();
        //c=a+b;
        
    }
    float calculate()
    {
        return a+b;
    }
    
}
public class TwoclassApp 
{
public static void main(String [] args)
{
    One obj;
    obj=new One();
    obj.getdata();
    //System.out.println(obj.c);
    System.out.println("Your Number Is--> "+obj.calculate());
}
}
