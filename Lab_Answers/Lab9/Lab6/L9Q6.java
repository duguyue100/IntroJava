// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 9 Question 6

import java.util.*;
public class L9Q6 {
	public static void main(String[] args) throws MultiplyByZeroException
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		if (m==0)
			throw new MultiplyByZeroException("Multiply by zero");
	}
}
