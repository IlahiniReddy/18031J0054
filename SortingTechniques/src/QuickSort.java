
class QuickSort 
{ 
    int partition(int arr[], int l, int r) 
    { 
        int pivot = arr[l];  
        int i = l;
        int j=r;
        while(i<=j)
        { 
        	while(arr[i]<pivot)
        	{
        		i++;
        	}
        	
        	while(arr[j]>pivot)
        	{
        		j--;
        	}
        	
        	if(i<=j)
           {
        		int temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        		i++;
        		j--;
        	}
        }
        return i;
      } 
    void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            int pi = partition(arr, l, r);  
            sort(arr, l, pi-1); 
            sort(arr, pi+1, r); 
        } 
    } 
  
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = {3,0,9,8,1,10,5}; 
       int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 