/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TryCatchThrow;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MultipleException
{
    public static void main(String ar[])
    {
        int a[]={1,2},b;
        float c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter b");
        b = sc.nextInt(); 
        try
        {
        c = (float)a[1]/(b-3);
        System.out.println(c);
        }
           catch(ArithmeticException ai)
        {
            System.out.println("Div by zero "+ ai.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Array problem "+ae.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println("Caught "+ex);
        }
        finally//is an all time catch
        {
            System.out.println("I am always there");
        }
    }
   
}