package finalpc;

import java.util.Scanner;

public class Sd
{	
  static String name;
  static int marks;
  Sd left;
  Sd right;
  Sd(String name, int marks)
  {
	  this.name=name;
	  this.marks=marks;
  }
  public class StudentData
  {
	  StudentData root=null;
	  StudentData()
	  {
		  
	  }
	  
  public void insert(String name,int marks)
  {
	  StudentData sd=new StudentData();
		if(root == null)
		{
			root = sd;
			return;
		}
		else
		{
			StudentData temp = root;
			StudentData parent = null;
		while(true)
		{
			StudentData current;
			parent=current;
		    if(name<current.marks)
		    {
		     current=current.left;
		     if(current==null)
		     {
		      parent.left=sd;
		      return;
		     }
		    }
		    else if(name>current.marks)
		    {
		     current=current.right;
		     if(current==null)
		     {
		      parent.right=sd;
		      return;
		     }
		    }
		  } 
		 }
  }
		
		

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StudentData sd=new StudentData();
	    
		
		int data;
		int ch;
		do
		{
			System.out.println("1.Enter details\n 2.Display");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1 : 
					System.out.println("Enter student name\n");
					System.out.println("Enter student marks");
					sd.insert(name, marks);
		

	}

}
}