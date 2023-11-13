/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Inheritance is the ability of a class to use properties of another class
 * The one which gives the properties is called Base Class
 * The one which uses the properties is called Derived Class
 *
 * Base --> Derived
 * Address --> Employee
 */
package Inheritance;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
//1. Single Inheritance A-->B
class Address  //base class / parent class / super class
{
int Hno;
String city,state;
void GetAddress()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your City");
    city=sc.nextLine();
    System.out.println("Enter your State");
    state=sc.nextLine();
    System.out.println("Enter your Hno");
    Hno=sc.nextInt();
}
  void putAddress()
    {
     System.out.println("your City-->" +city);
     System.out.println("your State-->" +state);
     System.out.println("your Hno-->"+Hno);
    }
}

class Employee extends Address //derived class / child class / sub class

{
    int empno;
    String name, designation;
    void getEmployee()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Empno");
    empno=sc.nextInt();
    System.out.println("Enter your Name");
    name=sc.nextLine();
    sc.nextLine();
    System.out.println("Enter your desigination");
    designation=sc.nextLine();
    }
    void putEmployee()
    {
     System.out.println("your Empno-->"+empno);
     System.out.println("your Name-->"+name);
     System.out.println("your Designation-->"+designation);
    }
}
    

public class DefineInheritance
{
    public static void main(String [] args)
    {
       Employee obj=new Employee();     //Object of association of base and derived
       obj.GetAddress();
       obj.getEmployee();
       obj.putAddress();
       obj.putEmployee();
    }
}
