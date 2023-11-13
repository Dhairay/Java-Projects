package Inheritance;

/**
 *
 * @author admin
 */
class Base1
{
    public Base1()
    {
        System.out.println("Constructing Base1");
    }
}
class Derived1 extends Base1
{
    public Derived1()
    {
        System.out.println("Constructing Derived1");
    }
}
public class AbsactCase1
{
    public static void main(String a[])
    {
      Derived1 d1 = new Derived1();
        
    }
}