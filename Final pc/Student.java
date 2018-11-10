package finalpc;

import java.util.Scanner;

public class Student
{
	String name;
	int roll_no;
	double marks;
Student(String n,int r,double m)
{
	this.name=n;
	this.roll_no=r;
	this.marks=m;
}
public int getroll_number1()
{
	return roll_no;
}
public int getroll_number2()
{
	return roll_no;
	
}

 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter student name");
	 System.out.println("Enter student roll number");
	 System.out.println("Enter student marks");
	 
 }
}
