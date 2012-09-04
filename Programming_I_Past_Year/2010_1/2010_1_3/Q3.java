// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2010 I 3

import java.util.Scanner;
import java.io.*;

public class Q3 {
	public static void main(String[] args)
	{
		Scanner input=null;
		
		try
		{
			input=new Scanner(new File("Q3.dat"));
		}
		catch (Exception e)
		{
			System.out.println("error");
			System.exit(1);
		}
		
		int sum=0,num=0,numE=0,numO=0,max=-1,min=99999999;
		while (input.hasNextInt())
		{
			int temp=input.nextInt();
			num++;sum+=temp;
			if (num%2==1)
				numO++;
			else numE++;
			if (temp>max)
				max=temp;
			else min=temp;
		}
		
		System.out.println("The number of odd number is "+numO);
		System.out.println("The number of even number is "+numE);
		System.out.println("The largest number is "+max);
		System.out.println("The smallest number is "+min);
		System.out.printf("Average is %.2f",(double)sum/num);
	}
}
