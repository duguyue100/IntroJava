// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2010 I 4

public class PerfectSquare extends IntegerNumber{
	public PerfectSquare(int n, int max)
	{
		this.N=n;
		this.Max=max;
	}
	
	public boolean isPerfect(int num)
	{
		double temp=((int)Math.sqrt((double)num))*((int)Math.sqrt((double)num));
		if ((temp-num)==0)
			return true;
		else return false;
	}
	
	public void generate()
	{
		int i=0;
		
		System.out.println("Perfect Square Number: N = "+this.N+" Max = "+this.Max);
		while (i!=this.N)
		{
			int num=(int)Math.ceil(Math.random()*this.Max);
			if (isPerfect(num)==true)
			{
				System.out.print(num+" ");
				i++;
			}
		}
		System.out.println();
	}
}
