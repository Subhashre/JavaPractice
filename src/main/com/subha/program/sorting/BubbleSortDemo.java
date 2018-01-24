package main.com.subha.program.sorting;

public class BubbleSortDemo {
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
		int temp = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length -i - 1; j++) {

				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting :");
		for (int x : numbers)
			System.out.println(x);
		
		
		System.out.println("String sorting ------------------");
		String[] ss = {"zebra","elephant","eagle","snake","crow"};
		System.out.println("Before sorting :");
		for (String x : ss)
			System.out.println(x);
		String temp1;
		for(int i = 0 ; i <ss.length-1 ;i++) {
			for(int j =0 ; j< ss.length - i -1 ; j++) {
				if(ss[j].compareTo(ss[j+1]) > 1) {
					temp1 = ss[j];
					ss[j] = ss[j+1];
					ss[j+1] = temp1;
				}
			}
		}
		System.out.println("After sorting :");
		for (String x : ss)
			System.out.println(x);
	}
}

//Complexity: 
//The complexity of bubble sort is 
//O(n^2) in both worst and average cases, 
//because the entire array needs to be iterated for every element.
