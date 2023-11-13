/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Array is a homogeneous set of elements.
 * This store similar type of values at continuos memory locations
 * Each array element is an indexed variable
 */

package Array;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class oneDArray
{
    public static void main(String a[])
    {
        //declaration
        int ar[];       //one dimensional array
                        //list structure
        //initialization
        int b[]={2,4,1,6,7};
        System.out.println(b[3]);

        ar = new int[5]; //acquiring memory space
        int index;
        Scanner sc= new Scanner(System.in);
        for(index=0;index<ar.length;index++)
        {
           System.out.println("Enter array element");
            ar[index] = sc.nextInt();
        }
        for(index=0;index<ar.length;index++)
            System.out.println(ar[index]);
    }
}
