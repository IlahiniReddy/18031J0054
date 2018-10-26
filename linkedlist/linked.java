package LinkedList;

public class linked 
{
	Node1 head;
	void insert(int data)
	{
		Node1 n=new Node1(data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node1 temp;
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
		
	}
	void display()
	{
		if(head!=null)
		{

			Node1 temp;
			temp=head;
			while(temp!=null)
			{
				System.out.println("" +temp.data);
				temp=temp.next;
			}
		}
	}
		void deleteAtFront()
		{
			Node1 temp;
			temp=head;
			if(temp!=null)
			{
				head=head.next;
			}
		}
		void deleteAtLast()
		{
				Node1 temp;
				temp=head;
				while(temp.next.next!=null)
				{
					temp=temp.next;
				}
				temp.next=null;
			}
		void deleteAtMiddle(int data)
		{
			
			Node1 temp=head.next;
		    Node1 temp2 = head;
			while(temp.data!=data)
			{
				temp=temp.next;
				temp2=temp2.next;
			}
			temp2.next=temp.next;
		}
		void insertAtposition(int data1, int data)
		{
			Node1 temp=head.next;
		    Node1 temp2 = head;
			while(temp.data!=data)
			{
				temp=temp.next;
				temp2=temp2.next;
			}
			temp2.next=temp.next;
			Node1 n=new Node1(data1);
			n.next=temp2.next;
			temp2.next=n;
		}
		} 
		
	
	


