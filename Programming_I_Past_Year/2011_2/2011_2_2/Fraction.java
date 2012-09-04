// Author: Hu Yuhuang
// Email: duguye100
// Programming I: 2011 II 2

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction()
	{
		
	}
	
	public Fraction(int n, int d)
	{
		if (d!=0)
		{
			numerator=n;
			denominator=d;
		}
	}
	
	public void setNumerator(int n)
	{
		numerator=n;
	}
	
	public void setDenominator(int d)
	{
		denominator=d;
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public Fraction add(Fraction frac)
	{
		return new Fraction(this.numerator*frac.getDenominator()+
				this.denominator*frac.getNumerator(),
				this.denominator*frac.getDenominator());
	}
	
	public Fraction subtract(Fraction frac)
	{
		return new Fraction(this.numerator*frac.getDenominator()-
				this.denominator*frac.getNumerator(),
				this.denominator*frac.getDenominator());
	}
	
	public Fraction multiply(Fraction frac)
	{
		return new Fraction(this.numerator*frac.getNumerator(),
				this.denominator*frac.getDenominator());
	}
	
	public Fraction divide(Fraction frac)
	{
		return new Fraction(this.numerator*frac.getDenominator(),
				this.denominator*frac.getNumerator());
	}
}
