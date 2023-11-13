/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance;

/**
 *
 * @author admin
 */
class Base2
{
    public Base2()
    {
        System.out.println("Constructing Base2");
    }
}
class Derived2 extends Base2
{
    public Derived2(int x)
    {
        System.out.println("Constructing Derived2 "+x);
    }

}
public class AbstractCase2 {
public static void main(String a[])
    {
   Derived2 obj = new Derived2(3);
}
}