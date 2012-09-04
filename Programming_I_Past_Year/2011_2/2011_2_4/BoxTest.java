// Author: Hu Yuhuang
// Email: duguyue100
// Programming I: 2011 II 4

public class BoxTest {
	public static void main(String[] args)
	{
		Rectangle rec=new Rectangle();
		Box box=new Box();
		
		rec.setLength(5);
		rec.setWidth(3);
		
		box.setLength(6);
		box.setWidth(5);
		box.setHeight(4);
		
		System.out.println(rec.toString());
		System.out.println(box.toString());
	}
}
