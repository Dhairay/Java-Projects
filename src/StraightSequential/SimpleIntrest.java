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
public class SimpleIntrest
{
public static void main(String [] args)
{
    int p,t,r;
    double si;
    System.out.println("Enter you Number");
    Scanner sc=new Scanner(System.in);
    p=sc.nextInt();
    t=sc.nextInt();
    r=sc.nextInt();
    si=(p*r*t)/100;
    System.out.println("Your Simple Intrest is= "+si);
}    
}
