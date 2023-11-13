/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Assignment
 * Create a class Employee with following fields
 * empno
 * empname
 * designation
 * salary for 12 months
 * totalsal
 * tax
 * netsalary
 *
 * Create methods to input values , print values
 * and calulate tax
 */
package CLASS;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
class employee
{
    int empono;
    String emponame,desigination;
    long salary[],totalsal,tax,netsalary;
    void getemployee()
    {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter your Employee Number");
    empono=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your Employee Name");
    emponame=sc.nextLine();
    System.out.println("Enter your Desigination");
    desigination=sc.nextLine();
    System.out.println("Enter your salary");
    salary=new long[12];
    for(int index=0;index<=3;index++)
    {
        System.out.println("for month "+(index+1));
        salary[index]=sc.nextLong();
    }
   
    }
    void calculation()
    
        {
            totalsal=0;
            for(int index=0;index<=3;index++)
                totalsal+=salary[index];
            if(totalsal>1000000)
                    tax=10000;
            else 
                tax=5000;
            netsalary=totalsal-tax;
                                    
            
                    
    }
    void publicEmployee()
    {
        System.out.println("Your Employee name = "+emponame);
        System.out.println("Your Employee desigination = "+desigination);
        System.out.println("Your tax = "+tax);
        System.out.println("Your total Salary = "+totalsal);
        System.out.println("Your net salary = "+netsalary);
    }
        
}
public class NewClassEmployee 
{
public static void main(String [] args)
{
   employee obj=new employee();
   obj.getemployee();
   obj.calculation();
   obj.publicEmployee();
}
}
