package main.com.subha.program.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//calculate the difference between maximum sum and minimum sum of (N-M) elements of the given array.
public class BubbleSortDemo1 {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 89;
		numbers[1] = 48;
		numbers[2] = 28;
		numbers[3] = 5;
		numbers[4] = 7;
		
		int N = numbers.length;
		int M = 3;
		int nm = N-M ;
		System.out.println("Before sorting :");
		for (int x : numbers)
			System.out.println(x);
		Arrays.sort(numbers);
		System.out.println("After sorting :");
		for (int x : numbers)
			System.out.println(x);
		int result = 0;
		int minSum = 0;
		int maxsum = 0;
		for(int i = 0; i < nm ;i++ )
			minSum += numbers[i];
		for(int i = N-1; i >= N-nm ;i-- )
			maxsum += numbers[i];
		
		result = maxsum - minSum ;
		System.out.println("Result : "+result);
	}

}
