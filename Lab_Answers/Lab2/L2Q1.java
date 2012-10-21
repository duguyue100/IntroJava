// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 2 Question 1

import java.util.Scanner;
public class L2Q1 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input degree Fahrenheit: ");
		double f=input.nextDouble();
		
		System.out.printf("Output: %.2f",(f-32)/1.8);
	}
}
