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
public class Table1to20
{
  public static void main(String [] args)
  {
    int n,count;
    int t;
    n=2;
    while(n<=20)
    {
        count=1;
        while (count<=10)
        {
            t=n*count;
            System.out.println(n+"x"+count+"="+t);
            count++;
        }
        System.out.println("");
        n++;
    }
  }
}
