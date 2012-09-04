// Author: Hu Yuhuang
// Email: duugyue100@gmail.com
// Programming I: 2010 I 2

import java.util.Scanner;
public class Q2 {
	public static void main(String[] args)
	{
		String[] product=new String[5];
		Scanner input=new Scanner(System.in);
		
		for (int i=0;i<5;i++)
		{
			System.out.print("Enter product name:");
			product[i]=input.nextLine();
		}
		
		for (int i=0;i<product.length-1;i++)
			for (int j=product.length-1;j>=i+1;j--)
				if (product[j-1].compareToIgnoreCase(product[j])>0)
				{
					String temp=product[j-1];
					product[j-1]=product[j];
					product[j]=temp;
				}
		
		System.out.println("The product names in alphabetical order are:");
		for (int i=0;i<product.length;i++)
			System.out.println(product[i]);
	}
}
