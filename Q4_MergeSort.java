package Assignment_2;

	import java.util.Scanner;

	// 4. WAP to sort an array using Merge Sort Algorithm.

	public class Q4_MergeSort{
	    public static void main(String[] args) {
	        // int[] arr = {2, 6, 1, 3, 7, 5};
	        int[] arr = new int[5];

	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the Numbers: ");

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scan.nextInt();
	        }

	        mergeSort(arr, 0, arr.length - 1);

	        System.out.println("The Merge Sorted Array is: ");
	        for (int ele : arr) {
	            System.out.print(ele + " ");
	        }
	    }

	    public static void mergeSort(int[] array, int low, int high) {
	        if (low < high) {
	            int mid = (low + high) / 2;
	            mergeSort(array, low, mid);
	            mergeSort(array, mid + 1, high);
	            merge(array, low, mid, high);
	        }
	    }

	    public static void merge(int[] array, int low, int mid, int high) {
	        int n1 = mid - low + 1;
	        int n2 = high - mid;

	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];

	        for (int i = 0; i < n1; i++) {
	            leftArray[i] = array[low + i];
	        }

	        for (int j = 0; j < n2; j++) {
	            rightArray[j] = array[mid + 1 + j];
	        }

	        int i = 0, j = 0, k = low;

	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                array[k] = leftArray[i];
	                i++;
	            } else {
	                array[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            array[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            array[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }
	}
