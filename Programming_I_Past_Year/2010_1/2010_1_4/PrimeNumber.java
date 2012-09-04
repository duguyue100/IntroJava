// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2010 I 4

public class PrimeNumber extends IntegerNumber {
	
	public PrimeNumber(int n,int max)
	{
		this.N=n;
		this.Max=max;
	}
	
	public boolean check(int number)
	{
		if (number<2) return false;
		for (int i=2;i<=Math.floor(Math.sqrt(number));i++)
		{
			if (number%i==0)
				return false;
		}
		return true;
	}
	
	public void generate()
	{
		int i=0;
		
		System.out.println("Prime Number: N = "+N+" Max = "+Max);
		System.out.println("The random prime numbers are: ");
		while (i!=this.N)
		{
			int num=0;
			boolean flag=false;
			num=(int)Math.ceil(Math.random()*this.Max);
			flag=check(num);
			if (flag==true)
			{
				System.out.print(num+" ");
				i++;
			}
		}
		System.out.println();
	}
}
