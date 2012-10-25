// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 5 Question 5

import java.util.*;
public class L5Q5 {
	public static void main(String[] args)
	{
		String num1="192858958238283698239682398329";
		String num2="8975793726383698236892389682";
		int l=num1.length();
		if (l<num2.length())
			l=num2.length();
		int[] a=new int[l+1];
		int[] b=new int[l+1];
		
		for (int i=num1.length()-1;i>=0;i--)
			a[num1.length()-i-1]=(int)(num1.charAt(i)-'0');
		for (int i=num2.length()-1;i>=0;i--)
			b[num2.length()-i-1]=(int)(num2.charAt(i)-'0');
		for (int i=0;i<l+1;i++)
		{
			a[i]=a[i]+b[i];
			if (a[i]>=10)
			{
				a[i+1]++;
				a[i]-=10;
			}
		}
		
		for (int i=l-1;i>=0;i--)
			System.out.print(a[i]);
			
	}
}
