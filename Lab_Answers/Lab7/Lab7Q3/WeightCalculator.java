// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 7 Question 3

import java.util.*;
public class WeightCalculator {
	private int age;
	private double height;
	
	public WeightCalculator()
	{
		
	}
	
	public WeightCalculator(int a, int h)
	{
		age=a;
		height=h;
	}
	
	public void setAge(int a)
	{
		age=a;
	}
	
	public void setHeight(double h)
	{
		height=h;
	}
	
	public double Calculator(int a, double h)
	{
		return (h-100+(double)a/10)*0.9;
	}
	
	public void print()
	{
		System.out.println("Recommend Weight: "+Calculator(age,height));
	}
}
