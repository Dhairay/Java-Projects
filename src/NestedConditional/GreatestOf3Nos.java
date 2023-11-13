/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedConditional;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class GreatestOf3Nos 
{
 public static void main(String [] args)
{
    int a,b,c;
    System.out.println("Enter you number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b&&a>c)
        System.out.println("A is bigger");
    else 
        if(b>c)
        System.out.println("B is bigger");
    else
            System.out.println("C is bigger");
}   
}
