// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 3 Question 3

import java.util.*;
public class L3Q3 {
	public static void main(String[] args)
	{
		Random num=new Random();
		int n=num.nextInt(5);
		
		if (n==0)
			System.out.println("0 is zero.");
		else if (n==1)
			System.out.println("1 is one.");
		else if (n==2)
			System.out.println("2 is two.");
		else if (n==3)
			System.out.println("3 is three.");
		else if (n==4)
			System.out.println("4 is four.");
		else if (n==5)
			System.out.println("5 is five.");
	}
}
