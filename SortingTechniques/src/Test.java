public class Test
{
  int arr[],i=0,j=0;
  Test()
  {
	  
  }
  void bubblesort(int arr[])
  {
	  System.out.println("Sorted order");
	  for(i=0;i<7;i++)
	  {
		  for(j=0;j<6;j++)
		  {
			  if(arr[j]>arr[j+1])
			  {
				  int temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
		  }
	  }
	  for(i=0;i<7;i++)
	  {
		  System.out.println(arr[i]);
	  }
  }
}