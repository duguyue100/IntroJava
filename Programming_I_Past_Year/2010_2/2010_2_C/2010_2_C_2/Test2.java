// Author: Hu Yuhuang
// Email: duugyue100
// Programming I: 2010 II C 2

public class Test2 {
	public static void main(String[] args)
	{
		final int MAX=5;
		int[] alpha=new int[MAX];
		doSomething(alpha);
	}
	
	public static void doSomething(int[] a)
	{
		a[0]=5;
		for (int c=1;c<a.length;c++)
		{
			a[c]=5*c+10;
			a[c-1]=a[c]-4;
		}
		for (int c=0;c<a.length;c++)
			System.out.println(a[c]+ " ");
	}
}
