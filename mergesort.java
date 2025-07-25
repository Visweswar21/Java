
public class mergesort {
	   public void merge(int arr[], int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        // Create temp arrays
	        int[] L = new int[n1];
	        int[] R = new int[n2];

	        // Copy data to temp arrays
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[left + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[mid + 1 + j];

	        // Merge the temp arrays

	        int i = 0, j = 0;
	        int k = left; // Initial index of merged subarray

	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k++] = L[i++];
	            } else {
	                arr[k++] = R[j++];
	            }
	        }

	        // Copy remaining elements of L[]
	        while (i < n1) {
	            arr[k++] = L[i++];
	        }

	        // Copy remaining elements of R[]
	        while (j < n2) {
	            arr[k++] = R[j++];
	        }
	    }

	    // Main function that sorts arr[left..right] using merge()
	    public void mergeSort(int arr[], int left, int right) {
	        if (left < right) {
	            int mid = (left+right) / 2;

	            // Sort first and second halves
	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	            // Merge the sorted halves
	            merge(arr, left, mid, right);
	        }
	    }

	    // Print array utility
	    public void printArray(int[] arr) {
	        for (int num : arr)
	            System.out.print(num + " ");
	        System.out.println();
	    }

	    // Main method to run the sort
	    public static void main(String[] args) {
	        mergesort sorter = new mergesort();
	        int[] arr = {38, 27, 43, 3, 9, 82, 10};

	        System.out.println("Original array:");
	        sorter.printArray(arr);

	        sorter.mergeSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted array:");
	        sorter.printArray(arr);
	    }
	}


	