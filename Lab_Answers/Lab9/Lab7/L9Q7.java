// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 9 Question 7

import java.util.*;
public class L9Q7 {
	public static void main(String[] args)
	{
		int[] a=new int[5];
		Scanner input=new Scanner(System.in);
		int i=0;
		try
		{
			while (true)
			{
				a[i]=input.nextInt();
				i++;
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			for (int j=0;j<a.length;j++)
				System.out.print(a[j]+" ");
		}
	}
}
