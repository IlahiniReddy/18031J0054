package LinkedList;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		linked l=new linked();
		int m=0;
		do
		{
			System.out.println("Enter your choice\n 1.Insert\n 2.Display\n 3.DeleteAtFront\n 4.DeleteAtLast\n 5.DeleteAtMiddle\n "
					+ "6.insertAtposiion");
			int z=sc.nextInt();
			switch(z)
			{
			case 1:
			{
				System.out.println("Enter node to be inserted");
				int data=sc.nextInt();
			    l.insert(data);
			break;
		}
			case 2:
			{
				System.out.println("Inserted elements are:");
				l.display();
				break;
			}
			case 3:
			{
				//System.out.println("Enter node to be deleted");
	
			l.deleteAtFront();
			break;
			}
			case 4:
			{
				l.deleteAtLast();
				break;
			}
			case 5:
			{
				System.out.println("Enter element to be deleted");
				int s=sc.nextInt();
				l.deleteAtMiddle(s);
				break;
			}
			case 6:
			{
				System.out.println("Enter the position to be inserted");
				int pos=sc.nextInt();
				System.out.println("Enter element to be inserted");
				int ele=sc.nextInt();
				l.insertAtposition(pos, ele);
				
				}
			}
			
			System.out.println("do you want to continue press 1");
			m=sc.nextInt();
    }while(m==1);
}
}
