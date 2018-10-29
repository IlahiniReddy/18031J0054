package sorting;
import java.util.Scanner;
class selection
{
	int arr[],i=0,j=0,temp=0,min=0;
	selection(int size)
	{
		arr=new int[size];
	}
	void selectionsort(int arr[])
	{
		    int size=arr.length;
			System.out.println("Sorted order");
			for(i=0;i<size;i++)
			{
				min=i;
			for(j=i+1;j<size;j++)
			{
				if(arr[j]<arr[j+1])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=min;
			min=temp;
			}
	}
}
public class Selectionsort {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter array size");
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    selection s=new selection(size);
	    
        System.out.println("enter the array elements");
		
		int[] arr = new int[size];
		for( int i=0;i<size;i++)
		{
			 arr[i] = sc.nextInt();
		}
		System.out.println("Unsorted order");
		for( int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		s.selectionsort(arr);
		

	}

}
