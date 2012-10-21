// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 3 Question 1

import java.util.*;
public class L3Q1 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number to display the shape");
		System.out.println("        1. Square");
		System.out.println("        2. Circle");
		System.out.println("        3. Triangle");
		System.out.println("        4. Rectangle");
		System.out.print("?:");
		int n=input.nextInt();
		
		switch(n)
		{
		case 1:
		{
			System.out.println("* * * *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("* * * *");
			break;
		}
		case 2:
		{
			System.out.println("  * *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("  * *");
			break;
		}
		case 3:
		{
			System.out.println("  *");
			System.out.println(" ***");
			System.out.println("*****");
			break;
		}
		case 4:
		{
			System.out.println("****");
			System.out.println("*  *");
			System.out.println("*  *");
			System.out.println("*  *");
			System.out.println("*  *");
			System.out.println("****");
			break;
		}
		default:
			break;
		}
	}
}
