package Assignment_2;
import java.util.Scanner;

//2. WAP to sort an array using Quick Sort Algorithm.


	public class Q2_SortUsingQuickSort {
	    public static void main(String[] args) {
	        // int[] arr = {2, 6, 1, 3, 7, 5};
	        int[] arr = new int[5];

	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the Numbers: ");

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scan.nextInt();
	        }

	        quickSort(arr, 0, arr.length - 1);

	        System.out.println("The Quick Sorted Array is: ");
	        for (int ele : arr) {
	            System.out.print(ele + " ");
	        }
	    }

	    public static void quickSort(int[] array, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(array, low, high);
	            quickSort(array, low, pivotIndex - 1);
	            quickSort(array, pivotIndex + 1, high);
	        }
	    }

	    public static int partition(int[] array, int low, int high) {
	        int pivot = array[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (array[j] < pivot) {
	                i++;
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }

	        int temp = array[i + 1];
	        array[i + 1] = array[high];
	        array[high] = temp;

	        return i + 1;
	    }
	}


