// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 7 Question 1

import java.util.*;
public class Number {
	public int[] a;
	public Number()
	{
		a=new int[10];
		Random num=new Random();
		for (int i=0;i<10;i++)
			a[i]=num.nextInt(100);
		print(a);
	}
	
	public Number(int n)
	{
		a=new int[n];
		Random num=new Random();
		for (int i=0;i<n;i++)
			a[i]=num.nextInt(100);
		print(a);
	}
	
	public Number(int n, int m)
	{
		a=new int[n];
		Random num=new Random();
		for (int i=0;i<n;i++)
			a[i]=num.nextInt(m);
		print(a);
	}
	
	public void print(int[] arr)
	{
		int max=arr[0];
		int min=arr[0];
		int sum=0;
		System.out.print("All items: ");
		for (int i=0;i<arr.length;i++)
		{
			if (max<arr[i]) max=arr[i];
			if (min>arr[i]) min=arr[i];
			sum+=a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
		double average=(double)(sum/arr.length);
		System.out.print("Even Numbers: ");
		for (int i=0;i<arr.length;i++)
			if (arr[i]%2==0) System.out.print(arr[i]+" ");
		System.out.println();
		System.out.print("Prime Numbers: ");
		for (int i=0;i<arr.length;i++)
			if (isPrime(arr[i])==true) System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("Maximum Number: "+max);
		System.out.println("Minimum Number: "+min);
		System.out.printf("Average: %.2f\n",average);
		System.out.print("Square Numbers: ");
		for (int i=0;i<arr.length;i++)
			if (Math.sqrt((double)arr[i])==(int)Math.sqrt((double)arr[i]))
				System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public boolean isPrime(int x)
	{
		for (int i=2;i<x;i++)
			if (x%i==0) return false;
		return true;
	}
}
