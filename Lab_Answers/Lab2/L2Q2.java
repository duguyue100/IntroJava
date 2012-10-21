// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 2 Question 2

import java.util.Scanner;
public class L2Q2 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("The Price of the Car: ");
		double p=input.nextDouble();
		
		System.out.print("Down payment: ");
		double d=input.nextDouble();
		
		System.out.print("Interest Ratein %: ");
		double r=input.nextDouble();
		
		System.out.print("Loan duration in Year: ");
		double y=input.nextDouble();
		
		System.out.printf("Monthly Payment: %.2f\n", (p-d)*(1+r*y/100)/(y*12));
		
	}
}
