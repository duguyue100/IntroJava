// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 4 Question 3
// Equation is wrong.

import java.util.*;
public class L4Q3 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a score [negative score to quit]:");
		int n=input.nextInt();
		double sum1=0;
		double sum2=0;
		int max=n;
		int min=n;
		int k=0;
		while (n>0)
		{
			k++;
			sum1+=n;
			sum2+=n*n;
			if (max<n) max=n;
			if (min>n) min=n;
			System.out.print("Enter a score [negative score to quit]:");
			n=input.nextInt();
		}
		
		System.out.println("Minimum Score: "+min);
		System.out.println("Maximum Score: "+max);
		System.out.printf("Average Score: %.2f\n",sum1/k);
		System.out.printf("Standard Deviation: %.2f\n", Math.sqrt((sum2-(sum1*sum1)/k)/(k-1)));
	}
}
