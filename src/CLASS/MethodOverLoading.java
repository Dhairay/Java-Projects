/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.

* Method Overloading
 * If a class contain more than one methods with same name but different
   no of arguements or different order of args. or different type of args.
 * then it is called
 * overloaded method
 */
package CLASS;

/**
 *
 * @author My Pc
 */
class Overloading
{
    int add(int a1,int b1)
    {
        return a1+b1;
    }
    int add(int a1,int b1, int c1)
    {
        return a1+b1+c1;
    }
    float add(int a1,float b1)
    {
        return a1+b1;
    }
    float add(float a1,int b1)
    {
        return a1+b1;
    }
    float add(float a1,float b1)
    {
        return a1+b1;
    }
}
public class MethodOverLoading 
{
    public static void main(String [] args)
    {
        Overloading obj=new Overloading();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(30, 4.0f));
        System.out.println(obj.add(1.2f, 10));
        System.out.println(obj.add(1.1f, 2.1f));
    }
}
