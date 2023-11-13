package WrapperClasses;

import java.io.DataInputStream;


/**
 *
 * @author admin
 */
class MyException extends Exception
{
    public MyException(String Message)
    {
        super(Message);
    }
}
public class demo
{
public static void main(String [] args)
{
   int a;
   float b;
   String c;
   char d;
   DataInputStream din;
   din=new DataInputStream(System.in);
   try
   {
       System.out.println("enter a");
       a=Integer.parseInt(din.readLine());
       System.out.println("enter b");
       b=Float.parseFloat(din.readLine());
       System.out.println("enter c");
       c=din.readLine();
       System.out.println("enter d");
       d=(char)din.read();
       
       System.out.println("Your a -> " +a);
       System.out.println("Your b -> " +b);
       System.out.println("Your c -> "+c);
       System.out.println("Your d -> "+d);
      // System.out.println("Enter two numbers --> ");
       System.out.println(a+b);
       
           if(a+b>100)
               throw new MyException("number is to small");
               
       }
  catch (MyException my)
   {
       System.out.println("catch "+my.getMessage());
   }
   catch (Exception ex)
           {
               System.out.println("Caught /n");
           }
   finally
{
    System.out.println("M toh chalunga ");  
}
}
}