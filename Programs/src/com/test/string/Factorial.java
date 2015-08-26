package com.test.string;

import java.util.Scanner;

public class Factorial
{
   public static void main(String args[])
   {
      int s, c, fact = 1;
 
      System.out.println("Enter the number to find the factorial");
      Scanner in = new Scanner(System.in);
 
      s = in.nextInt();
 
      if ( s < 0 )
         System.out.println("number should be negative");
      else
      {
         for ( c = 1 ; c <= s ; c++ )
            fact = fact*c;
 
         System.out.println("Factorial of "+s+" is = "+fact);
      }
   }
}
