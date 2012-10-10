// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Tutorial 01 04
public class Function {
	public static void main(String[] args)
	{
		int n;
		
		n=10;
		System.out.println(foo(n));
		
		n=0;
		System.out.println(foo(n));
	}
	
	public static int foo(int n)
	{
		if (n==0) return 1;
		else return n-1;
	}
}
