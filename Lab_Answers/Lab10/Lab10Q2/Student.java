// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 2

import java.util.*;
import java.io.*;
public class Student extends PersonProfile{
	private ArrayList<Course> courseList;
	private String fileName;
	
	public Student(String n, String g, String d, String fn)
	{
		super(n,g,d);
		fileName=fn;
		Scanner input=null;
		try
		{
			input=new Scanner(new File(fileName));
		}
		catch (Exception e)
		{
			System.exit(1);
		}
		
		courseList=new ArrayList<Course>();
		
		while (input.hasNextLine())
		{
			Course c=new Course();
			c.courseCode=input.nextLine();
			c.courseName=input.nextLine();
			c.session=input.nextInt();
			c.semester=input.nextInt();
			c.mark=input.nextDouble();
			courseList.add(c);
			if (input.hasNextLine())
				input.nextLine();
		}
	}
	
	public String getGrade(Course c)
	{
		if (c.mark>=85)
			return "A";
		else if (c.mark>=75 && c.mark<85)
			return "A-";
		else if (c.mark>=70 && c.mark<75)
			return "B+";
		else if (c.mark>=65 && c.mark<70)
			return "B";
		else if (c.mark>=60 && c.mark<65)
			return "B-";
		else if (c.mark>=55 && c.mark<60)
			return "C+";
		else if (c.mark>=50 && c.mark<55)
			return "C";
		else if (c.mark>=45 && c.mark<50)
			return "D";
		else if (c.mark>=35 && c.mark<45)
			return "E";
		else return "F";
	}
	
	public void display()
	{
		super.display();
		System.out.println("Courses:");
		for (int i=0;i<courseList.size();i++)
		{
			System.out.println(courseList.get(i).courseCode+" "+courseList.get(i).courseName+" "+courseList.get(i).session+" "+courseList.get(i).session+" "+getGrade(courseList.get(i)));
		}
	}
}
