// Author: Hu Yuhuang
// Email: duguyue100
// Programming I: 2011 II 4

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle()
	{
		length=0;
		width=0;
	}
	
	public Rectangle(double l, double w)
	{
		length=l;
		width=w;
	}
	
	public void setLength(double l)
	{
		length=l;
	}
	
	public void setWidth(double w)
	{
		width=w;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double area()
	{
		return length*width;
	}
	
	public double perimeter()
	{
		return 2*(length+width);
	}
	
	public String toString()
	{
		return "Length: "+Double.toString(length)+
				" Width: "+Double.toString(width)+
				" Area: "+Double.toString(this.area())+
				" Perimeter: "+Double.toString(this.perimeter());
	}
}
