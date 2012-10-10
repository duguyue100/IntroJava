// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Tutorial 01 02
public class Calculation {
	public static void main(String[] args)
	{
		int a=1,b=2;
		
		int plus=a+b;
		int mins=a-b;
		int times=a*b;
		double divide=(double)a/b; // something different if there is not (double).
		
		System.out.println(plus+" "+mins+" "+times+" "+divide);
		// Seriously? That's what you want to show?
		// More complex euqation.
		
		double equation=((a*b)-(a/b))/Math.sqrt(a+b);
		System.out.println(equation);
	}
}