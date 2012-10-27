// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 1

import java.util.*;
public class Rectangle extends Shape{
	private double sideLength1;
	private double sideLength2;
	
	public void acceptInput()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Length: ");
		sideLength1=input.nextDouble();
		System.out.print("Width: ");
		sideLength2=input.nextDouble();
	}
	
	public void computePerimeterArea()
	{
		this.setPerimeter((sideLength1+sideLength2)*2);
		this.setArea(sideLength1*sideLength2);
	}
}
