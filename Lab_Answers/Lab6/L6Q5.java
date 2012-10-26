// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 6 Question 5

import java.util.*;
import java.io.*;
public class L6Q5 {
	public static void main(String[] args)
	{
		Scanner input1=null;
		Scanner input2=null;
		try
		{
			input1=new Scanner(new File("product.txt"));
			input2=new Scanner(new File("order.txt"));
		}
		catch (Exception e)
		{
			System.exit(1);
		}
		ArrayList<String[]> product=new ArrayList<String[]>();
		ArrayList<String[]> order=new ArrayList<String[]>();
		while (input1.hasNextLine())
			product.add(input1.nextLine().split(","));
		while (input2.hasNextLine())
			order.add(input2.nextLine().split(","));
		
		System.out.println("ProductID\t ProductName\t Quantity\t PricePerUnit\t Total");
		for (int i=0;i<order.size();i++)
		{
			for (int j=0;j<product.size();j++)
				if (product.get(j)[0].compareTo(order.get(i)[1])==0)
				{
					System.out.printf("%s\t%s\t\t%s\t\t%s\t\t%.2f\n",
							order.get(i)[1],product.get(j)[1],order.get(i)[2],product.get(j)[2],Double.parseDouble(order.get(i)[2])*Double.parseDouble(product.get(j)[2]));
					break;
				}
		}
		input1.close();
		input2.close();
	}
}
