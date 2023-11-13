/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance;

/**
 *
 * @author admin
 * Final is reserved word
 * Final variable is a constant
 * Final method in a base class cannot be overridden
 * Final class cannot be derived. It has to be instantiated
 */
//final class FBase
class FBase
{
    final int x=6;
    final void show()
    {
        //x++;
    }
}
class FDerived extends FBase
{
    /*void show()
    {

    }*/
}
public class TypeFinalClass
{

}