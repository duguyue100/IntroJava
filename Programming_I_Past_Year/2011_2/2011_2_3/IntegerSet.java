// Author: Hu Yuhuang
// Email: duguyue100
// Programming I: 2011 II 3

public class IntegerSet {
	public boolean[] set=new boolean[11];
	
	public IntegerSet()
	{
		for (int i=0;i<set.length;i++)
			set[i]=false;
	}
	
	public IntegerSet unionOfIntegerSets(IntegerSet s)
	{
		IntegerSet result=new IntegerSet();
		for (int i=0;i<set.length;i++)
			if (set[i]==true || s.set[i]==true)
				result.set[i]=true;
		
		return result;
	}
	
	public IntegerSet intersectionOfIntegerSets(IntegerSet s)
	{
		IntegerSet result=new IntegerSet();
		for (int i=0;i<set.length;i++)
			if (set[i]==true && s.set[i]==true)
				result.set[i]=true;
		
		return result;
	}
	
	public void insertElement(int k)
	{
		if (k>=0 && k<=10)
			set[k]=true;
	}
	
	public void deleteElement(int m)
	{
		if (m>=0 && m<=10)
			set[m]=true;
	}
	
	public boolean isEuqalTo(IntegerSet s)
	{
		for (int i=0;i<set.length;i++)
			if (set[i]!=s.set[i])
				return false;
		return true;
	}
	
	public void setPrint()
	{
		boolean flag=true;
		for (int i=0;i<set.length;i++)
			if (set[i]==true)
			{
				flag=false;
				break;
			}
		if (flag==false)
		{
			for (int i=0;i<set.length;i++)
				if (set[i]==true)
					System.out.print(i+" ");
			System.out.println();
		}
		else System.out.println("---");
	}
}
