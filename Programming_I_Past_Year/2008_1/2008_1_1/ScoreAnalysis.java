// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programmin I: 2008 I 1

import java.util.Scanner;
public class ScoreAnalysis {
	public static void main(String args[])
	{
		Scanner inputN=new Scanner(System.in);
		float[] marks;
		System.out.print("Please enter the number of students: ");
		int n=inputN.nextInt();
		
		marks=new float[n];
		// getMarks;
		marks=getMarks(marks);
		// printMarks
		printMarks(marks);
		// getMean
		System.out.printf("The mean is %.2f\n",getMean(marks));
		// getMedian
		System.out.println("The median is "+getMedian(marks));
		// call printMarks again.
		printMarks(marks);
		
	}
	
	public static float[] getMarks(float[] marks)
	{
		
		Scanner inputF=new Scanner(System.in);
		
		for (int i=0;i<marks.length;i++)
		{
			System.out.print("Please input a score: ");
			marks[i]=inputF.nextFloat();
		}
		return marks;
	}
	
	public static void printMarks(float[] marks)
	{
		System.out.print("Marks: ");
		for (int i=0;i<marks.length;i++)
			System.out.printf("%.1f ", marks[i]);
		System.out.println();
	}
	
	public static float getMean(float[] marks)
	{
		float sum=0;
		for (int i=0;i<marks.length;i++)
			sum+=marks[i];
		return sum/marks.length;
	}
	
	public static float getMedian(float[] marks)
	{
		for (int i=0;i<marks.length-1;i++)
			for (int j=marks.length-1;j>=i+1;j--)
				if (marks[j-1]>marks[j])
				{
					float t=marks[j-1];
					marks[j-1]=marks[j];
					marks[j]=t;
				}
		
		return marks[marks.length/2];
	}
	/*
	public static int[][] getGrade(float[] marks)
	{
		for (int i=0;i<marks.length;i++)
		{
			
		}
	}
	
	public static void printGradeDistribution(int[][] grades)
	{
		
	}
	
	public static void printGradeHistogram(int[][] grades, int total)
	{
		
	}
	*/
}
