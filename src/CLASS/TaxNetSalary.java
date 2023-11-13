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
class employeeee
{
    int empno;
    String emponame,designation;
    long totalsal,tax,netsalary,salary[];
    void putdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Empolyee Number-->");
        empno=sc.nextInt();
        System.out.println("Employee Name-->");
        emponame=sc.nextLine();
        sc.nextLine();
        System.out.println("Employee Desigination");
        designation=sc.nextLine();
        System.out.println("Enter your Salary");
        salary=new long[12];
        for(int index=0;index<=12;index++)
        {
            System.out.println("Enter your Month "+(index+1));
            salary[index]=sc.nextLong();
        }
        
    }
    void calculate()
    {
        totalsal=0;
        for(int index=0;index<=12;index++)
        totalsal+=salary[index];
        
        if(totalsal>1000000)
        
             tax=10000;
        else
        
            tax=5000;
        netsalary=totalsal-tax;
        
    }
    void getinfo()
    {
        
        System.out.println("Empolyee Number-->"+empno);
        System.out.println("Employee Name-->"+emponame);
        System.out.println("Employee Desigination-->"+designation);
        System.out.println("Total Salary-->"+totalsal);
        System.out.println("Tax-->"+tax);
        System.out.println("Netsal-->"+netsalary);
    }
}
public class TaxNetSalary
{
    public static void main(String [] args)
    {
        employeeee obj2=new employeeee();
         obj2.putdata();
         obj2.calculate();
        obj2.getinfo();
        
    } 
}
