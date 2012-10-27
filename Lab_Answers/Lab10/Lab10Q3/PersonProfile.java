// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 3

import java.util.*;
public class PersonProfile {
	private String name;
	private String gender;
	private String dateOfBirth;
	
	public PersonProfile(String n, String g, String d)
	{
		name=n;
		gender=g;
		dateOfBirth=d;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Date of Birth: "+dateOfBirth);
	}
}
