package main.com.subha.program.sorting;

public class SelectionSortAlgo {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 89;
		numbers[1] = 48;
		numbers[2] = 28;
		numbers[3] = 5;
		numbers[4] = 7;
		System.out.println("Before sorting :");
		for (int x : numbers)
			System.out.println(x);

		for (int i = 0; i < numbers.length; i++) {
			int tempIndex = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[tempIndex])
					tempIndex = j;
			}
			int temp = numbers[i];
			numbers[i] = numbers[tempIndex];
			numbers[tempIndex] = temp;
		}

		System.out.println("After sorting :");
		for (int x : numbers)
			System.out.println(x);

	}

}
//Complexity : N(N-1)/2

