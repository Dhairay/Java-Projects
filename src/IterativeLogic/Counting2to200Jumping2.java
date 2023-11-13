/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterativeLogic;

/**
 *
 * @author My Pc
 */
public class Counting2to200Jumping2
{
public static void main(String[] args)
{
    int count;
   
    System.out.println("your Counting");
   
    for(count=1;count<=200;count++)
    {
       if(count%2==0)
            break;
          //continue;
            
       System.out.println(count);
    }
    
}
}
