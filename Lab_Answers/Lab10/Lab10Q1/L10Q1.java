// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 1

import java.util.*;
public class L10Q1 {
	public static void main(String[] args)
	{
		Rectangle rec=new Rectangle();
		rec.acceptInput();
		rec.computePerimeterArea();
		rec.display();
		
		Square sq=new Square();
		sq.acceptInput();
		sq.computePerimeterArea();
		sq.display();
		
		Circle c=new Circle();
		c.acceptInput();
		c.computePerimeterArea();
		c.display();
	}
}
