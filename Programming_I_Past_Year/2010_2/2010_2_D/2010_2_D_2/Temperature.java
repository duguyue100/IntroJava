// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2010 II D 2

public class Temperature {
	private int daysInMonth;
	private int[] maxTemp;
	private int[] minTemp;
	
	public Temperature()
	{
		
	}
	
	public Temperature(int[] maxtemp, int [] mintemp, int days)
	{
		daysInMonth=days;
		maxTemp=maxtemp;
		minTemp=mintemp;
	}
	
	public void setTemp(int[] maxtemp, int [] mintemp, int days)
	{
		daysInMonth=days;
		maxTemp=maxtemp;
		minTemp=mintemp;
	}
	
	public int monthMaxTempDay()
	{
		int max=maxTemp[1];
		for (int i=2;i<maxTemp.length;i++)
			if (maxTemp[i]>max)
				max=maxTemp[i];
		return max;
	}
	
	public int averageMaxTemp()
	{
		int sum=0;
		for (int i=1;i<maxTemp.length;i++)
			sum+=maxTemp[i];
		return Math.round(sum/(maxTemp.length-1));
	}
	
	public int monthMinTempDay()
	{
		int min=minTemp[1];
		for (int i=2;i<minTemp.length;i++)
			if (minTemp[i]<min)
				min=minTemp[i];
		return min;
	}
	
	public int averageMinTemp()
	{
		int sum=0;
		for (int i=1;i<minTemp.length;i++)
			sum+=minTemp[i];
		return Math.round(sum/(minTemp.length-1));
	}
	
	public String toString()
	{
		return Integer.toString(this.monthMaxTempDay())+" "+
			Integer.toString(this.monthMinTempDay())+" "+
			Integer.toString(this.averageMaxTemp())+" "+
			Integer.toString(this.averageMinTemp());
	}
	
}
