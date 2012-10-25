// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 5 Question 3

import java.util.*;
public class L5Q3 {
	public static void main(String[] args)
	{
		Random num=new Random();
		int[] a=new int[20];
		System.out.println("A list of 20 random integer within 0 to 100");
		for (int i=0;i<a.length;i++)
		{
			a[i]=num.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i=0;i<a.length-1;i++)
			for (int j=a.length-1;j>=i+1;j--)
				if (a[j-1]<a[j])
				{
					int t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
		System.out.println("Array in descending order");
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		int n=input.nextInt();
		int k=0;
		for (int i=0;i<a.length;i++)
		{
			
			if (a[i]==n)
			{
				System.out.println(n+" found");
				System.out.println("Linear Search - "+k+" loop(s)");
				break;
			}
			k++;
		}
		
		int min=0;
		int max=a.length-1;
		k=0;
		while(min<=max)
		{
			int i=(max+min)/2;
			if (a[i]==n)
			{
				k++;
				System.out.println(n+" found");
				System.out.println("Binary Search - "+k+" loop(s)");
				break;
			}
			else if (a[i]>n)
			{
				min=i+1;
				k++;
			}
			else 
			{
				max=i-1;
				k++;
			}
		}
		
	}
}
