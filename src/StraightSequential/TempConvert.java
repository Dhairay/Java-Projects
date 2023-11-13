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
public class TempConvert
{
public static void main(String [] args)
{
    int c;
    double f;
    System.out.println("Enter you Temprature");
    Scanner sc=new Scanner(System.in);
    
    c=sc.nextInt();
    f=(9*c)/5+32;
    System.out.println("Your F is= "+f);
}    
}
