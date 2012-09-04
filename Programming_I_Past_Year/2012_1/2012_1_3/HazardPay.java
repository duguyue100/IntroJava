// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2012 I 2

public class HazardPay extends PayCalculator{
	public double computePay(double hours)
	{
		return super.computePay(hours)*1.5;
	}
}
