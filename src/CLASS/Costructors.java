/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Class;

import java.util.Scanner;

/**
 *
 * @author admin
 * Constructor is a method with same name as class.
 * It do not have a return type
 * It may or may not have any parameters
 * It is called explicitly when an object is instantiated
 * It is used to initialize fields of the class
 */
class sample
{
    int a;
    float b;
        
    public sample()            //default constructor
    {
        a=6;
        b=1.4f;
    }
    public sample(int a1,float b2)      //parameterised constructor
    {
        a=a1;
        b=b2;
    }
    
    void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class Costructors
{
  public static void main (String [] args)
  {
      sample obj=new sample();
      sample obj1=new sample(12, 20);
      obj.show();
      obj1.show();
      
      
      int x;
      float y;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter A and B");
      x=sc.nextInt();
      y=sc.nextFloat();
      System.out.println("Your X--> "+x);
      System.out.println("Your Y--> "+y);
      //sample obj3=new sample(x,y);    //basic to class type conversion
      //obj3.show();
  }
}