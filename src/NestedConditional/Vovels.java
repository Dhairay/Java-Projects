/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedConditional;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class Vovels 
{
public static void main(String[] args)    
{
    char ch;
    System.out.println("Enter your Alphabet");
    Scanner sc=new Scanner(System.in);
    ch=sc.nextLine().charAt(0);
    switch(ch)
            {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
            System.out.println("vovel");
           break;
                   
        default:
            System.out.println("Not Vovel");
            
    }
            
    /*if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        System.out.println("Vovel");
    else 
        System.out.println("Not Vovel"); */
     
            
        
    
}
}
