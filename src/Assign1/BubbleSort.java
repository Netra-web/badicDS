package Assign1;

public class BubbleSort {
	void bubblesort(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
	}
	void printArray(int arr[]) {
		
			int n=arr.length;
			for(int i=0;i<n;++i)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
		//Driver method to test above
		public static void main(String args[])
		{
			BubbleSort ob=new BubbleSort();
			int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
			ob.bubblesort(arr);
			System.out.println("Sorted array");
			ob.printArray(arr);
	
	}

}
