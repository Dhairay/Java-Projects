
/**
 *
 * @author admin
 * Abstract is a reserved word
 * An abstract class cannot be instantiated
 * because it do not have a visible constructor
 * It can only have references
 *
 * An abstract method can be made in an abstract class only
 * It has to be re implemented in a derived class
 *
 *
 */
package Inheritance;

abstract class ABase
{
    abstract void show();
}
class ADerived1 extends ABase
{
    void show()
    {
        System.out.println("Showing base in derived1");
    }
}
class ADerived2 extends ABase
{
    void show()
            {
        System.out.println("Showing base in derived2");
    }
}
public class TypeAbstractClass
{
    public static void main(String a[])
    {
        //method1
        ADerived1 d1 = new ADerived1();
        ADerived2 d2 = new ADerived2();
        //d1.show();
        //d2.show();

        //method2
        ABase b;
        b=d1;
        b.show();
        b=d2;
        b.show();

    }
}