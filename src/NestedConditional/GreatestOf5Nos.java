/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedConditional;

import java.util.Scanner;

/**1
 *
 * @author My Pc
 */
public class GreatestOf5Nos 
{
 public static void main(String [] args)
{
    int a,b,c,d,e;
    System.out.println("Enter you number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    if(a>b&&a>c&&a>d&&a>e)
        System.out.println("A is bigger"+a);
    else 
        if(b>c&&b>d&&b>e)
        System.out.println("B is bigger"+b);
    else
            if (c>d&&c>e)
            System.out.println("C is bigger"+c); 
            
    else
                if(d>e)
                System.out.println("D is Bigger"+d);
    else
                    System.out.println("E is Bigger"+e);
}    
}
