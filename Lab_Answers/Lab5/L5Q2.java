// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 5 Question 2

import java.util.*;
public class L5Q2 {
	public static void main(String[] args)
	{
		Random num=new Random();
		int[] a=new int[10];
		int k=0;
		while (k<10)
		{
			int n=num.nextInt(20);
			boolean flag=true;
			for (int i=0;i<k;i++)
			{
				if (a[i]==n)
				{
					flag=false;
					break;
				}
			}
			if (flag==true)
			{
				a[k]=n;
				k++;
			}
		}
		for (int i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
