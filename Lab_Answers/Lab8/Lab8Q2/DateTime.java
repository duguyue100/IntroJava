// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 8 Question 2

import java.util.*;
public class DateTime {
	private int day;
	private int month;
	private int year;
	private int hour;
	private int minute;
	private int second;
	
	public DateTime(int d, int m, int y, int h, int min, int s)
	{
		day=d;
		month=m;
		year=y;
		hour=h;
		minute=min;
		second=s;
	}
	
	public void normalize()
	{
		if (second>=60)
		{
			minute++;
			second-=60;
		}
		if (minute>=60)
		{
			hour++;
			minute-=60;
		}
		if (hour>=24)
		{
			day++;
			hour-=24;
		}
		if (day>31)
		{
			month++;
			day-=31;
		}
		if (month>12)
		{
			year++;
			month-=12;
		}
	}
	
	public void addTime(int s)
	{
		second+=s;
		normalize();
	}
	
	public void addTime(int s, int min)
	{
		second+=s;
		minute+=min;
		normalize();
	}
	
	public void addTime(int s, int min, int h)
	{
		second+=s;
		minute+=min;
		hour+=h;
		normalize();
	}
	
	public void print()
	{
		System.out.println(day+"/"+month+"/"+year+" "+hour+":"+minute+":"+second);
	}
}
