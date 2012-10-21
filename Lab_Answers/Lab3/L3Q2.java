// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab3 Question 2

import java.util.*;
public class L3Q2 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("First number: ");
		int n1=input.nextInt();
		System.out.print("Second number: ");
		int n2=input.nextInt();
		
		System.out.print("Operator: ");
		Scanner inputS=new Scanner(System.in);
		String operator=inputS.next();
		char op=operator.charAt(0);
		
		if (op=='+')
			System.out.println("Result: "+(n1+n2));
		else if (op=='-')
			System.out.println("Result: "+(n1-n2));
		else if (op=='*')
			System.out.println("Result: "+(n1*n2));
		else if (op=='/')
			System.out.println("Result: "+(n1/n2));
		else if (op=='%')
			System.out.println("Result: "+(n1%n2));
	}
}
