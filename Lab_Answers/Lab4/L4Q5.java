// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 4 Question 5

import java.util.*;
public class L4Q5 {
	public static void main(String[] args)
	{
		Random num=new Random();
		
		int n=num.nextInt();
		while (n<0) n=num.nextInt();
		System.out.println(n);
		int k=0;
		while (n!=0)
		{
			k++;
			n=n/10;
		}
		
		System.out.println(k);
	}
}
