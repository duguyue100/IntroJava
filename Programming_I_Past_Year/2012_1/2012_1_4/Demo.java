// Author: Hu Yuhuang
// Email: duguyue100
// Programming I: 2012 I 4

public class Demo {
	public static void main(String[] args)
	{
		System.out.println("The output is:");
		bar(11156);
		System.out.println();
		System.out.println(oddNumber(11156));
		int[] a={1,2,3,4,5,6,7,8,9,10};
		System.out.println(sumArray(a,0));
	}
	
	public static void bar(int number)
	{
		if (number>0)
		{
			int d=number%10;
			boolean odd=(number/10)%2==1;
			bar(number/10);
			if (odd)
				System.out.print(d/2+5);
			else
				System.out.print(d/2);
		}
	}
	
	// 4b
	public static int oddNumber(int number)
	{
		if (number>0)
		{
			int d=number%10;
			if (d%2==1) return oddNumber(number/10)+1;
			else return oddNumber(number/10);
		}
		else return 0;
	}
	
	// 4c
	public static int sumArray(int[] a,int i)
	{
		if (i<a.length)
			return a[i]+sumArray(a, i+1);
		else return 0;
	}
}
