/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Sports-->Result
 * Student-->Marks-->Result
 */

package Inheritance;

import java.util.Scanner;

/**
 *
 * @author admin
 */
interface Sports
{
    float score=7.5f;
}
class Student
{
    int rollno;
    String name,address;
    void getStudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name --> ");
        name=sc.nextLine();
        System.out.println("Enter Your Address --> ");
        address=sc.nextLine();
        System.out.println("Enter Your Roll Number --> ");
        rollno=sc.nextInt();
    }
    void putStudent()
    {
     System.out.println("Your Name --> "+name);
     System.out.println("Your Address --> "+address);
     System.out.println("Your Roll Number --> "+rollno);
    }
}
class Marks extends Student
{
    float m1,m2,m3;
    void getMarks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
}
class Result extends Marks implements Sports
{
    float total;
    void calculate()
    {
        total = m1+m2+m3+score;
    }
    void display()
    {
        System.out.println("Your Maths Marks --> "+m1);
        System.out.println("Your Science Marks --> "+m2);
        System.out.println("Your English Marks --> "+m3);
        System.out.println("Result = "+total);
    }
}
public class MultipleInheritanceDemo
{
    public static void main(String a[])
    {
        Result obj = new Result();
        obj.getStudent();
        obj.getMarks();
        obj.calculate();
        obj.putStudent();
        obj.display();
    }
}