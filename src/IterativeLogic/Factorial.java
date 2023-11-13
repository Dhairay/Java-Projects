/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterativeLogic;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class Factorial 
{
public static void main(String [] args)
{
    int n,count;
    int multi=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number -> ");
    n=sc.nextInt();
    for(count=1;count<=n;count++)
    {
        multi=multi*count;
        System.out.println(multi);   
    }
}
}
