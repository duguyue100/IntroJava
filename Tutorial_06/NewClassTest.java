// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Tutorial 01 06
public class NewClassTest {
	public static void main(String[] args)
	{
		NewClass t1=new NewClass();// something funny here.
		NewClass t2=new NewClass(5);
		
		System.out.println(t1.foo(5));
		System.out.println(t2.foo(5));
	}
}
