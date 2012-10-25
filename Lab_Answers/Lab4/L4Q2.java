// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 4 Question 2

import java.util.*;
public class L4Q2 {
	public static void main(String[] args)
	{
		Random num=new Random();
		
		int n=num.nextInt(100);
		System.out.println("First "+n+" prime numbers.");
		int k=1;
		int t=2;
		while (k<=n)
		{
			if (check(t)==true)
			{
				System.out.println(t);
				k++;
			}
			t++;
		}
	}
	
	public static boolean check(int t)
	{
		
		for (int i=2;i<t;i++)
			if (t%i==0)
				return false;
		return true;
	}
}
