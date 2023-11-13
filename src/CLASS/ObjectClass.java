/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASS;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
class arraies
{
    int rollno;
    String Address,name;
    void SystemInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        name=sc.nextLine();
        System.out.println("Enter your Address");
        Address=sc.nextLine();
        System.out.println("Enter your Rollno.");
        rollno=sc.nextInt();
    }
    void SystemOutout()
    {
        System.out.println("Enter your Name = "+name);
        System.out.println("Enter your Address = "+Address);
        System.out.println("Enter your Rollno = "+rollno);
    }
            
}
public class ObjectClass
{
    public static void main(String [] args)
    {
        /*arraies s=new arraies();
        s.SystemInput();
        s.SystemOutout();*/
        // Enter array
       arraies a[];
       a=new arraies[2];
       for(int index=0;index<a.length;index++)
       {
           a[index]=new arraies();
           a[index].SystemInput();
       }
       for(int index=0;index<a.length;index++)
       {
           a[index].SystemOutout();
       }
    }
}
