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
public class Counting1toN
{
public static void main(String[] args)
{
    int count;
    int n;
    System.out.println("Enter Your Number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    //for(count=1; count<=n; count++)
        
      //  System.out.println(count);
  //----------------------------------------------------------------------------    
    /*  count=n;
        while(count>=1)
        {
            System.out.println(count);
            count--;
        }*/
    //--------------------------------------------------------------------------
        count=n;
        do
        {
            System.out.println(count);
            count--;
        }while(count>=1);
    }

}
        


