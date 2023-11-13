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
public class AreaOfCircle
{
public static void main(String [] args)
{
    int r;
    double a;
    System.out.println("Enter you Area");
    Scanner sc=new Scanner(System.in);
    
    r=sc.nextInt();
    a=3.14*r*r;
    System.out.println("Your Area is= "+a);
}
}
