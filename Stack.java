package stack;

public class Stack {
	int arr[];
	int top;
	Stack()
	{
		arr=new int[100];
		top=-1;
	}
	void push(int d)
	{
		if(top>100)
		{
			System.out.println("stack overflow");
		}
		else
		{
			arr[++top]=d;
			System.out.println( d+ "Element inserted");
		}
	}
	int pop()
	{
	  int d=0;
	  if(top < 0)
	  {
	  System.out.println( "Stack Underflow");
	  return 0;
	  }
	  else
	  {
	     d = arr[top--];
	   
	  }
	  return d;

	}
	void isEmpty()
	{
	  if(top < 0)
	  {
	    System.out.println( " Stack is empty");
	  }
	  else
	  {
	    System.out.println( "Stack is not empty");
	  }
	}

	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop()+"popped from stack");
		s.isEmpty();
	}
	}
	



