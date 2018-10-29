package sorting;

class mergesort
{ 
	
	void merge(int arr[], int left, int mid, int right) 
	{ 
		
		int s1 = mid - left + 1; 
		int s2 = right - mid; 

		int l[] = new int [s1]; 
		int r[] = new int [s2]; 

		
		for (int i=0; i<s1; ++i) 
			l[i] = arr[left + i]; 
		for (int j=0; j<s2; ++j) 
			r[j] = arr[mid + 1+ j]; 

		int i = 0, j = 0; 

		int k = left; 
		while (i < s1 && j < s2) 
		{ 
			if (l[i] <= r[j]) 
			{ 
				arr[k] = l[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = r[j]; 
				j++; 
			} 
			k++; 
		} 

		while (i < s1) 
		{ 
			arr[k] = l[i]; 
			i++; 
			k++; 
		} 

		while (j < s2) 
		{ 
			arr[k] = r[j]; 
			j++; 
			k++; 
		} 
	} 
 
	void sort(int arr[], int left, int right) 
	{ 
		if (left < right) 
		{ 
			int mid = (left+right)/2;
			sort(arr, left, mid); 
			sort(arr , mid+1, right);  
			merge(arr, left, mid, right); 
		} 
	} 


	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	
	public static void main(String args[]) 
	{ 
		int arr[] = {50,0,9,-10,20,61,32,0}; 

		System.out.println("Given Array is"); 
		printArray(arr); 

		mergesort m = new mergesort(); 
		m.sort(arr, 0, arr.length-1); 

		System.out.println("\nSorted array is"); 
		printArray(arr); 
	} 
}
