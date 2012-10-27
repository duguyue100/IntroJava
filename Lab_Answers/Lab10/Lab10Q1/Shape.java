// Author: Hu Yuhuang
// Email: duguyue100@gmail.cim
// Lab 10 Question 1


public class Shape {
	private String name;
	private double perimeter;
	private double area;
	
	public void setPerimeter(double p)
	{
		perimeter=p;
	}
	
	public void setArea(double a)
	{
		area=a;
	}
	
	public double getPerimeter()
	{
		return perimeter;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.printf("Perimeter: %.2f\n", perimeter);
		System.out.printf("Area: %.2f\n", area);
	}
}
