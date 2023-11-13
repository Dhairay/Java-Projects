/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;


/**
 *
 * @author My Pc
 */

public class Addition
{
    int a;
    int b;

    public Addition()
    {
        a=2;
        b=4;       
    }

    public Addition(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
   
  public int calculate()
    {
     return a+b;   
    }
}