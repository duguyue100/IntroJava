// Author: Hu Yuhuang
// Email: duguyue100
// Programming I: 2011 II 4

public class Box extends Rectangle{
	private double height;
	
	public Box()
	{
		height=0;
	}
	
	public Box(double h)
	{
		height=h;
	}
	
	public void setHeight(double h)
	{
		height=h;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double area()
	{
		return 2*(this.getWidth()*this.getHeight()+this.getLength()*height+
				this.getWidth()*height);
	}
	
	public double volume()
	{
		return this.getHeight()*this.getWidth()*height;
	}
	
	public String toString()
	{
		return "Length: "+Double.toString(this.getLength())+
				" Width: "+Double.toString(this.getWidth())+
				" Height: "+Double.toString(height)+
				" Area: "+Double.toString(this.area())+
				" Vlume: "+Double.toString(this.volume());
	}
}
