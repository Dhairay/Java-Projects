/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package IterativeLogic;

/**
 *
 * @author admin
 */
public class Table
{
    public static void main(String a[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                //if(i==j)
                    //break;
                    //continue;
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}