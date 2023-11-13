/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StraightSequential;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class Sum 
{
public static void main(String [] args)
{
    int a,b;
    double c;
    System.out.println("Enter you number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=a+b;
    System.out.println("Your Sum is= "+c);
}    
}
