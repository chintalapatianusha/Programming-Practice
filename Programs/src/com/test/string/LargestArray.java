package com.test.string;

import java.util.Scanner;

public class LargestArray {
	 public static void main(String[]a){
		Scanner s = new Scanner(System.in);
		int nos =  0;
	
		System.out.println("plz enter size of Integer type Array");
		nos = s.nextInt() ;
		
		int[] a1 = new int[nos];
		for(int i=0;i<nos;i++)
		{
			System.out.println("plz enter "+(i+1)+" element of Array");
			a1[i] = s.nextInt() ;
		}
		int maxno = a1[0];
		for(int j=0;j<a1.length;j++)
		{
			if(maxno<a1[j])
				maxno = a1[j];
		}
		System.out.println("Max no is "+maxno );
		
	}

}
