
public class QuickSort {
	static void quicksort(int arr[],int low,int high) {
		if(low<high) {
		int pivotIndex=partition(arr,low,high);
		quicksort(arr,low,pivotIndex-1);
		quicksort(arr,pivotIndex+1,high);
	}	
	}
	private static int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
		}
	 static void printArray(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        }

public static void main(String[] args) {
	int[] nums= {5,2,9,1,6};
	int low=0;
	int high=nums.length-1;
	System.out.println("before sorting");
	QuickSort obj1=new QuickSort();
	obj1.printArray(nums);
	obj1.quicksort(nums,low,high);
	System.out.println("after sorting");
	obj1.printArray(nums);
	
}
}	        
		
		// TODO Auto-generated method stub

