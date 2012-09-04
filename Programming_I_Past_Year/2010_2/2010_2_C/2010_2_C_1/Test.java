// Author: Hu Yuhuang
// Email: duugyue100
// Programming I: 2010 II C 1

public class Test {
	public static void main(String[] args)
	{
		int i=1;
		while (i++<=5)
		{
			xMethod(i);
		}
		System.out.println("i is "+i);
	}
	
	public static void xMethod(int i)
	{
		do
		{
			if (i%2!=1)
				System.out.print(i+" ");
			i--;
		}while (i>=1);
		System.out.println();
	}
}
