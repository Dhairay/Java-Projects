/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance;

/**
 *
 * @author admin
 */
class Base3
{
    Base3(int x)
    {
        System.out.println("Construting Base3 "+x);
    }
}
class Derived3 extends Base3
{
    Derived3(int y)
    {
        super(y);   //super is a keyword method that is used to call base class
                    //parameterised costructor. It has to be firs lineof code in
                    //derived class constructor
        System.out.println("Costructing Derived3");
    }
}
public class AbstractCase3
{
    public static void main(String a[])
    {
        Derived3 d3 = new Derived3(7);
    }
}