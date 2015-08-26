package com.test.string;

import java.util.Scanner;

public class MyFibonaci{
	public static void main(String[]a){
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number of digits in the fibonacci series");
	
	
		int total = s.nextInt();
		System.out.println(total);
		
		int sum = 0;
		int prenum =0;
		int currnum =1;
		for (int i =1;i<=total;i++)
		{
			
			sum =  prenum + currnum;
			System.out.println(prenum);
			prenum = currnum;	
			currnum = sum;
			
		}
	}
}
	
	

