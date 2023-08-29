package Assignment_2;



//5. WAP to sort an array using Selection Sort Algorithm.

public class Q5_SelectionSort {
	
	
	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
            {  
                if (arr[j] < arr[index])
                {  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    } 
	public static void main(String[] args) {
		int[] arr1 = {9,14,3,2,43,11,58,22};   
        for(int i:arr1)
        {  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);
        System.out.println("The Selection sorted array is: ");  
        
        for(int i:arr1)
        {  
            System.out.print(i+" ");  
        }  

	}

}