package Inheritance;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
//2. MultiLevel Inheritance A-->B-->C
// Address --> Student --> College
class Address1
{
   int Hno;
   String city,state,area;
   void Getaddress()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your State");
       state=sc.nextLine();
       System.out.println("Enter your City");
       city=sc.nextLine();
       System.out.println("Enter your Locality[urban / rural]");
       area=sc.nextLine();
       System.out.println("Enter your Hno");
       Hno=sc.nextInt();
   }
   void Putaddress()
   {
       System.out.println("Your State-->"+state);
       System.out.println("Your City-->"+city);
       System.out.println("Your Area-->"+area);
       System.out.println("Your Hno-->"+Hno);
   }
 
}
 class Student1 extends Address1
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
class Collage extends Student1
{
    String clgName,clglocation;
    String clgType;
    void GetCollage()
    {
        Scanner sc=new Scanner(System.in);
                 System.out.println("Enter your ClgName");
                 clgName=sc.nextLine();
                 System.out.println("Enter your ClgLocaion");
                 clglocation=sc.nextLine();
                 System.out.println("Enter your ClgType");
                 clgType=sc.nextLine();
    }
    void PutCollage()
    {
        System.out.println("Your ClgName-->"+clgName);
        System.out.println("Your ClgLocation-->"+clglocation);
        System.out.println("Your ClgName--->"+clgType);
    }
}
public class MultiLevelInheritance
{
    public static void main(String[]args)
    {
        Collage s=new Collage();
        s.Getaddress();
        s.GetStudent();
        s.GetCollage();
        s.Putaddress();
        s.putStudent();
        s.PutCollage();
    }
}
