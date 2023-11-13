/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Wrapper Classes
 * ------------------
 * Data Types       Wrapper Class
 * ----------
 * byte             Byte
 * short            Short
 * int              Integer
 * long             Long
 * float            Float
 * double           Double
 * char             Character
 * boolean          Boolean
 *
 * These classes provide us with methods to convert data from
 * primitive values to object value and vice versa
 *
 * Primitve Values      Object values
 * ----------------     ---------------
 * int a;                   Integer obj1;
 * float b;                 Float obj2;
 *
 * 1. Convertig a primitive value to an object value using
 *    constructor method
 *      obj1 = new Integer(a);
 *      obj2 = new Float(b);
 *
 * 2. Conveting an object value to a primitive value using
 *  typeValue() method
 * a = obj1.intValue();
 * b = obj2.floatValue();
 *
 * 3. Converting a primitive value to a String object
 * using static toString() method
 * String str1 = Integer.toString(a);
 *
 * 4. Converting a String object to a object value using
 * static valueOf() method
 * obj1 = Integer.valueOf(str1);
 * obj2 = Float.valueOf(str2);
 *
 * 4+2
 * a = Integer.valueOf(str1).intValue();
 * b = Float.valueOf(str1).floatValue();
 *
 * Modified
 * ---------
 * a = Integer.parseInt(str1);
 * b = Float.parseFloat(str2);
 *
 *
 */

package WrapperClasses;

import java.io.DataInputStream;

/**
 *
 * @author admin
 */
public class DemoWrapper
{
public static void main(String a[])
{
    int x;
    float y;
    char z;
    String s;
    DataInputStream din;
    din = new DataInputStream(System.in);

    try
    {
    System.out.println("Enter x");
    x = Integer.parseInt( din.readLine());
    System.out.println("Enter y");
    y = Float.parseFloat( din.readLine());
    System.out.println("Enter s");
    s = din.readLine();
    System.out.println("Enter z");
    z = (char)din.read();
    }
    catch(Exception ex)
    {
        
    }
}
}