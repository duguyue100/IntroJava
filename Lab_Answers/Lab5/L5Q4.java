// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 5 Question 4

import java.util.*;
public class L5Q4 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of row of Pascal Triangle to generate:");
		int n=input.nextInt();
		System.out.println("The Pascal Triangle with "+n+" row(s)");
		int[][] a=new int[n][n];
		
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++)
				a[i][j]=0;
		for (int i=0;i<n;i++) a[i][0]=1;
		for (int i=1;i<n;i++)
			for (int j=1;j<=i;j++)
				a[i][j]=a[i-1][j]+a[i-1][j-1];
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
