/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASS;

import java.util.Scanner;

/**
 *
 * @author admin
 * Static is a reserved word.It is used to create class level members.
 * These members do not associate with objects
 * Static Fields: These are declared with keyword static. These occupy
 * common memory space for all objects. Any change made to them is reflected
 * in all the objects
 * Static Methods: These are defined with keyword static. These can use
 * static fields only. These are called with class name
 *
 */

class Staticdemo
{
int a;
static int b;
void getdata()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A value");
    a=sc.nextInt();
    b++;
}
void putdata()
{
    System.out.println("Your A value is ");
    System.out.println(a);
}
static void showdata() 
{
    System.out.println("Your Static value");
    System.out.println(b);
    
}
}
public class StaticTest
{
    public static void main(String [] args)
    {
        Staticdemo obj1,obj2,obj3,obj4,obj5;
        obj1=new Staticdemo();
        obj2=new Staticdemo();
        obj3=new Staticdemo();
        obj4=new Staticdemo();
        obj5=new Staticdemo();
        obj1.getdata();
        obj2.getdata();
        obj3.getdata();
        obj4.getdata();
        obj5.getdata();
        obj1.putdata();
        obj2.putdata();
        obj3.putdata();
        obj4.putdata();
        obj5.putdata();
        Staticdemo.showdata();
    }
}
