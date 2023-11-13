/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Interface is a user defined data type.
 * It is similar to class in strcture.
 * All its fields are final static variables
 * All its methods are abstract methods by default
 *
 * It is a compulsary abstract
 *
 * It is used for multiple inheritance
 *
 * Rules
 * A,B are classes
 * X,Y are interfaces
 *
 * Rule 1
 * A-->B class B extends A
 * Rule 2
 * X-->Y interface Y extends X
 * Rule 3
 * X-->A class A implements X
 * Rule 4
 * A-->X Not Allowed
 * Rule 5
 * X-->A
 * Y-->A
 * B-->A class A extends B implements X,Y
 */
package Inheritance;

/**
 *
 * @author My Pc
 */
interface IBase
{
    void show();
}
class IDerived1 implements IBase
{
    public void show()
    {
        System.out.println("Constructing Iderived 1");   
    }
}
class IDerived2 implements IBase
{
  public void show()
  {
        System.out.println("Constructing Iderived 2");
  }
}

public class MultipleInheritance
{
    public static void main(String [] args)
    {
        IDerived1 d1=new IDerived1();
        IDerived2 d2=new IDerived2();
        IBase b;
        b=d1;
        b.show();
        b=d2;
        b.show();
    }
}