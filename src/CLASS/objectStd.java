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
class Student
{
    String name;
    String  address;
    int rollno;
    void Getinfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your Address");
        address=sc.nextLine();
        System.out.println("Enter your Roll Number");
        rollno=sc.nextInt();
    }
    void StuOutput()
    {
        System.out.println("Your Student Name --> "+name);
        System.out.println("Your Student Adress --> "+address);
        System.out.println("Your Student RollNo --> "+rollno);
    }
}
public class objectStd
{
    public static void main(String [] args)
    {
     //1 
       /* Student s=new Student();
        s.Getinfo();
        s.StuOutput(); */
    
        //2- array of object
       /* Student s[];
        s= new Student[2];
        for (int index=0;index<s.length;index++)
            
        {
            s[index]=new Student();      //Array Member object Instantitation
            s[index].Getinfo();
        }
        for (int index=0;index<s.length;index++)
        {
            s[index].StuOutput(); 
        
        }*/
        
        //3- Referring an Object
        Student s1=new Student();
        Student s2;
        s2=s1;                 //passing reference of s1 to s2
        s2.Getinfo();          //s2 is using memory of s1
        s2.StuOutput();   
        
        //4- Anonymous object
        //new Student().Getinfo();
        
        
    }
}
