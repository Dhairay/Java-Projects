/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StringDEmo;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class palindromDemo
{
   public static void main(String a[])
    {
       String str1;
       Scanner sc = new Scanner(System.in);
        System.out.println("enter your String");
       str1 = sc.nextLine();
       StringBuffer sb1 = new StringBuffer(str1);
       sb1.reverse();
       if(str1.equals(sb1.toString()))
           System.out.println("Palindrome");
       else
           System.out.println("Not Palindrome");
   }
}