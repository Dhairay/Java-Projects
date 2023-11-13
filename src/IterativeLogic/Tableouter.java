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
public class Tableouter
{
public static void main(String a[])
    {
        outer: for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==j)
                    //break outer;
                    //continue outer;
                System.out.print(i*j+" ");
            }
           System.out.println();
        }
    }    
}
