/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class TwoDAray
{
public static void main(String[] args)
        
{
    int ar[][];            //two dimensional array
    int row,col;
    Scanner sc=new Scanner(System.in);
    ar=new int [3][3];
    for(row=0;row<=2;row++)
    {
        for(col=0;col<=2;col++)
        {
            System.out.println("Enter your Number");
            ar[row][col]=sc.nextInt();
        }
    }
        
     for(row=0;row<=2;row++)
    {
        for(col=0;col<=2;col++)
        {
            System.out.print(ar[row][col]+" ");
        }
        System.out.println("");
    }
            
        
        }
    }




