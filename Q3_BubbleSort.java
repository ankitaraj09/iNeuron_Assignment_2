package Assignment_2;

import java.util.Scanner;

//3. WAP to sort an array using Bubble Sort Algorithm.

public class Q3_BubbleSort {
	
	public static void main(String[] args) {
		//int[] arr = {2, 6, 1, 3, 7, 5};
		int[] arr = new int [5];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Numbers: ");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();  

		}
		System.out.println("The Bubble Sorted Array is: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=1; j<arr.length-i; j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(int ele:arr)
		{
			System.out.print(ele + " ");
		}

	}

	}



