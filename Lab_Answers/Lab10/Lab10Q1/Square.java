// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 1

import java.util.*;
public class Square extends Shape{
	private double sideLength;
	
	public void acceptInput()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Side Length: ");
		sideLength=input.nextDouble();
	}
	
	public void computePerimeterArea()
	{
		this.setPerimeter(sideLength*4);
		this.setArea(sideLength*sideLength);
	}
}
