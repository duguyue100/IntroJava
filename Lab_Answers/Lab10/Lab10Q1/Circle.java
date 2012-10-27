// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 1

import java.util.*;
public class Circle extends Shape {
	private double diameter;
	
	public void acceptInput()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Diameter: ");
		diameter=input.nextDouble();
	}
	
	public void computePerimeterArea()
	{
		this.setPerimeter(Math.PI*diameter);
		this.setArea(Math.PI*(diameter/2)*(diameter/2));
	}
}
