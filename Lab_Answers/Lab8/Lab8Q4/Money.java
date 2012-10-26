// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 8 Question 4

import java.util.*;
public class Money {
	private double money;
	
	public Money()
	{
		money=0;
	}
	
	public Money(double m)
	{
		money=m;
		rounding();
	}
	
	public void setMoney(double mon)
	{
		money=mon;
	}
	
	public double getMoney()
	{
		return money;
	}
	
	public void rounding()
	{
		int n=(int)((money-(int)money)*100)%10;
		if (n<=2&&n>=1)
			money=(int)money+(double)((int)Math.ceil((money-(int)money)*100)/10)*10/100;
		if (n>=3&&n<=7)
			money=(int)money+(double)(((int)Math.ceil((money-(int)money)*100)/10)*10+5)/100;
		if (n>=8&&n<=9)
			money=(int)money+(double)(((int)Math.ceil((money-(int)money)*100)/10)*10+10)/100;
	}
	
	public Money addition(Money m)
	{
		return new Money(m.getMoney()+money);
	}
	
	public Money subtraction(Money m)
	{
		return new Money(money-m.getMoney());
	}
	
	public void print()
	{
		int notes=(int)(money*100)/100;
		int coins=(int)(money*100)%100;
		
		System.out.println("RM100: "+(notes/100));
		notes=notes%100;
		System.out.println("RM50: "+(notes/50));
		notes=notes%50;
		System.out.println("RM10: "+(notes/10));
		notes=notes%10;
		System.out.println("RM5: "+(notes/5));
		notes=notes%5;
		System.out.println("RM1: "+notes);
		
		System.out.println("50 Cents: "+(coins/50));
		coins=coins%50;
		System.out.println("20 Cents: "+(coins/20));
		coins=coins%20;
		System.out.println("10 Cents: "+(coins/10));
		coins=coins%10;
		System.out.println("5 Cents: "+(coins/5));
	}
}
