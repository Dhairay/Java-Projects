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
public class AverageOf5Nos
{
public static void main(String [] args)
{
    int a,b,c,d,e;
    double avg;
    System.out.println("Enter you Number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    avg=(a+b+c+d+e)/5;
    System.out.println("Your Average is= "+avg);
}        
}
