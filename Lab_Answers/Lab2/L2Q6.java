// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 2 Question 6

import java.text.NumberFormat;
import java.util.*;
public class L2Q6 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter P: ");
		double p=input.nextDouble();
		System.out.print("Enter R: ");
		double r=input.nextDouble();
		System.out.print("Enter n: ");
		double n=input.nextDouble();
		
		// notice, a fomatter here.
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.println("Money earned after "+n+" years: "+formatter.format(p*(1-Math.pow(r/100, n))/(1-r/100)));
	}
}
