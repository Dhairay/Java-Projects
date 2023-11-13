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
public class CountingNto1
{
 public static void main(String[] args) 
 {
     System.out.println("Enter n value");
     Scanner sc=new Scanner(System.in);
     int count,n;
     n=sc.nextInt();
    for(count=n; count>=1; count--)
         System.out.println(count);
   
             
 }    
}
