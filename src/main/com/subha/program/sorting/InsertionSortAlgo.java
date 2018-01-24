package main.com.subha.program.sorting;

public class InsertionSortAlgo {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 89;
		numbers[1] = 48;
		numbers[2] = 28;
		numbers[3] = 5;
		numbers[4] = 7;

		int n = numbers.length;
		System.out.println("Before sorting :");
		for (int x : numbers)
			System.out.println(x);

		for (int i = 0; i < n; i++) {
			int temp = numbers[i];
			int j = i;
			while (j > 0 && temp < numbers[j - 1]) {
				numbers[j] = numbers[j - 1];
				j = j - 1;
			}
			numbers[j] = temp;
		}
		System.out.println("After sorting :");
		for (int x : numbers)
			System.out.println(x);
	}

}

//Complexity = n^2
