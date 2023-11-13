/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
//3. Hierarichal Inheritance A-->B, A-->C
// Address --> Student, Address --> Teacher 
class Address2
{
   int Hno;
   String city,state;
   void Getaddress()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your State");
       state=sc.nextLine();
       System.out.println("Enter your City");
       city=sc.nextLine();
       System.out.println("Enter your Hno");
       Hno=sc.nextInt();
   }
   void Putaddress()
   {
       System.out.println("Your State-->"+state);
       System.out.println("Your City-->"+city);
       System.out.println("Your Hno-->"+Hno);
   }
 
}
class Student2 extends Address2
          {
              int rollno;
              String name,clss,section;
              void GetStudent()
              {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter your Name");
                 name=sc.nextLine();
                 System.out.println("Enter your Class-section");
                 clss=sc.nextLine();
                 section=sc.nextLine();
                 System.out.println("Enter your Rollno");
                 rollno=sc.nextInt(); 
              }
              void putStudent()
              {
                  System.out.println("Your Name-->"+name);
                  System.out.println("Your Class and Section-->" +clss+"-"+section);
                  System.out.println("Your Rollno-->"+rollno);
                
              }
          }
class Teacher extends Address2
{
    String name,desigination,subject;
    void GetTeacher()
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Teacher Name");
           name=sc.nextLine();
           System.out.println("Enter Teacher Desigination");
           desigination=sc.nextLine();
           System.out.println("Enter Subject of teacher");
           subject=sc.nextLine();
    }
    void PutTeacher()
    {
        System.out.println("Your Teacher Name-->"+name);
        System.out.println("Your Teacher Designation-->"+desigination);
        System.out.println("Subject Teacher Teaches-->"+subject);
    }
}
public class HierarichalInheritance
{
    public static void main(String [] args)
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 For Student");
        System.out.println("Press 2 For Teacher");
        System.out.print("Enter Your Choice-->");
        ch=sc.nextInt();
        System.out.println();
        Address2 add=new Address2();
       
           
          switch(ch)
          {
           case 1:
             
             Student2 s=new Student2();
             s.GetStudent();
             add.Getaddress();
             add.Putaddress();
             s.putStudent();
             break;

           case 2:
               
             Teacher t=new Teacher();
             t.GetTeacher();
             add.Getaddress();
             add.Putaddress();
             t.PutTeacher();
             break;
          
            default:
            System.out.println("Wrong choice");
    }
}
}
