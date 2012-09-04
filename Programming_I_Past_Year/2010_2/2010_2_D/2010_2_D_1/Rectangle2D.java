// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2010 II D 1

public class Rectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;
	
	public Rectangle2D()
	{
		x=0;
		y=0;
		width=1;
		height=1;
	}
	
	public Rectangle2D(double setX, double setY, double w, double h)
	{
		x=setX;
		y=setY;
		width=w;
		height=h;
	}
	
	public void setX(double setx)
	{
		x=setx;
	}
	
	public void setY(double setY)
	{
		y=setY;
	}
	
	public void setWidth(double w)
	{
		width=w;
	}
	
	public void setHeight(double h)
	{
		height=h;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getArea()
	{
		return width*height;
	}
	
	public double getPerimeter()
	{
		return 2*(width+height);
	}
	
	public boolean contains(double x, double y)
	{
		if (((x<=this.x+width/2)&&(x>=this.x-width/2))&&
			((y<=this.y+height/2)&&(y>=this.y-height/2)))
			return true;
		else return false;
	}
	
	public boolean contains(Rectangle2D r)
	{
		if (contains(r.getX()+r.getWidth()/2,r.getY())==true &&
			contains(r.getX()-r.getWidth()/2,r.getY())==true &&
			contains(r.getX(),r.getY()+r.getHeight()/2)==true &&
			contains(r.getX(),r.getY()-r.getHeight()/2)==true)
			return true;
		else return false;
	}
	
	public boolean overlaps(Rectangle2D r)
	{
		if (contains(r)==false)
		{
			if (contains(r.getX()+r.getWidth()/2,r.getY())==true ||
				contains(r.getX()-r.getWidth()/2,r.getY())==true ||
				contains(r.getX(),r.getY()+r.getHeight()/2)==true ||
				contains(r.getX(),r.getY()-r.getHeight()/2)==true)
				return true;
			else return false;
		}
		else return false;
	}
}
