// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 7 Question 4

import java.util.*;
public class Fraction {
	private int numerator;
	private int denominator;
	
	public void input()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Numerator: ");
		int n=input.nextInt();
		System.out.print("Denominator:");
		int d=input.nextInt();
		muator(n,d);
	}
	
	public void setNumerator(int n)
	{
		numerator=n;
	}
	
	public void setDenominator(int d)
	{
		denominator=d;
	}
	
	public void muator(int n, int d)
	{
		numerator=n;
		denominator=d;
	}
	
	public void print()
	{
		int num=numerator;
		int den=denominator;
		if (num<den)
		{
			int t=num;
			num=den;
			den=t;
		}
		while(num%den!=0)
		{
			int temp=num%den;
			num=den;
			den=temp;
		}
		
		System.out.println((numerator/den)+"/"+(denominator/den));
	}
}
