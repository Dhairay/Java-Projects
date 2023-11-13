/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedConditional;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class AgeSalary
{
    public static void main(String[] args)
    {
        int age,salary;
        System.out.println("Enter your Age and Salary");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        salary=sc.nextInt();
        if(age>40&&salary>40000)
            System.out.println("Promoted");
        else 
            if(age<40&&salary>50000)
                System.out.println("Promoted");
            else 
                System.out.println("Not Promoted");
    }
}
