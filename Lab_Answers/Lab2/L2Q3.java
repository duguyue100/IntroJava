// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 2 Question 3

import java.util.*;
public class L2Q3 {
	public static void main(String[] args)
	{
		Random number=new Random();
		
		int n1=number.nextInt(100);
		int n2=number.nextInt(100);
		int n3=number.nextInt(100);
		
		System.out.println("Sum: "+(n1+n2+n3)+"\n"+"Average: "+((double)(n1+n2+n3)/3));
	}
}
