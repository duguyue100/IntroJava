// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2010 I 4

public class IntegerNumber {
	String name;
	int N;
	int Max;
	
	public void setN(int n)
	{
		N=n;
	}
	
	public void setMax(int max)
	{
		Max=max;
	}
	
	public int getN()
	{
		return N;
	}
	
	public int getMax()
	{
		return Max;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(N);
		System.out.println(Max);
	}
}
