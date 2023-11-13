/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
 * User Defined Exception
 *
 */

package TryCatchThrow;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);//is a keyword method that is used to
                        //call base class parameterised cons.
    }
}
public class UserExDemo
{
    public static void main(String a[])
    {
        int x,y;
        float z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x,y");
        x = sc.nextInt();
        y = sc.nextInt();
        try
        {
        z = (float) (x-y)/10000;
        if(z<0.01f)
            throw new MyException("No is too small ");
        System.out.println(z);
        }
        catch(MyException my)
        {
            System.out.println("Caught \n"+ my.getMessage());
        }
    }
}