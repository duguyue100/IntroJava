// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 8 Question 1

import java.util.*;
public class Point {
	private int x;
	private int y;
	private int z;
	public static int count=0;
	public Point(int xi, int yi, int zi)
	{
		count++;
		x=xi;
		y=yi;
		z=zi;
	}
	
	public Point(Point p)
	{
		count++;
		x=p.getX();
		y=p.getY();
		z=p.getZ();
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getZ()
	{
		return z;
	}
	
	public double distance()
	{
		return Math.sqrt(x*x+y*y+z*z);
	}
	
	public void numberOfPoint()
	{
		System.out.println("Number of Point Objects: "+count);
	}
}
