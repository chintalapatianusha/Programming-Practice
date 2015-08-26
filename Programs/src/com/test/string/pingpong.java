package com.test.string;
import java.util.Scanner;			
public class pingpong {
	public static void main(String[]a){
	Scanner s = new Scanner(System.in);
	int nos =  0;
	System.out.println("plz enter no to see divisable by 3 ,5");
	
	nos = s.nextInt();

		if(((nos%5) ==0 ) && ((nos%3) ==0) )
	{
			System.out.println("number  is  divisable by 5 and 3");
	}
		else if((nos%5) == 0)
	{
		System.out.println("Number  is  divisable by 5");
	}
	else if((nos%3) == 0)
	{
		System.out.println("Number  is  divisable by 3");
	}
	else
	{
	  System.out.println("Number  is not divisable by 3 or 5");
	}
	}
}

