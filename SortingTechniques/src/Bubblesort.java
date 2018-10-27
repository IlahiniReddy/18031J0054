import java.util.Scanner;

public class Bubblesort
{
	public static void main(String args[])
	{
		Test b=new Test();
		int arr[] = new int[7];
		System.out.println("Enter elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		System.out.println("Unsorted order");
		for(int i=0;i<7;i++)
		{
			System.out.println(arr[i]);
		}
		b.bubblesort(arr);
	}

}			  
	

