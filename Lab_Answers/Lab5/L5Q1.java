// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 5 Question 1

import java.util.Scanner;
public class L5Q1 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int a[][]=new int[3][3];
		for (int i=0;i<3;i++)
			for (int j=0;j<3;j++)
				a[i][j]=input.nextInt();
		
		// Transpose
		System.out.println("Matrix Transpose");
		for (int j=0;j<3;j++)
		{
			for (int i=0;i<3;i++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		// Clockwise Rotation
		System.out.println();
		System.out.println("Matrix Clockwise Rotation");
		for (int j=0;j<3;j++)
		{
			for (int i=2;i>=0;i--)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
			
		// Counterclockwise Rotation
		System.out.println();
		System.out.println("Matrix Counterclockwise Rotation");
		for (int j=2;j>=0;j--)
		{
			for (int i=0;i<3;i++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
