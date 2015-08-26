package com.test.string;
public class PrimeNumber{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2;i<num;i++){
			if(num%i==0)
			{
				System.out.println(num+" The given number  not a Prime Number");
				flag = 1;
				break;
			}
		}
		if(flag==0)
			System.out.println(num+" The given number is a Prime Number");
		
	}
}

