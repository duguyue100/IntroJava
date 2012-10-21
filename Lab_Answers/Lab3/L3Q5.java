// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 3 Question 5

import java.util.*;
public class L3Q5 {
	public static void main(String[] args)
	{
		Random num=new Random();
		
		int p1=num.nextInt(5)+num.nextInt(5)+2;
		int p2=num.nextInt(5)+num.nextInt(5)+2;
		
		System.out.println("Player 1: "+p1);
		System.out.println("Player 2: "+p2);
		if (p1>p2)
			System.out.println("Player 1 wins");
		else if (p1<p2)
			System.out.println("Player 2 wins");
		else if (p1==p2)
			System.out.println("tie");
	}
}
