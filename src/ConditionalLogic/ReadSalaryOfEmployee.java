/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalLogic;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class ReadSalaryOfEmployee 
{
public static void main(String[] args)
{
    int salary;
    System.out.println("Enter your Salary");
    Scanner sc=new Scanner(System.in);
    salary=sc.nextInt();
    if(salary>70000)
        System.out.println("Manager");
    else 
        System.out.println("Clerk");
    
            
}
}
