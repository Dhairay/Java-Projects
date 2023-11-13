/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalLogic;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class BiggerNumber
{
public static void main(String [] args)
{
    int a,b;
    System.out.println("Enter you number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    if(a>=b)
        System.out.println("A is bigger= "+a);
    else 
        System.out.println("B is bigger= "+b);
}
}
