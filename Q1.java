package Assignment_2;

//1. WAP to find the duplicates present in an array.

public class Q1 {
	
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9};
	        
	        int length = array.length;
	        
	        System.out.println("Duplicate elements in the array:");
	        
	        // Compare each element with all the other elements
	        for (int i = 0; i < length; i++) {
	            for (int j = i + 1; j < length; j++) {
	                if (array[i] == array[j]) {
	                    System.out.println(array[i]);
	                    break;  // Break to avoid printing the same duplicate multiple times
	                }
	            }
	        }
	    }
	}

