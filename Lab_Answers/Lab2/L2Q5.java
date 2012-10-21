// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 2 Question 5

import java.util.*;
public class L2Q5 {
	public static void main(String[] args)
	{
		Random number=new Random();
		int n=number.nextInt(10000);
		
		System.out.println(n);
		int sum=0;
		sum+=n/10000;
		n-=(n/10000)*10000;
		sum+=n/1000;
		n-=(n/1000)*1000;
		sum+=n/100;
		n-=(n/100)*100;
		sum+=n/10;
		n-=(n/10)*10;
		sum+=n;
		
		System.out.println(sum);
		
	}
}
