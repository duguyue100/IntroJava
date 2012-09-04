// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2009 II 5

public class Service {
	String service;
	double price;
	int time;
	
	public Service(String s, double p, int t)
	{
		service=s;
		price=p;
		time=t;
	}
	
	public String getService()
	{
		return service;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getTime()
	{
		return time;
	}
}
