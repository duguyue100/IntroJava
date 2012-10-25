// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 4 Question 1

import java.util.*;
public class L4Q1 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		int n=input.nextInt();
		
		System.out.print("The factors are: ");
		for (int i=1;i<n;i++)
		{
			if (n%i==0)
				System.out.print(i+", ");
		}
		
		System.out.println(n);
	}
}
