// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2010 II D 1

public class Rectangle2DTest {
	public static void main(String[] args)
	{
		Rectangle2D r1=new Rectangle2D(2,2,5.5,4.9);
		
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		
		System.out.println(r1.contains(3, 3));
		System.out.println(r1.contains(new Rectangle2D(4,5,10.5,3.2)));
		System.out.println(r1.overlaps(new Rectangle2D(3,5,2.3,5.4)));
	}
}
