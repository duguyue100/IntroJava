// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 2 Question 4

import java.util.*;
public class L2Q4 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double money=input.nextDouble();
		int coins=(int)(money*100);
		
		System.out.println("50 cents: "+coins/50);
		coins-=50*(coins/50);
		System.out.println("20 cents: "+coins/20);
		coins-=20*(coins/20);
		System.out.println("10 cents: "+coins/10);
		coins-=10*(coins/10);
		System.out.println("5  cents: "+coins/5);
		coins-=5*(coins/5);
		System.out.println("1  cents: "+coins);
	}
}
