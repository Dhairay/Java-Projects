/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Exceptions are runtime errors
 * These come in exceptional cases
 * To handle this we use a mechanism called Exception Handling
 *
 * try - catch - throw
 */
package TryCatchThrow;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class ExceptionDemo 
{
    public static void main(String [] args)
    {
        int x,y;
        float z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your x --> ");
        x=sc.nextInt();
         System.out.println("Enter Your y --> ");
        y=sc.nextInt();
        try                         //try block - contain error prone statements
        {
        z = x/(y-10); 
        System.out.print(z);
        }
        catch (Exception ex)       //catch block-correction action
        {
            System.out.println("catch: "+ex);
            z=0.01f;
        }
        System.out.println("End of program "+z);
   }
}
