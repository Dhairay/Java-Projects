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
public class RectanglePerimeter
{
public static void main(String [] args)
{
    int l,b;
    double p;
    System.out.println("Enter you Number");
    Scanner sc=new Scanner(System.in);
    l=sc.nextInt();
    b=sc.nextInt();
    p=2*(l+b);
    System.out.println("Your Perimeter is= "+p);
}    
}
