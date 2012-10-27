// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 3

import java.util.*;
import java.io.*;
public class Lecturer extends PersonProfile {
	private ArrayList<Course> courseList;
	private String fileName;
	
	public Lecturer(String n, String g, String d, String fn)
	{
		super(n,g,d);
		fileName=fn;
		Scanner input=null;
		try
		{
			input=new Scanner(new File(fn));
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
			c.credit=input.nextDouble();
			c.noOfStudents=input.nextInt();
			courseList.add(c);
			if (input.hasNextLine())
				input.nextLine();
		}
	}
	
	public double computeCredit(Course c)
	{
		if (c.noOfStudents>=150)
			return c.credit*3;
		else if (c.noOfStudents<150 && c.noOfStudents>=100)
			return c.credit*2;
		else if (c.noOfStudents<100 && c.noOfStudents>=50)
			return c.credit*1.5;
		else return c.credit;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Course: ");
		for (int i=0;i<courseList.size();i++)
			System.out.println(courseList.get(i).courseCode+" "+courseList.get(i).courseName+" "+courseList.get(i).semester+" "+courseList.get(i).session+" "+computeCredit(courseList.get(i))+" "+courseList.get(i).noOfStudents);
	}
}
